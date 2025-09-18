package lista4;

public class Processa {
    public static void main(String args[]){
        Processa s = new Processa();
        System.out.println(s.calcula(3,2));

    }

    public double calcula(double a, double b){
        return (a+b)*(a*0.1)+(b*0.9);
    }
}
