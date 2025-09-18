package p12017;

public class Moto extends Veiculo implements Abastecivel {
    
    private final double tamanhoTanque;
    private double qntAtual;

    public Moto(String modelo, double tamanhoTanque){
        super(modelo);
        this.tamanhoTanque = tamanhoTanque;
    }

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
        if(qntAtual + litros > tamanhoTanque){
            return false;
        }
        else{
            qntAtual += litros;
            return true;
        }
    }

}


