package p12022;

public class Planta {
    private String nome;
    private String id;
    private double tamanho;

    public Planta(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public boolean equals(Object obj){

        if(this == obj) return true;
        else if(!(obj instanceof Planta)) return false;

        Planta outro = (Planta)obj;
        return this.id.equals(outro.id);

    }

    public double getTamanho(){
        return tamanho;
    }

    public String getNome(){
        return nome;
    }

    public String toString(){
        return "Id - " + id + "Tamanho - " + tamanho + "Nome - " + nome;
    

        
    }





}
