package p220231;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args){
        System.out.println("Insira codigo do pais");
        Scanner sc = new Scanner(System.in);
        String cod = sc.nextLine().toUpperCase();

        Criapaises criador = new Criapaises();
        List<Pais> lista = criador.ListaPaises();
        Pais procurado = new Pais(cod);


        if(lista.contains(procurado)){
            int idx = lista.indexOf(procurado);
            Pais encontrado = lista.get(idx);
            System.out.println("Encontrado" + encontrado);
        }
        else{
            System.out.println("Não encontrado");
        }
    }
}
