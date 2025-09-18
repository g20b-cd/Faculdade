#include <stdio.h>
#include <string.h>

void leDadosCargos(char cargos[][30], float notasminimas[][2]){

    for(int i = 0; i < 20; i++){
        printf("Insira o nome do cargo");
        scanf(" %s", cargos[i]);

        for(int j = 0; j < 2; j++){
            printf("Insira a nota minima do cargo");
            scanf("%f", &notasminimas[i][j]);
        }
    }
}

int calculaNotaFinal(float *nmfinal ,float nmtitulo, float nmespecificas){

    float nota, soma = 0;
    int zeros = 0;
    int abaixomedia = 0;
    for(int i = 0; i < 5; i++){

        printf("Insira a nota da prova %d", i + 1);
        scanf("%f", &nota);
        if(nota = 0){
            zeros++;
        }
        if(i == 0 && nota < nmtitulo){
            abaixomedia++;
        }
        if(i > 0 && nota < nmespecificas){
            abaixomedia++;
        }
        soma += nota;
        if(abaixomedia || zeros > 0){
            *nmfinal = 0;

        }
        else{
            *nmfinal = soma/5;
        }
    }
    return zeros;
}

int buscaSequencial(char cargo[][30], char procurado[]){

    for(int i = 0; i < 20; i++){
        if(strcmp(cargo[i], procurado)==0){
            printf("Cargo valido");
            return i;
        }
    }
    return -1;

}

/*int buscaSequencial(char cargo[][30], char procurado[]){

    for(int i = 0; i < 20; i++){
        if(strcmp(cargo[i][30], procurado)==0){
            printf("Cargo valido");
            return i;
        }
    }
    return -1;
Como se estivesse acessando apenas ai-nesima posição no [30].
}*/

int main(){

    char candidatonome;
    float nmtitulo, nmespecificas;
    char cargos[20][30], cargoprocurado[30];
    int notas[20][2];
    float nmfinal;
    printf("Nome do candidato");
    scanf(" %s", candidatonome);
    printf("Nota minima titulo");
    scanf("%f", &nmtitulo);
    printf("Nota minima especificas");
    scanf("%f", &nmespecificas);
    printf("Cargo procurado");
    scanf(" %s", cargoprocurado[30]);
    leDadosCargos(cargos, notas);
    calculaNotaFinal(&nmfinal, nmtitulo, nmespecificas);
    buscaSequencial(cargos, cargoprocurado);
}