package p2202401.q4;

public class MeuNumero {
    public static double Media(String x) throws NumeroNegativoException{

        String[] partes = x.split("#");
        int soma = 0;
        int qnt = 0;

        for(String parte:partes){

            int num = Integer.parseInt(parte);
            if(num < 0){
                throw new NumeroNegativoException(parte);
            }
            soma += num;
            qnt++;

        }
        return (double)(soma/qnt);
    }
}

