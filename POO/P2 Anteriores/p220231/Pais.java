package p220231;
import java.util.List;
import java.util.ArrayList;


public class Pais {
    String tag;
    String nome;
    int população;
    double km;
    List<Pais> fronteira = new ArrayList<Pais>();

    public Pais(String tag){
        this.tag = tag.toUpperCase();
    }
    public Pais(String tag, String nome, double km){
        this(tag);
        this.nome = nome;
        this.km = km;
    }

    public int getPopulação() {
        return população;
    }
    public void setPopulação(int população) {
        this.população = população;
    }
    public double getKm() {
        return km;
    }
    public void setKm(double km) {
        this.km = km;
    }

    public boolean equals(Object o){
        if(o instanceof Pais){
            Pais p = (Pais) o;
            return this.tag.equals(p.tag);
        }
        return false;   
    }

    public double Densidade(){
        return (população/km);
    }
    
    public void addFronteiras(Pais p){
        this.fronteira.add(p);
    }

    public List<Pais> getFronteiras(){
        return fronteira;
    }

    public boolean fazFronteira(Pais p){
        return this.fronteira.contains(p);
    }

}
