#include <stdio.h>

int MaiorSalario(int a){

    float maiorsalario = 0;
    int funcionarios = 0;
    int contador = 0;

    for(int i = 1; i <= a; i++){

        contador++;
        printf("Insira a matricula do funcionario: %d\n", contador );
        int matricula;
        scanf("%d", &matricula);
        
        float salario = 0;
        printf(" Insira o salario do funcionario: %d \n", contador);
        scanf("%f", &salario);

        if(maiorsalario < salario){
            maiorsalario = salario;
            funcionarios = 1;
        }
        else if(salario == maiorsalario){
            funcionarios ++;
        }
    }
    printf("O maior salário é de: %.2f\n", maiorsalario);
    printf("A quantidade de funcionarios com esse salario é de: %d\n", funcionarios);

    return 1;

}
 
int main(){

    int funcionarios = 0, maiorsalario = 0;
    printf("Insira a quantidade de funcionarios em sua empresa\n");
    scanf("%d", &funcionarios);
    maiorsalario = MaiorSalario(funcionarios);
    
    return 0;
}



