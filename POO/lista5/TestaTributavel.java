package lista5;

public class TestaTributavel {
    
    public static void main(String args[]){

        ContaCorrente cc = new ContaCorrente();
        ContaPoupança xx = new ContaPoupança();
        cc.Deposita(100);
        System.out.println(cc.CalculaTributavel());
        


    }
}
