package p2202201;

public class CorpoCeleste {
    String id;
    String nome;
    double Distancia;

    public CorpoCeleste(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDistancia() {
        return Distancia;
    }

    public void setDistancia(double distancia) {
        Distancia = distancia;
    }

    public boolean equals(Object o){
        if(o instanceof CorpoCeleste){
            CorpoCeleste c = (CorpoCeleste) o;
            return this.id.equals(c.id);
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "ID: " + id + " - Nome: " + nome + " - Distancia: " + Distancia;
    }
    
}
