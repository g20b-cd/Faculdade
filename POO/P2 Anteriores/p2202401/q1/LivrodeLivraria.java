package p2202401.q1;

public class LivrodeLivraria extends Livro {
    boolean vendido;

    public LivrodeLivraria(String isbn){
        super(isbn);
    }

    public LivrodeLivraria(String titulo, String autor, int ano, String isbn){
        super(titulo, autor, ano, isbn);
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

}
