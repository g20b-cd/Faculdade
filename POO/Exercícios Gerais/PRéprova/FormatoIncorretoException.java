package PRéprova;

public class FormatoIncorretoException extends Exception{
    public FormatoIncorretoException(String msg){   
        super("Formato incorreto" + msg);
    }
}
