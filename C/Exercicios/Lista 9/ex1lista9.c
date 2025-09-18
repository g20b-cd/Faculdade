#include <stdio.h>

void exibeMatriz(int matriz[][12], float *preco) {
    for (int i = 0; i < 6; i++) {
        printf("Valor no ano %d: %.2f\n", i + 1, preco[i]);
        for (int j = 0; j < 12; j++) {
            printf("Quantidade vendida no ano %d, mês %d: %d\n", i + 1, j + 1, matriz[i][j]);
        }
        printf("\n");  // Para separar os dados de cada ano
    }
}

int main() {
    int vendas[6][12];
    float preco[6];

    for (int i = 0; i < 6; i++) {
        printf("Insira o valor do carro no ano %d: ", i + 1);
        scanf("%f", &preco[i]);

        for (int j = 0; j < 12; j++) {
            printf("Insira a quantidade de carros vendidos no ano %d e no mês %d: ", i + 1, j + 1);
            scanf("%d", &vendas[i][j]);
        }
    }

    exibeMatriz(vendas, preco);

    return 0;
}

/*#include <stdio.h>
#include <string.h>

void exibeMatriz(int matriz[][12], float *preço){

    for(int i = 0; i < 6; i++){
        printf("Valor no ano %d %f\n", i+1, preço[i]);
        for(int j = 0; j < 12; j++){

            printf("Quantidade vendida por ano e mês\n\n %d%d\n", matriz[i][j]);
    
        }
    }
}



int main(){

    int vendas[6][12];
    float preço[6];
    for(int i = 0; i < 6; i++){

        printf("Insira o valor do carro no ano: %d", i+1);
        scanf("%f", preço[i]);

        for(int j=0; j < 12; j++){

            printf("Insira a quantidade de carro vendido no ano %d e no mes %d", i+1, j+1);
            scanf("%d %d", &vendas[i][j]);

        }
    }
    exibeMatriz(vendas, preço);

    return 0;
}*/