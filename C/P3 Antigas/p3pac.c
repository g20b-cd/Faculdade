#include <stdio.h>
#include <string.h>
#include <math.h>

struct _candidatos{

    char nome[100];
    int matricula;
    float ptitulo;
    float pescrita;
    float paula;
    float media;

};

int leDados(struct _candidatos candidatos[]){

    int qtcandidatos = 0;
    for(int i = 0; i < 100; i++){

        printf("Insira a matricula desejada");
        scanf("%d", &candidatos[i].matricula);

        if(candidatos[i].matricula == 0){
            printf("Leitura finalizada");
            break;
        }

        printf("Insira o nome do candidato");
        scanf(" %s", candidatos[i].nome);
        candidatos[i].pescrita = 0;
        candidatos[i].paula = 0;
        printf("Insira a nota da prova de titulo");
        scanf("%f", &candidatos[i].ptitulo);
        qtcandidatos++;
    }

    return qtcandidatos;

}

void lepEscrita(struct _candidatos candidatos[], int n){

    for(int i = 0; i<n; i++){

        printf("Candidato: %s", candidatos[i].nome);
        printf("Matricula: %d", candidatos[i].matricula);
        printf("Insira a nota %f da prova de escrita");
        scanf("%f", &candidatos[i].pescrita);
        if(candidatos[i].pescrita < 5){
            candidatos[i].pescrita = 0;
            candidatos[i].paula = 0;
            candidatos[i].ptitulo = 0;
        }
    }
}

void ordenarpnotasEscritas(struct _candidatos candidatos[],int n){

    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (candidatos[i].pescrita < candidatos[j].pescrita) {
                struct _candidatos temp = candidatos[i];
                candidatos[i] = candidatos[j];
                candidatos[j] = temp;
            }
        }
    }
}

void exibirClassificados(struct _candidatos candidatos[], int n){

    for(int i = 0; i < n; i++){

        if(candidatos[i].pescrita != 0){

            printf("Classificado %s", candidatos[i].nome);
        }
        else{
            printf("Eliminado %s", candidatos[i].nome);
        }
    }
}

void lepAula(struct _candidatos candidatos[], int n){

    for(int i = 0; i < n; i++){

        if(candidatos[i].pescrita != 0){

            printf("Candidato Qualificado");
            printf("Candidato: %s", candidatos[i].nome);
            printf("Matricula: %d", candidatos[i].matricula);
            printf("Insira a nota %f da prova de escrita");
            scanf("%f", &candidatos[i].paula);

        }
    }
}
void mediaPonderada(struct _candidatos candidatos[], int n){

    float mediaponderada = 0;
    for(int i = 0; i < n; i++){

        candidatos[i].media = ((candidatos[i].ptitulo * 2) + (candidatos[i].paula * 4) + (candidatos[i].pescrita * 4))/10;
    }
}

void exibeResultado(struct _candidatos candidatos[], int n){

    for(int i = 0; i < n; i++){
        if(candidatos[i].media > 0){

            printf(" %s, %d, %f", candidatos[i].nome, candidatos[i].matricula, candidatos[i].media);
        }
        else{
            printf("Eliminado %s %d %f", candidatos[i].nome, candidatos[i].matricula, candidatos[i].media);
        }
    }
}


int main(){

    struct _candidatos candidatos[100];
    int qtcandidatos = leDados(candidatos);
    lepEscrita(candidatos, qtcandidatos);
    ordenarpnotasEscritas(candidatos, qtcandidatos);
    exibirClassificados(candidatos, qtcandidatos);
    lepAula(candidatos, qtcandidatos);
    mediaPonderada(candidatos, qtcandidatos);
    exibeResultado(candidatos, qtcandidatos);


return 0;

}
