package p220231;
import java.util.ArrayList;
import java.util.List;


public class Criapaises {
    public List<Pais> ListaPaises(){
        Pais us = new Pais("US", "Estados Unidos", 10000);
        Pais ca = new Pais("CA", "Canada", 9000);
        Pais me = new Pais("ME", "Mexico", 7000);

        List<Pais> Lista = new ArrayList<Pais>();
        Lista.add(us);
        Lista.add(ca);
        Lista.add(me);
        us.addFronteiras(me);
        ca.addFronteiras(us);
        me.addFronteiras(us);
        us.addFronteiras(ca);
        return Lista;
    }

    public List<Pais> RetornaPaises(String[] arr) throws FormatoIncorretoException{

        List<Pais> x = new ArrayList<Pais>();
        for(String str: arr){
            String[] partes = str.split("#");

            if(partes.length < 4){
                throw new FormatoIncorretoException(partes.length - 1, str);
            }
            Pais p = new Pais(partes[0], partes[1], Double.parseDouble(partes[2]));
            p.setPopulação(Integer.parseInt(partes[3]));
            x.add(p);
        }
        return x;

    }
}
