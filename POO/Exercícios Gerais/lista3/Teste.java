package lista3;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Data x = new Data();
        Conta y = new Conta();
        Scanner  scanner = new Scanner(System.in);
        int a;
         do {
            System.out.println("Escolha o que quer efetuar");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            System.out.println("3 - Visualizar");
            System.out.println("4 - Sair");
            a = scanner.nextInt(); // Correção na chamada do nextInt

            if(a == 1) {
                System.out.println("Digite o valor que quer sacar");
                double b = scanner.nextDouble(); // Correção no nextDouble
                y.sacar(b);
            }
            if(a == 2) {
                System.out.println("Digite o valor que quer depositar"); // Corrigi mensagem (era "sacar")
                double b = scanner.nextDouble();
                y.depositar(b);
            }
            if(a == 3) {
                System.out.println("Dados da conta");
                System.out.println(y.getSaldo()); 
                System.out.println(x.getDatadeaberturaFormatada()); 
            }
        } while(a != 4);
        scanner.close();
    }
}

