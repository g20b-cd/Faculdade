#include <stdio.h>

int main(int argc, char* argv[]){

    FILE *entrada, *saida;
    entrada = fopen(argv[1], "rb");
    saida = fopen(argv[2], "wb");
    char buffer[4096];

    if(argc != 3){
        printf("Uso correto: %s arquivo_entrada arquivo_saida\n", argv[0]);
        return 1;
    }

    if(entrada == NULL || saida == NULL){
        perror("Diretório não encontrado");
        return 1;
    }

    size_t bytesLidos;
    while((bytesLidos = fread(buffer, 1, sizeof(buffer), entrada)) > 0){
        fwrite(buffer, 1, bytesLidos, saida);  // escreve apenas os bytes lidos
    }
    
    printf("Arquivo copiado com sucesso");

    fclose(entrada);
    fclose(saida);
    return 0;

}

