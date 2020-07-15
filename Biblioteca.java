import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private String endereco;
    private ArrayList<Publicacoes> conjuntoPublicacoes;

    public String getNome() {
        return nome;
    }

    public ArrayList<Publicacoes> getConjuntoPublicacoes() {
        return conjuntoPublicacoes;
    }

    public void setConjuntoPublicacoes(ArrayList<Publicacoes> conjuntoPublicacoes) {
        this.conjuntoPublicacoes = conjuntoPublicacoes;
    }

    public void setNome(Object object) {
        this.nome = (String) object;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}