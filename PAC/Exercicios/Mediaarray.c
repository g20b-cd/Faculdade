#include <stdio.h>
#include <math.h>
#include <string.h>

 float SOMA(float notas[], int tamanho){

    float soma = 0;
    for(int i = 0; i < tamanho; i++){
        soma += notas[i];
    }
    return soma;
}

int main(){

    int nnotas = 1;
    float media = 0;
    float notas[5] = {0};
    for(int i = 0; i < 5; i++){

         printf("Insira as %d notas do aluno\n", nnotas++);
         scanf("%f", &notas[i]);

    }

    media = SOMA(notas, 5) / 5;
    printf("A média é %f", media);

    return 0;
}