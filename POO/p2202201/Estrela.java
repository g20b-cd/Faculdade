package p2202201;

public class Estrela extends CorpoCeleste{
    public Estrela(String id){
        super(id);
    }

    public String toString(){
        return "Id" + id + "Nome" + nome + "Distancia" + Distancia;
    }
}
