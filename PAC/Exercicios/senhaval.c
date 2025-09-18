#include <stdio.h>

int main(){

    int matricula, senha, validade, tentativas=3;
    for (validade=3; validade>=0 ;validade-=1){
        printf("Insira sua matricula\n");
        scanf("%d",&matricula);
        printf("Insira sua senha\n");
        scanf("%d",&senha);
        if(matricula==7892457 && senha==123321){
            printf("Seja bem vindo Anakin Skywalker\n");
            break;
        }
        else if(matricula==5425376 && senha==812837){
            printf("Seja bem vindo Leia\n");
            break;
        }
        else if(matricula==2736252 && senha==273625){
            printf("Seja bem vindo Luke Skywalker\n");
            break;
        }
        else{
            printf("Senha ou matricula invalida, tente novamente, %d tentativas restantes", tentativas);
            if(tentativas==0){
                printf("Acesso Bloqueado\n");
                }   
        }

    }
    return 0;
}
