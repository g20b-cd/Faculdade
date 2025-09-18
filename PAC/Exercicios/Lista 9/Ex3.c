#include <stdio.h>  
#include <string.h>

struct aluno{

  char nome[50];
  int age;
  float notap1;
  float notap2;
  float mediaind;

};

void ExibeTipo(struct aluno alunos[], float mediaturma, int qntalunos){

  for(int i = 0; i < qntalunos; i++){
    printf("Média da Turma: %f", mediaturma);
    printf("Nome: %s\n", alunos[i].nome);
    printf("Média: %f\n", alunos[i].mediaind);
    if(alunos[i].mediaind > mediaturma){
      printf("Você está acima da média da turma\n\n");
    }
    else if(alunos[i].mediaind == mediaturma){
      printf("Você está no nivel da turma\n\n");
    }
    else{
      printf("Você está abaixo da média da turma\n\n");
    }
  }
}

int main(void){

  float mediadaturma = 0;
  int n = 0;
  printf("Insira a quantidade de alunos\n");
  scanf("%d", &n);
  struct aluno alunos[n];
  
  for(int i = 0; i < n; i++){

    printf("Insira o nome do %d aluno\n", i + 1);
    scanf("%s", alunos[i].nome);
    printf("Insira a nota da P1 do %d aluno\n", i + 1);
    scanf("%f", &alunos[i].notap1);
    printf("Insira a nota da P2 do %d aluno\n", i + 1);
    scanf("%f", &alunos[i].notap2);
    alunos[i].mediaind = (alunos[i].notap1 + alunos[i].notap2) / 2;
    mediadaturma += alunos[i].mediaind;
  }
  mediadaturma = mediadaturma / n;
  ExibeTipo(alunos, mediadaturma, n);

 return 0;

  
}