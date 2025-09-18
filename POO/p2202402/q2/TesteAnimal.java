package p2202402.q2;
import java.util.List;
import java.util.ArrayList;


public class TesteAnimal {
    public static void main(String[] args){
        List<Animal> lista = new ArrayList<>();
        lista.add(new Pato());
        lista.add(new Cachorro());

        for(Animal e : lista){
            e.emitirSom();
            e.mover();
        }
    }
}
