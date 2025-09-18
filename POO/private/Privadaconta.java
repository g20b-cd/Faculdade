import java.util.Scanner;;
class ContaPrivada{

    private String name = "Gabriel";
    private int age = 19;
    private int data = 20032025;
    private String girlfrind = "Daniely";
    private double saldo = 5000;
    private int identificador;

    public String getName(){
        return name;
    }

    public double setSaldo(){
        return (saldo*0.1);
    }
    void setIdentificador(int identificador1){
        identificador = identificador1;
    }
    public int getIdentificador(){
        return identificador;
    }
}

public class Privadaconta {
    
    public static void main(String[] args){
        ContaPrivada c1 = new ContaPrivada();
        System.out.println("Nome: " + (c1.getName()));
        System.out.println("Saldo: " + (c1.setSaldo()));
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Inserir Identificador");
        x = sc.nextInt();
        c1.setIdentificador(x);
        System.out.println("Identificador: " + c1.getIdentificador());
    }

}
