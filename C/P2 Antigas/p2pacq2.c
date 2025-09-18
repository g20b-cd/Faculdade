#include <string.h>
#include <stdio.h>

int indiceFederação(char ufs[][3], char sigla[]){

    for(int i = 0; i < 27; i++){
        if(strcmp(ufs[i], sigla) == 0){
            return i;
        }
    }
    return -1;
}

void leDados(int anopfederacao[][27], char ufs[][3]){

    float peso;
    char uf[3];
    int ano;

    while(1){
        
        printf("Insira o ano de 2010 a 2023");
        scanf("%d", &ano);
        if(ano < 2010 || ano > 2023){
            printf("Ano invalido");
            continue;
        }
        printf("Insira a UF");
        scanf(" %s", uf);
        int indiceuf = indiceFederação(ufs, uf);
        if(indiceuf == -1){
            printf("UF invalida");
            break;
        }
        printf("Insira o peso do baby");
        scanf("%f", &peso);
        if(peso < 2500){

            int anoaux = ano - 2010;
            anopfederacao[anoaux][indiceuf]++;
        }
    }
}

void apresentaDadosAno(int anopfederacao[][27], char ufs[][3], int ano){

    int anoaux = ano - 2010;
    for(int i = 0; i < 27; i++){

        printf(" %d%d", anopfederacao[anoaux][i]);
        printf(" %s", ufs[i][3]);
    }
}

void apresentaDadosFederacao(int anopfederacao[][27], char ufs[][3], char uf[3]){

    char auxuf = indiceFederação(ufs, uf);
    int totalgeral = 0;
    if(auxuf != -1){

        for(int i = 0; i < 14; i++){

            printf("Numero por uf %d%d", anopfederacao[i + 2010][auxuf]);
            totalgeral += anopfederacao[i + 2010][auxuf];

        }
        printf("Totalgeral: %d por %c", totalgeral, uf);
    }
    else{
        printf("Invalido");
    }
}


int main(){
    
     char ufs[][3] = {
        "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA",
        "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN",
        "RS", "RO", "RR", "SC", "SP", "SE", "TO"
    };

    int matriz[][27] = {0};
    lerDados(matriz, ufs);

    int ano;
    char uf[3];

    printf("Digite o ano para ver os nascidos abaixo do peso: ");
    scanf("%d", &ano);
    exibirDadosPorAno(matriz, ufs, ano);

    printf("Digite a UF para ver os nascidos abaixo do peso por ano: ");
    scanf(" %s", uf);
    exibirDadosPorUF(matriz, ufs, uf);

    return 0;

}