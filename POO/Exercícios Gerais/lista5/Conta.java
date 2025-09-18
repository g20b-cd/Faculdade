package lista5;

public class Conta {
    
    private int numero;
    private double saldo;
    private int limite;

    public void Deposita(double saldo){
        this.saldo += saldo;
    }

    public double getSaldo(){
        return saldo;
    }

}
