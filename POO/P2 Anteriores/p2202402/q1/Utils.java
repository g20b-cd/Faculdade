package p2202402.q1;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Utils {
    
    public Map<String, CriaturaMarinha> RetornaDados(Set<String> ConjuntoCriaturas) throws FormatoIncorretoException {
        Map<String, CriaturaMarinha> m = new HashMap<String, CriaturaMarinha>();

        for(String parte:ConjuntoCriaturas){

            String[] partes = parte.split("#");
            if(partes.length != 3){
                throw new FormatoIncorretoException("Incorreto");
            }
            CriaturaMarinha c = new CriaturaMarinha(partes[0], partes[1], Integer.parseInt(partes[2]));
            m.put(partes[0],c);
        }

        return m;
    }
}
