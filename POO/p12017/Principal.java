package p12017;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    static void main(String agrs[]){
    BombaCombustivel x = new BombaCombustivel();
    x.setQntlitros(5000);
    Carro a = new Carro("Uno", 100);
    x.completarTanque(a);

    Moto b = new Moto("Honda", 100);
    Moto c = new Moto("Honda Bis", 100);

    List<Abastecivel> lista = new ArrayList<>();
    lista.add(a);
    lista.add(b);
    lista.add(c);

    x.AbastecerLista(lista);
    }
}