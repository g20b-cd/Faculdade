#include <stdio.h>

int main(){

    float media, soma = 0;
    int qntNumeros;
    printf("Insira a quantidade de numeros que utilizara para fazer a media:\n");
    scanf("%d",&qntNumeros);
    if(qntNumeros <= 0){
        printf("Quantidade invalida\n");
        return 1;
    }
    else {
        printf("Insira os numeros em ordem\n");
        for(int numeros = 0; numeros < qntNumeros; numeros += 1){
            float numeros2;
            printf("Insira o %d numero\n", numeros + 1);
            scanf("%f", &numeros2);
            soma += numeros2;
        }
        media = soma/qntNumeros;
        printf("A media e de: %.2f", media);
    }
    
    return 0;
}

