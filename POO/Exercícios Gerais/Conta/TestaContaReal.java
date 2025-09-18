package Conta;
import java.util.Scanner;

class Conta {
    String titular;
    int ndaconta;
    String agencia;
    float saldo;
    String dataab;

    void sacarDinheiro(float valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Saldo restante: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    void depositarDinheiro(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Depósito inválido.");
        }
    }

    void rendimento() {
        System.out.println("Rendimento estimado: " + (saldo * 0.1));
    }

    void recuperaDadosImpressao() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + ndaconta);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Data de criação: " + dataab);
    }
}

class TestaContaReal {

    void dadosIniciais(Conta myConta) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome:");
        myConta.titular = sc.nextLine();

        System.out.println("Número da conta:");
        myConta.ndaconta = sc.nextInt();
        sc.nextLine();  // Consumir quebra de linha

        System.out.println("Agência:");
        myConta.agencia = sc.nextLine();

        System.out.println("Saldo:");
        myConta.saldo = sc.nextFloat();
        sc.nextLine();  // Consumir quebra de linha

        System.out.println("Data de criação:");
        myConta.dataab = sc.nextLine();
    
    }

    public static void main(String[] args) {
        Conta myConta = new Conta();
        TestaContaReal contaReal = new TestaContaReal();

        contaReal.dadosIniciais(myConta);

        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Sacar dinheiro");
            System.out.println("2 - Depositar dinheiro");
            System.out.println("3 - Consultar rendimento");
            System.out.println("4 - Mostrar dados da conta");
            System.out.println("5 - Sair");

            x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Digite o valor para saque:");
                    float saque = sc.nextFloat();
                    myConta.sacarDinheiro(saque);
                    break;
                case 2:
                    System.out.println("Digite o valor para depósito:");
                    float deposito = sc.nextFloat();
                    myConta.depositarDinheiro(deposito);
                    break;
                case 3:
                    myConta.rendimento();
                    break;
                case 4:
                    myConta.recuperaDadosImpressao();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (x != 5);

        sc.close();
    }
}
