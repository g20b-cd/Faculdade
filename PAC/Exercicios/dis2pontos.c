#include <stdio.h>
#include <math.h>

float distanciaPontos(float x1, float x2, float y1, float y2){

    float distancia;
    distancia = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));
    return distancia;
}

int main(){

    int qntpontos;
    float distancia = 0;
    printf("Insira a quantidade de pontos\n");
    scanf("%d", &qntpontos);

    for(float coordenadas = 0; coordenadas < qntpontos; coordenadas += 1){

        float x1, x2, y1, y2;
        printf("Insira o valor das coordenadas para calculo da distancia\n");
        scanf("%f %f %f %f", &x1, &x2, &y1, &y2);
        distancia = distanciaPontos(x1, x2, y1, y2);

    }
    printf("A distancie e %.2f.\n", distancia);

    return 0;
}