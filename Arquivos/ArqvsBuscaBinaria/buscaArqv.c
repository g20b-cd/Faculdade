#include <stdio.h> 
#include <string.h>

typedef struct _Endereco Endereco;

struct _Endereco
{
	char logradouro[72];
	char bairro[72];
	char cidade[72];
	char uf[72];
	char sigla[2];
	char cep[8];
	char lixo[2]; // Ao Espaço no final da linha + quebra de linha
};

int main(int argc,char**argv ){

    if(argc != 2){
        fprintf(stderr, "Argumentos insuficientes, não esqueça de inserir o CEP");
        return 1;
    }

    FILE *arqv = fopen("cep_ordenado.dat", "rb");
    Endereco e;

    if(!arqv) {
        perror("Erro ao abrir arquivo");
        return 1;
    }

    fseek(arqv,0,SEEK_END);
    long size = ftell(arqv);
    long int tamanhoReal = size/sizeof(Endereco); //trabalhar com endereços e nn com tamanho do arqv
    long int fim = tamanhoReal - 1;
    long int inicio = 0;
    
    int c = 0;
    while(inicio <= fim){
        c++;
        long int meio = (fim+inicio)/2;
        fseek(arqv, meio * sizeof(Endereco), SEEK_SET); //novamente trabalhando com endereços e nn com arqv em bytes
        fread(&e, sizeof(Endereco),1,arqv);

        if(strncmp(argv[1], e.cep, 8)==0){
			printf("%.72s\n%.72s\n%.72s\n%.72s\n%.2s\n%.8s\n",e.logradouro,e.bairro,e.cidade,e.uf,e.sigla,e.cep);
			break;
		}

        else if(strncmp(argv[1], e.cep, 8) < 0){
            fim = meio - 1;
        }
        else inicio = meio + 1;;
    }
    printf("Contador %d", c);

    fclose(arqv);
    return 0 ;
}