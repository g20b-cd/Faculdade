package p220231;

public class FormatoIncorretoException extends Exception {
    public FormatoIncorretoException(int qnt,String str){
        super("A string '" + str + "' possui apenas " + qnt + " #s.");
    }
}
