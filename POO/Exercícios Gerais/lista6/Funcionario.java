package lista6;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    
    String id;
    String nome;    
    double salario;
    ArrayList <Integer> x = new ArrayList<>();

    public Funcionario(String id, String nome, double salario){
        this.id = id;
        this.salario = salario;
        this.nome = nome;
    }
    public double getSalario(){
        return salario;
    }

    public String toString(){
        return "id" + id + "nome" + nome + "salario" + salario;
    }

    public boolean equals(Object obj){

        if(this == obj) return true;
        if(!(obj instanceof Funcionario)) return false;

        Funcionario outro = (Funcionario) obj;
        return this.id.equals(outro.id);

    }

}
