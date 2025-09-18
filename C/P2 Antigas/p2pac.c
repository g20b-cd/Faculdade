#include <string.h>
#include <stdio.h>

struct livros{

    char isbn[30];
    char titulo[30];
    char autorprincipal[30];

};

int buscaLivro(struct livros livros[], int qtelementos, char titulo[]){

    for(int i = 0; i < qtelementos; i++){

        if(strcmp(livros[i].titulo, titulo) == 0){
            return i;
        }

    }

    return -1;

}

void descobreTitulos(struct livros livros[], int qtelementos, char titulo[]){

    char auxautor[30] = {};

    for(int i = 0; i < qtelementos; i++){

        if(strcmp(livros[i].titulo, titulo) == 0){
            strcpy(auxautor ,livros[i].autorprincipal);
            break;
        }
    }    

    if(strcmp(auxautor, "") == 0){
    printf("Livro não encontrado");
    
    }
    else{
        for(int i = 0; i < qtelementos; i++){

            if(strcmp(livros[i].autorprincipal, auxautor) == 0){
                printf(" %s", livros[i].titulo);
            }
        }
    }
}

int main(){

// Exemplo de array de livros
    struct livros biblioteca[5] = {
        {"123", "Livro A", "Autor X"},
        {"456", "Livro B", "Autor Y"},
        {"789", "Livro C", "Autor X"},
        {"101", "Livro D", "Autor Z"},
        {"112", "Livro E", "Autor X"}
    };

    // Título que estamos procurando
    char tituloProcurado[30] = "Livro A";

    // Chamando a função para descobrir os títulos
    descobreTitulos(biblioteca, 5, tituloProcurado);

    return 0;
}