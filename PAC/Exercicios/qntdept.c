#include <math.h>
#include <stdio.h>

int main(){
    float populacao, deputadosf;
    printf("Insira a populcao do seu respectivo estado");
    scanf("%f", &populacao);
    //quantidade a ser calculada
    deputadosf = ((populacao*513)/190755799);

        if(deputadosf<=8){
            printf("O seu estado possui 8 deputados a serem elegidos");
}
        else if(deputadosf>=8 && deputadosf<=70){
            printf("O numeros de deputados sera %2.f\n",deputadosf);
}
        else{   
            printf("O pais tera 70 deputados\n"); 
}
return 0;
}