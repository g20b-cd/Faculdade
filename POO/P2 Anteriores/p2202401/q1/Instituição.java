package p2202401.q1;
import java.util.ArrayList;

public class Instituição {
    
    String nome;
    ArrayList<Livro> ListadeLivros = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void AddListadeLivros(Livro x) {
        ListadeLivros.add(x);
    }
    public ArrayList<Livro> getListadeLivros() {
        return ListadeLivros;
    }

}
