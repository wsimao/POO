import java.util.ArrayList;
public class Livros extends Publicacoes{

    private int numEdicao;
    private String nomeEditora;
    private int isbn;
    
    public Livros(final String dataPublicacao, final String titulo, final ArrayList<Publicacoes> publicacoesReferencia,
            final ArrayList<Autor> autoresPublicacao, final int numEdicao, final String nomeEditora,
            final int isbn) {
        super(dataPublicacao, titulo, publicacoesReferencia, autoresPublicacao);
        this.numEdicao = numEdicao;
        this.nomeEditora = nomeEditora;
        this.isbn = isbn;
    }

    public int getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(final int numEdicao) {
        this.numEdicao = numEdicao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(final String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(final int isbn) {
        this.isbn = isbn;
    }

    public void mostrarLivro() {
        System.out.println("Título: " +getTitulo());
        System.out.println("Data de Publicação: " +getDataPublicacao());
        System.out.println("Autor: "+getAutoresPublicacao());
        System.out.println("Número de Páginas: " +getIsbn());
        System.out.println("Editora: " +getNomeEditora());
        System.out.println("Edição: " +getNumEdicao());
        System.out.println("ISBN: " +getIsbn());
    }
}