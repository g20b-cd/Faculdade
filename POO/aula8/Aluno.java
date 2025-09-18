package aula8;

public class Aluno {

    String id;
    String nome;
    double nota;

    public Aluno(String id){
        this.id = id;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aluno outro = (Aluno) obj;
        return id != null && id.equals(outro.id);
    }

    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}