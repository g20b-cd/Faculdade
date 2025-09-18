package p2202401.q1;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    public void imprimeRelatorio(List<Livro> x){
        Iterator<Livro> it = x.iterator();
    
        while(it.hasNext()){
            Livro a = it.next();
            if(a instanceof LivrodeBiblioteca){
                System.out.println(a.getTitulo() + a.getAno() + a.getAutor());
                LivrodeBiblioteca lf = (LivrodeBiblioteca) a;
                System.out.println("Está alugado?"+lf.isAlugado());
            }
            if(a instanceof LivrodeLivraria){
                System.out.println(a.getTitulo() + a.getAno() + a.getAutor());
                LivrodeLivraria lf = (LivrodeLivraria) a;
                System.out.println("Está vendido?"+lf.isVendido());

            }
        }
    }

    public void main(String[] args){

       LivrodeBiblioteca lb1 = new LivrodeBiblioteca("A Revolução dos Bichos", "George Orwell", 1945, "ISBN001");
        lb1.setAlugado(true);

        LivrodeBiblioteca lb2 = new LivrodeBiblioteca("Capitães da Areia", "Jorge Amado", 1937, "ISBN002");
        lb2.setAlugado(false);

        LivrodeLivraria ll1 = new LivrodeLivraria("O Hobbit", "J.R.R. Tolkien", 1937, "ISBN003");
        ll1.setVendido(true);

        LivrodeLivraria ll2 = new LivrodeLivraria("1984", "George Orwell", 1949, "ISBN004");
        ll2.setVendido(false);
    
        Instituição inst = new Instituição();
        inst.setNome("Inst");

        inst.AddListadeLivros(lb1);
        inst.AddListadeLivros(lb2);
        inst.AddListadeLivros(ll1);
        inst.AddListadeLivros(ll2);

        ArrayList<Livro> Lista = inst.getListadeLivros();
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o ISBN que você gostaria de consultar?");
        String isbn = sc.nextLine();

        Livro livroProcurado = new Livro(isbn);
        if(Lista.contains(livroProcurado)){
            
            Livro l = (Lista.get(Lista.indexOf(livroProcurado)));
            System.out.println(l.getTitulo() + l.getAno() + l.getAutor());

        }
    }
        
}
