package p12024;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        ArrayList<Planta> lista = new ArrayList<>();

        lista.add(new Planta("Ouro"));
        lista.add(new Planta("Bananeira"));

        System.out.println("Insira o ID para busca");
        String idBusca = sc.nextLine();

        for(Planta busca: lista){

            if(busca.getId().equalsIgnoreCase(idBusca)){
                System.out.println("Encontrada");
                break;
            }
            else{
                System.out.println("A planta procurada não existe, id:" + idBusca);
            }
        }
        Planta[] ordenadas = Utils.Ordena(lista);
        for(Planta s:ordenadas){
            System.out.println(s);
        }

    }
}
