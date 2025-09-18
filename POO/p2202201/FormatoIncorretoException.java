package p2202201;

public class FormatoIncorretoException extends Exception {
    public FormatoIncorretoException(String msg){
        System.out.println("O formato incorreto da string: " + msg);
    }
}
