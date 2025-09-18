package p12018;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    static void main(String args[]){

    }

    public static Biscoito[] transformaListEmArray(List<?> k) {

    int qtd = 0;
    for (Object obj : k) {
        if (obj instanceof Biscoito) {
            qtd++;
        }
    }

    Biscoito[] array = new Biscoito[qtd];

    int index = 0;
    for (Object obj : k) {
        if (obj instanceof Biscoito) {
            array[index++] = (Biscoito) obj;
        }
    }

    return array;
    }
}
