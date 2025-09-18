package p12018;

public class Biscoito {
    String id;
    String cor;
    int preço;

    public Biscoito(String id){
        this.id = id;
    }
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Biscoito)) return false;

        Biscoito outro = (Biscoito) obj;
        return this.id.equals(outro.id) && this.id != null;
    }
    
}
