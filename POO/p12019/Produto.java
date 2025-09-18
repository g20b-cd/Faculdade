package p12019;

public class Produto {
 
    String id;
    String cor;
    double preço;

    public double getPreço(){
        return preço;
    }

    public Produto(String id){
        this.id = id;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Produto)) return false;

        Produto outro = (Produto) obj;
        return this.id.equals(outro.id);
    }

    public String toString(){
        return "Id:" + id + "Cor" + cor + "Preço" + preço;
    }

}
