#include <math.h>
#include <stdio.h>

void leMatriz(int qntvendida[31][4], float valorpdia[31][4]){

    for(int i = 0; i < 31; i++){

        printf("Dia %d\n", i+1);
        for(int j = 0; j < 4; j++){

            printf("Insira a quantidade vendida do %d combustivel\n", j + 1);
            scanf("%d"), &qntvendida[i][j];
            printf("Insira o valor do %d combustivel nesse dia\n", j + 1);
            scanf("%f", &valorpdia[i][j]);

        }
    }
}

void valorFinal(int qntvendida[31][4], float valorpdia[31][4], float *valortotalfinal, int *totalvendido, float *valortotalpdia){

    for(int i = 0; i < 31; i++){
        for(int j = 0; j < 4; j++){

            *totalvendido += qntvendida[i][j];
            *valortotalpdia += valorpdia[i][j];
            *valortotalfinal += valorpdia[i][j] * qntvendida[i][j];
            
        }
    }
}

int main(){

    int qntvendida[31][4];
    float valorpdia[31][4];
    float valortotalfinal = 0;
    int totalvendido = 0;
    float valortotalpdia = 0;
    leMatriz(qntvendida, valorpdia);
    valorFinal(qntvendida, valorpdia, &valortotalfinal, &totalvendido, &valortotalpdia);
    printf("%f\n", valortotalpdia);
    printf("%d\n", totalvendido);
    printf("%f\n", valortotalfinal);

    return 0;
}