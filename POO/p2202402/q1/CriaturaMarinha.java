package p2202402.q1;

public class CriaturaMarinha {
    String tag;
    String NomeEspecie;
    int ProfundidadeEncontrada;

    public CriaturaMarinha(String tag, String NomeEspecie, int ProfundidadeEncontrada){
        this.tag = tag;
        this.NomeEspecie = NomeEspecie;
        this.ProfundidadeEncontrada = ProfundidadeEncontrada;
    }

    public String getTag() {
        return tag;
    }

    public String getNomeEspecie() {
        return NomeEspecie;
    }

    public int getProfundidadeEncontrada() {
        return ProfundidadeEncontrada;
    }

    public String toString() {
        return "Tag: " + tag + "; Especie: " + NomeEspecie + "; Profundidade encontrada: " + ProfundidadeEncontrada + " metros";
  }
}
