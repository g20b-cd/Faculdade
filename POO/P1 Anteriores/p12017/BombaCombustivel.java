package p12017;
import java.util.List;

public class BombaCombustivel {
    double qntlitros;
    double preço;
    double abastecido;

    public void completarTanque(Abastecivel y){

        while(y.abastecer(0.1)){

            qntlitros -= 0.1;
            preço += 0.1; 
            if(qntlitros == 0){

                System.out.println(preço*4.50);
                break;

            }
            abastecido += 0.1;
        }
        if(qntlitros > 0){

            System.out.println(qntlitros);
            System.out.println((preço * 10)); //10 reais simbólico

        }
    }

    public void AbastecerLista(List<Abastecivel> lista){

        for(Abastecivel s : lista){
            if(qntlitros < 0.1){
                System.out.println("Esgotada");
                break;
            }
        completarTanque(s);
        }
    }

    public double getQntlitros() {
        return qntlitros;
    }

    public void setQntlitros(double qntlitros) {
        this.qntlitros = qntlitros;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public double getAbastecido() {
        return abastecido;
    }

    public void setAbastecido(double abastecido) {
        this.abastecido = abastecido;
    }
    

}
