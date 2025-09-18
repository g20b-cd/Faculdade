package p2202401.q1;

import java.util.Objects;

public class Livro {
    
    String titulo;
    String autor;
    int ano;
    String isbn;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Livro(String isbn){
        this.isbn = isbn;
    }
    public Livro(String titulo, String autor, int ano, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
    }

    public boolean equals(Object o) {
      if (o instanceof Livro) {
        Livro l = (Livro) o;
        return isbn.equals(l.isbn);
        }
        else{
            return false;
        }
    }
    public int hashCode() {
        return Objects.hash(isbn);
}

}
