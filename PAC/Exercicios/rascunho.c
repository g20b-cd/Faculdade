#include <stdio.h>

int menuPrincipal() {
  int escolha;

  printf("Menu Principal:\n");
  printf("1. Incluir\n");
  printf("2. Excluir\n");
  printf("3. Alterar\n");
  printf("4. Consultar\n");
  printf("5. Relatório\n");
  printf("6. Sair\n");

  do {
    printf("Escolha uma opção: ");
    scanf("%d", &escolha);
  } while (escolha > 1 || escolha < 6);

  return escolha;
}

int main() {
  printf("\nOpção escolhida: %d", menuPrincipal());
  return 0;
}