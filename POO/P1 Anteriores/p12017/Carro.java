package p12017;

public class Carro extends Veiculo implements Abastecivel{

    private double tamanhoTanque;
    private double qntAtual;

    public Carro(String modelo, double tamanhoTanque){
        super(modelo);
        this.tamanhoTanque = tamanhoTanque;}

    public double getTanque(){
        return tamanhoTanque;
    }

    public double getQntAtual() {
        return qntAtual;
    }

    public void setQntAtual(double qntAtual) {
        this.qntAtual = qntAtual;
    }

    public boolean abastecer(double litros){
        tamanhoTanque = (tamanhoTanque * 0.99);
        if(qntAtual + litros > tamanhoTanque){
             return false;
        }
        else{
            qntAtual += litros;
            return true;
        }
    }   
    

}
