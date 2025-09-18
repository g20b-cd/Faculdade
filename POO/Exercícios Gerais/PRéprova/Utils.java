package PRéprova;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Utils {
    public Map<String, CriaturaMarinha> retornaDados(Set<String> conjuntoCriaturas) throws FormatoIncorretoException{
        Map<String, CriaturaMarinha> c = new HashMap<>();   
        
        for(String s:conjuntoCriaturas){
            String[] partes = s.split("#");

            if(partes.length != 4){
                throw new FormatoIncorretoException(s);
            }
            CriaturaMarinha j = new CriaturaMarinha(partes[1], partes[2], Integer.parseInt(partes[3]));
            c.put(partes[0],j);
            
        }
        return c;
    }
}
