package p2202201;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

public class Utils {
    public static boolean Existe(Collection<CorpoCeleste> x, CorpoCeleste y){
        return x.contains(y);
    }

    public static void ordena(List<CorpoCeleste> x){
        Collections.sort(x, Comparator.comparingDouble(CorpoCeleste::getDistancia));
    }

    public Map<String, CorpoCeleste> retornaDados(Set<String> ConjuntoCorpos) throws FormatoIncorretoException{
        Map<String, CorpoCeleste> j = new HashMap<>();
        Iterator<String> it = ConjuntoCorpos.iterator();
        
        while(it.hasNext()){
            String s = it.next();
            String[] partes = s.split("#");
            CorpoCeleste c = null;

            if(partes.length != 4){
                throw new FormatoIncorretoException(s);
            }
            if(partes[3].equals("P")){
                c = new Planeta(partes[0]);
            }
            if(partes[3].equals("E")){
                c = new Estrela(partes[0]);
            }
            else{
                System.out.println("Inválido, não é planeta nem estrela");
            }
            c.setNome(partes[1]);
            c.setDistancia(Double.parseDouble(partes[2]));
            j.put(partes[0], c);
        }
        return j;

    }

}
