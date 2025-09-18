package testes;
import java.util.Scanner;

class TabelaMultiplicacao {

    // Função recursiva para calcular o fatorial
    static long calcularFatorial(long j) {
        if (j == 1 || j == 0) {
            return 1; // Caso base
        }
        return j * calcularFatorial(j - 1); // Passo recursivo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tabela de multiplicação
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(); 
        }

        // Cálculo do fatorial
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            System.out.println("O fatorial de " + numero + " é: " + calcularFatorial(numero));
        }

        scanner.close();
    }
}
/* Anotações:
    Public Static Void Main(String[] args) é a main
    static valor nome é uma função
    class name é uma classe, uma classe começa com letra maiscula, String é uma classe
    
 */