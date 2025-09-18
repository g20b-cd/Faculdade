package p2202401.q4;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        System.out.println("Insira uma string de numeros cortados por #");
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        try{
            double x = MeuNumero.Media(entrada);
            System.out.printf("A média é: [%.2f]%n", x);

        }catch(NumeroNegativoException e){
             System.out.println(e.getMessage());
        }

    }
}
