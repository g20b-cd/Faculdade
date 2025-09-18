package lista3;

public class Conta {

    private double saldo = 0;
    private Data datadeabertura;
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Data getDatadeabertura() {
        return datadeabertura;
    }
    public void setDatadeabertura(Data datadeabertura) {
        this.datadeabertura = datadeabertura;
    }
    
    public String getSaldoFormatado(){
        return String.format("%02d",saldo);
    }
    public void depositar(double deposito){
        saldo += deposito;
        System.out.println(saldo);
    }
    public void sacar(double saque){
        saldo -= saque;
        System.out.println(saldo);
    }
}

