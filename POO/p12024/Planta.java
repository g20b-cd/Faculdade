package p12024;

public class Planta {
    private String id;
    private String nome;
    private double tamanho;

    public Planta(String id){
        this.id = id;
    }

    public String toString(){
        return "Id" + id + "Nome" + nome + "Tamanho" + tamanho; 
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Planta)) return false;

        Planta outro = (Planta) obj;
        return this.id.equals(outro.id);
    }

    public double getTamanho(){
        return tamanho;
    }
    public String getId(){
        return id;
    }

}
