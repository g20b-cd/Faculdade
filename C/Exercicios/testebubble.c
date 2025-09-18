#include <stdio.h>
#include <string.h>

void bubble(char nomes[][100], int qt) {
    for (int ultimo = qt - 1; ultimo >= 0; ultimo--) {
        for (int i = 0; i < ultimo; i++) {
            if (strcmp(nomes[i], nomes[i + 1]) > 0) {
                char aux[100];
                strcpy(aux, nomes[i]);
                strcpy(nomes[i], nomes[i + 1]);
                strcpy(nomes[i + 1], aux);
            }
        }
    }
}

int main() {
    char nomes[5][100] = {"Maria", "Ana", "Pedro", "João", "Carlos"};
    int qt = 5;

    bubble(nomes, qt);

    printf("Nomes ordenados:\n");
    for (int i = 0; i < qt; i++) {
        printf("%s\n", nomes[i]);
    }

    return 0;
}
