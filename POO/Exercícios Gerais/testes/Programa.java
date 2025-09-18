package testes;

class Conta {
    String titular;
    double saldo;

    void depositar(double dinheiro) {
        if (dinheiro > 0) {
            saldo += dinheiro;
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Depósito Inválido");
        }
    }

    void sacar(double dinheiro) {
        if (saldo - dinheiro < 0) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= dinheiro;
            System.out.println("Saldo restante: " + saldo);
        }
    }

    void exibir() {
        System.out.println("Saldo disponível: " + saldo);
    }

    static float dobrarValor(float valor) {
        return valor * 2;
    }
}

public class Programa {

    static float dobrarValor1(float a) {
        return 2 * a;
    }

    static void TestaReferenciais() {
        Conta c1 = new Conta();
        c1.depositar(100);

        Conta c2 = c1;  // Referência compartilhada
        c2.depositar(200);

        System.out.print("c1 ");
        c1.exibir();
        System.out.print("c2 ");
        c2.exibir();
    }

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        float i = 500;

        minhaConta.titular = "Duke";
        minhaConta.saldo = 1000;
        minhaConta.exibir();

        minhaConta.depositar(2000);
        minhaConta.sacar(500);
        minhaConta.exibir();

        i = Conta.dobrarValor(i);
        System.out.println("Valor dobrado pela classe: " + i);

        i = dobrarValor1(i);
        System.out.println("Valor dobrado pela função na main: " + i);

        TestaReferenciais();
    }
}
