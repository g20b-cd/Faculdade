package lista6;

import java.util.ArrayList;
import java.util.List;

public class Utils{
    
    public static boolean existe(List<Funcionario> x, Funcionario y){
        return x.contains(y);
        
    }
    public static List<Funcionario> retornaDados(String[] array_funcionarios){
        List<Funcionario> lista = new ArrayList<>();

        for(String s: array_funcionarios){

            String[] partes = s.split("#");
            if(partes.length != 4) continue;

            String id = partes[0];
            String nome = partes[1];
            double salario = Double.parseDouble(partes[2]);
            char tipo = partes[3].charAt(0);

            if (tipo == 'A') {
                    lista.add(new Analista(id, nome, salario));
            } else if (tipo == 'P') {
                    lista.add(new Programador(id, nome, salario));
                }
        }

        return lista;
    }

}
