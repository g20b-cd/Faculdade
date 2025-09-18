package p12017;

public abstract class Veiculo {

    String modelo;

    public Veiculo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String toString(){
        return modelo;
    }





    
}
