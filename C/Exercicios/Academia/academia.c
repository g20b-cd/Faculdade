#include <stdio.h>
#include <string.h>

struct alunos{

    char nome[100];
    int idade;
    float peso;
    float altura;
    char atividade[30];
    float imc;

};

void leDados(struct alunos alunos[]){

    for(int i = 0; i < 201; i++){
        
        printf("Nome\n");
        scanf("%s", alunos[i].nome);
        printf("Idade\n");
        scanf("%d", &alunos[i].idade);
        printf("Peso\n");
        scanf("%f", &alunos[i].peso);
        printf("Altura\n");
        scanf("%f", &alunos[i].altura);
        printf("Atividade\n");
        scanf("%s", alunos[i].atividade);
        alunos[i].imc = 0;
    }

}

void imprimeDados(struct alunos alunos[]){

    char aux[10]; 
    char nomeaux[100];
    printf("Gostaria de imprimir os dados de algum aluno? Sim ou Não\n");
    scanf("%s", aux);

    if(strcmp(aux,"Sim") == 0){

        printf("Insira o nome do Aluno\n");
        scanf(" %s", nomeaux);
        for(int i = 0; i < 201; i++){

            if(strcmp(nomeaux, alunos[i].nome)==0){

                printf("Nome: %s\n", alunos[i].nome);
                printf("Idade: %d\n", alunos[i].idade);
                printf("Peso: %f\n", alunos[i].peso);
                printf("Altura: %f\n", alunos[i].altura);
                printf("Atividade %s\n"), alunos[i].atividade;
                
            }
            else{
                printf("Nome desconhecido");
            }
        }    
    }
    else{
        return;
    }
}

void ordenaNomes(struct alunos alunos[]){

    char aux[100];
    int n = 201;
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (strcmp(alunos[i].nome, alunos[j].nome) > 0){
                strcpy(aux, alunos[i].nome);
                strcpy(alunos[i].nome, alunos[j].nome);
                strcpy(alunos[j].nome, aux);
            }
        }
    }
}

void geraRelatorio(struct alunos alunos[]){

    for(int i = 0; i < 201; i++){

        printf("Nome: %s\n", alunos[i].nome);
        printf("Idade: %d\n", alunos[i].idade);
        printf("Peso: %f\n", alunos[i].peso);
        printf("Altura: %f\n", alunos[i].altura);
        printf("Atividade %s\n", alunos[i].atividade);
        alunos[i].imc = (alunos[i].peso/(alunos[i].altura * alunos[i].altura));
        
    }
}

int main(){

    struct alunos alunos[201];
    leDados(alunos);
    ordenaNomes(alunos);
    imprimeDados(alunos);
    geraRelatorio(alunos);

    return 0;
}