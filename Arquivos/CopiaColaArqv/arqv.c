#include <stdio.h>

int main(int argc, char* argv[]){

    FILE *entrada, *saida;
    if(argc != 3){
        printf("Uso: %s arquivo_entrada arquivo_saida\n", argv[0]);
    }

    entrada = fopen(argv[1], "rb");
    saida = fopen(argv[2], "wb");

    if(!entrada || !saida){
        perror("Error ao abrir arquivo");
    }

    /*Mesma coisa que escrever
    if (in == NULL || out == NULL) {
    perror("Erro ao abrir arquivo de entrada");
    return 1; */

    int c;
    while((c = fgetc(entrada)) != EOF){
        fputc(c,saida);
        printf("Caractere %d foi copiado",c);
    }
    fclose(saida);
    fclose(entrada);

    return 0;
}