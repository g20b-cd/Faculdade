#include <stdio.h>
#include <string.h>

struct produtos{

    char nome[1000];
    int codigoproduto;
    int qntestoque;
    float pendente;

};

void ledados(struct produtos produtos[], int tamanho){ 

    printf("Insira o nome, codigo e a quantidade em estoque dos produtosz\n");
    for(int i =0; i < 20; i++){

        scanf(" %s", produtos[i].nome);
        scanf("%d", &produtos[i].codigoproduto);
        scanf("%d", &produtos[i].qntestoque);
        produtos[i].pendente = 0;
    }

}


void imprimedados(struct produtos produtos[], int tamanho){

    for(int i = 0; i < 20; i++){

        printf("Produto numero: %d\n", i + 1);
        printf(" %s\n", produtos[i].nome);
        printf("%d\n", produtos[i].codigoproduto);
        printf("%d\n", produtos[i].qntestoque);
        printf("Pendente: %f\n", produtos[i].pendente);

    }
}


int entradasaida(struct produtos produtos[], int tamanho){

    char auxnome[100];
    int auxcodigo;
    char s_e;
    int entrada, saida;
    float pendente;
    
    printf("Insira E para entrada e S para saida\n");
    scanf(" %c",&s_e);

    if(s_e == 'E' || s_e == 'e'){

        printf("Insira o nome e codigo do produto\n");
        scanf(" %s", auxnome);
        scanf("%d", &auxcodigo);
        
        for(int i = 0; i < 20; i++){
            if(auxcodigo == produtos[i].codigoproduto && strcmp(produtos[i].nome, auxnome) == 0){

                printf("Quanto vai entrar ?\n\n");
                scanf("%d", &entrada);
                produtos[i].qntestoque += entrada;
                printf("Entrada realizada com sucesso!\n");
                return;

            }
        }
    }

    else if(s_e == 'S' || s_e == 's'){

        printf("Insira o nome e codigo do produto\n");
        scanf("%s", auxnome);
        scanf("%d", &auxcodigo);
        for(int i = 0; i < 20; i++){

            if(auxcodigo == produtos[i].codigoproduto && strcmp(produtos[i].nome, auxnome) == 0){

                printf("Quanto vai sair ?\n\n");
                scanf("%d", &saida);
                produtos[i].qntestoque -= saida;
                if(produtos[i].qntestoque < 0){
                    produtos[i].pendente = -(produtos[i].qntestoque);
                    produtos[i].qntestoque = 0;
                }
                return;
            }
        }
    }

    else{
        printf("Movimentação não identificada\n\n");
        return;
    }
}

int main(){

    int tamanho = 20;
    char auxentradasaida[10];
    struct produtos produtos[20]; 
    ledados(produtos, tamanho);

    printf("Digite S para movimentação e N para prosseguir e imprimir os dados\n");
    scanf(" %c", auxentradasaida);

    if(auxentradasaida == 'S'|| auxentradasaida == 's'){
        while(1){
            entradasaida(produtos, tamanho);
            printf("Deseja realizar mais alguma entrada ou saida?\n");
            scanf(" %c", auxentradasaida);
            if(auxentradasaida == 'N'|| auxentradasaida == 'n'){
                break;
            }
        }
    }
    imprimedados(produtos, tamanho);
    return 0;
}
