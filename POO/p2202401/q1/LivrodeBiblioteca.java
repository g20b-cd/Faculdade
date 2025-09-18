package p2202401.q1;

public class LivrodeBiblioteca extends Livro {
    public LivrodeBiblioteca(String isbn){
        super(isbn);
    }

    public LivrodeBiblioteca(String titulo, String autor, int ano, String isbn){
        super(titulo, autor, ano, isbn);
    }

    boolean alugado;

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    
}
