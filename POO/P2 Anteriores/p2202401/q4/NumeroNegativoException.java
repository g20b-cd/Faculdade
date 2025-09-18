package p2202401.q4;

public class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String num){
        super("Negativo" + num);
    }
}
