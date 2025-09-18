package p12024;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static boolean Existe(List<Planta> lista, Planta planta){
        
       return lista.contains(planta);
    }

    public static Planta[] Ordena(List<Planta> lista){

        int n = lista.size();
        Planta[] array = new Planta[n];

        for(int i = 0; i < n; i++){
            array[i] = lista.get(i);
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n - i - 1); j++){
                if(array[j].getTamanho() > array[j+1].getTamanho()){

                    Planta aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;

                }
            }
        }
        return array;
    }


}
