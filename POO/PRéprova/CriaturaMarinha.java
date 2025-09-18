package PRéprova;

public class CriaturaMarinha {
    String tag;
    String nomeEspecia;
    int profundidade;

    public CriaturaMarinha(String tag, String nomeEspecia, int profundidade){
        this.tag = tag;
        this.nomeEspecia = nomeEspecia;
        this.profundidade = profundidade;
    }
    public String toString(){
        return "Nome" + nomeEspecia + "Tag" + tag + "Profundidade" + profundidade;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getNomeEspecia() {
        return nomeEspecia;
    }
    public void setNomeEspecia(String nomeEspecia) {
        this.nomeEspecia = nomeEspecia;
    }
    public int getProfundidade() {
        return profundidade;
    }
    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }

    
}
