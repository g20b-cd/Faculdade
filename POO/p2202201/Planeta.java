package p2202201;

public class Planeta extends CorpoCeleste {
    public Planeta(String id){
        super(id);
    }

    public String toString(){
        return "Id" + id + "Nome" + nome + "Distancia" + Distancia;
    }
}
