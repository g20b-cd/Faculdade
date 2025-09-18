package lista4;

public class Novo extends Imovel {
    public Novo(String endereco, double preco) {
        super(endereco, preco);
    }

    @Override
    public double getPreco() {
        return super.getPreco() * 1.10; 
    }
}
