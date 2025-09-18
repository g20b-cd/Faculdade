#include <stdio.h>
#include <math.h>
//Letra A
int quadPerfeito(int n){

    int k = pow(n, 0.5);
    if(k > 1 &&  k < n){

        return 1;

    }
    else{
        return 0;
    }

    return 0;
}   

int main(){

    float n;
    printf("Insira um numero");
    scanf("%f", &n);
    n = quadPerfeito(n);

    if(n == 1){
        printf("Quadrado perfeito");
    }
    else{
        printf("Não é quad perfeito");
    }
    return 0;
}
//Letra B

#include <stdio.h>

int MDC(int a, int b) {
    // Teorema de Euclides
    int resto = 0;
    printf("Divisores comuns:\n");
    while (b != 0) {
        resto = a % b;
        a = b;
        b = resto;
        if (b != 0) {
            printf("%d\n", a); // Imprime o divisor comum atual
        }
    }              
    return a; // Retorna o MDC
}

int main() {
    printf("Insira dois numeros:\n");
    int num1 = 0, num2 = 0;
    scanf("%d,%d", &num1, &num2);
    int divisorComum = MDC(num1, num2);
    printf("Maior divisor é: %d\n", divisorComum);
    return 0;
}

//Letra C

#include <stdio.h>

int Mediana(int a, int b, int c) {
    if ((a < b && b < c) || (a > b && b > c)) {
   
   return b;
    }
    if((b > a && a > c ) || (a > b && c > a)){
        return a;
    }
    else{
        return c;
    }
}

int main() {
    int num1 = 0, num2 = 0, num3 = 0, mediana = 0;
    printf("Insira 3 numeros:\n");
    scanf("%d %d %d", &num1, &num2, &num3);
    mediana = Mediana(num1, num2, num3);
    printf("Mediana é %d", mediana);
    return 0;
}

//letra D

#include <stdio.h>

int anoBissexto(int ano){

    return(ano % 4 == 0) && ((ano % 100 != 0) || (ano%400==0));
}

int dataValida(int dia, int mes, int ano){

    if(ano == 0){
        return 0;
    }

    if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

        if(dia <= 31){
            return 1;
        } 
        else{
            return 0;
        }   
    }
    else if ( mes == 4 || mes == 6 || mes == 9 || mes == 11 ){

        if((dia <= 30)){
            return 1;
        }
        else{
            return 0;
        }
    }
    else if(mes == 2){
        if (anoBissexto(ano)== 1){
            if( dia <= 29){
                return 1;
            }
            else{
                return 0;
            }
        }
        else if (dia <= 28){
            return 1;
        }
        else {
            return 0;
        }       
    }
}


int main(){

    int dia, mes, ano;
    printf("Insira o dia, mes e ano");
    scanf("%d %d %d", &dia, &mes, &ano);
    int datavalida = dataValida(dia, mes, ano);
    if(datavalida == 1){
        printf("Data valida");
    }  
    else{
        printf("Data invalida");
    } 
    
    return 0;
}




    





