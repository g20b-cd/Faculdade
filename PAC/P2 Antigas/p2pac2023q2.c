#include <stdio.h>

float calculaMedia(float somaTransacoesNormais, int numTransacoesNormais) {
    if (numTransacoesNormais == 0) return 0;
    return somaTransacoesNormais / numTransacoesNormais;
}

int main() {
    
    float transacao, media = 0.0, somaTransacoesNormais = 0.0;
    int contador = 0, transacoesNormais = 0, transacoesSuspeitas = 0;

    while (1) {
        printf("Entre com o valor da transacao: ");
        scanf("%f", &transacao);

        contador++;
        if (contador == 1) {//caso especial

            printf("Normal\n");
            somaTransacoesNormais += transacao;
            transacoesNormais++;
            media = transacao;
            continue;
        }

        media = calculaMedia(somaTransacoesNormais, transacoesNormais);

        if (transacao <= 1.5 * media) {
            printf("Normal\n");
            somaTransacoesNormais += transacao;
            transacoesNormais++;
        } else if (transacao > 1.5 * media && transacao <= 2 * media) {

            printf("Suspeita\n");
            transacoesSuspeitas++;
        } else if (transacao > 2 * media) {
            printf("Bloqueada\n");
            break; 
        }
    }

    printf("Média normais: %f\n", calculaMedia(somaTransacoesNormais, transacoesNormais));
    printf("Número normais: %d\n", transacoesNormais);
    printf("Número suspeitas: %d\n", transacoesSuspeitas);

    return 0;
}
