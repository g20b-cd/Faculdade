package p12022;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    
    public static boolean existe(List <Planta> x, Planta y){
        return x.contains(y);
    
    }

    public static Planta[] ordena(List<Planta> x){

        int n = x.size();
        Planta[] array = new Planta[n];
        for(int i = 0; i <= n; i++){
            array[i] = x.get(i);

        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(array[j].getTamanho() > array[j+1].getTamanho()){

                    Planta aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;

                }
            }
        }

        return array;

    }

    public static List<Planta> retornaDados(List<String> arrayList){
        
        List<Planta> array = new ArrayList<>();
        
        for(String s:arrayList){

            String[] partes = s.split("#");
            if(partes.length != 4) continue;

            else if(partes.length == 4){

                String id = partes[0];
                String nome = partes[1];
                double tamanho = Double.parseDouble(partes[2]);
                String tipo = partes[3];

                if(tipo.equals(partes[3] == "B")){
                    Briofita b = new Briofita(id);
                    array.add(b);
                }
                if(tipo.equals(partes[3] == "P")){
                    Pteridofita b = new Pteridofita(id);
                    array.add(b);
                }
            }
        }
        
        return array;
    }
}
