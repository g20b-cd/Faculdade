package UFC1;

public abstract class Lutador{

    private String Nome;
    private int idade;
    private double peso;

    public String getNome() {
        return Nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }
    public Lutador( String Nome, int idade, double peso){

        this.Nome = Nome;
        this.peso = peso;
        this.idade = idade;

    }
    public String toString(){
        return Nome + idade + peso;
    }

    public abstract int getId();

    public void PossiveisLutas(Lutador Lutadores[]){

        for(int i = 0; i < Lutadores.length; i++){

            if(Lutadores[i].getId() == this.getId()){
                System.out.println("- " + Lutadores[i].getNome());
            }
        }
    }

    public String CategoriaLutador(){

        if(getId() == 1){
            return "Pesopesado";
        }
        if(getId() == 2){
            return "Pesopena";
        }
        if(getId() == 3){
            return "Pesomedio";
        }
        if(getId() == 4){
            return "Meiopesado";
        }
        return "invalido";

    }

    public static void main(String Args[]){

        Pesopesado A = new Pesopesado("Anderson", 10, 59);
        System.out.println(A.getNome() + A.getIdade() + A.getPeso());
        System.out.println(A.toString());

    }

}