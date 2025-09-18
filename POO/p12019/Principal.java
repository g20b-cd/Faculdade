package p12019;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o id");
        String idBuscado = sc.nextLine();



    }

    public Produto[] listaArray(List<Object> lista){
        
        int qnt = 0;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) instanceof Produto){
                qnt++;
            }
        }
        Produto[] array = new Produto[qnt];
        int index = 0;
        for(int i = 0; i <lista.size(); i++){
            if(lista.get(i) instanceof Produto){
                array[index] = (Produto) lista.get(i);
                index++;
            }
        }

        return array;

    }
    public double somaPreços(Produto[] array){
        double soma = 0;
        for(int i = 0; i < array.length;i++){
            soma += array[i].getPreço();
        }
        return soma;
    }
}
