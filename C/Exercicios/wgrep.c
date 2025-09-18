#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {

    if (argc < 2) {
        printf("wgrep: searchterm [file ...]\n");
        exit(1);
    }

    char *search_term = argv[1];

    // Se nenhum arquivo for passado, lê da entrada padrão (stdin)
    if (argc == 2) {
        char line[1024];

        while (fgets(line, sizeof(line), stdin) != NULL) {
            if (strstr(line, search_term) != NULL) {
                printf("%s", line);
            }
        }

        exit(0);
    } else {

        for (int i = 2; i < argc; i++) {
            FILE *file = fopen(argv[i], "r");
            if (file == NULL) {
                printf("wgrep: cannot open file\n");
                exit(1); 
            }

            char line[1024];

            while (fgets(line, sizeof(line), file) != NULL) {
                if (strstr(line, search_term) != NULL) {
                    printf("%s", line);
                }
            }

            fclose(file);  // Fecha o arquivo
        }
        exit(0); 
    }
    return 0; 
}