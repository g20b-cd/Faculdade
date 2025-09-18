package lista5;

public class ContaCorrente extends Conta implements Tributaveis {

    public double CalculaTributavel(){
        return ((getSaldo()*0.01) + 42);
    }
}
