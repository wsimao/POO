public class Emprestimo {

    private String dataInicioEmprestimo;
    private String dataRetornoPublicacao;
    private String valorMulta;
    private Usuario usuario;
    private Publicacoes publicacoes;

    public Emprestimo(String dataInicioEmprestimo, String dataRetornoPublicacao, String valorMulta, Usuario usuario,
            Publicacoes publicacoes) {
        this.dataInicioEmprestimo = dataInicioEmprestimo;
        this.dataRetornoPublicacao = dataRetornoPublicacao;
        this.valorMulta = valorMulta;
        this.usuario = usuario;
        this.publicacoes = publicacoes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataInicioEmprestimo() {
        return dataInicioEmprestimo;
    }

    public void setDataInicioEmprestimo(String dataInicioEmprestimo) {
        this.dataInicioEmprestimo = dataInicioEmprestimo;
    }

    public String getDataRetornoPublicacao() {
        return dataRetornoPublicacao;
    }

    public void setDataRetornoPublicacao(String dataRetornoPublicacao) {
        this.dataRetornoPublicacao = dataRetornoPublicacao;
    }

    public String getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(String valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Publicacoes getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(Publicacoes publicacoes) {
        this.publicacoes = publicacoes;
    }

    public void EmprestimoLivro(Publicacoes publicacoes,Usuario cliente){
    if(Usuario.class.getClass().equals(UsuarioComum.class)&&cliente.getEmprestimoLivro()<3){
        int emprestimo=cliente.getEmprestimoLivro();
        emprestimo++;
        cliente.setEmprestimoLivro(emprestimo);
        System.out.println("Emprestimo realizado com Sucesso!");
    }else{
        if(Usuario.class.getClass().equals(UsuarioEspecial.class)&&cliente.getEmprestimoLivro()<5){
            int emprestimo=cliente.getEmprestimoLivro();
            emprestimo++;
            cliente.setEmprestimoLivro(emprestimo);
            System.out.println("Emprestimo realizado com Sucesso!");
        }
    }
    }

    public void DevolverLivro (Publicacoes publicacoes,Usuario cliente){
        if(Usuario.class.getClass().equals(UsuarioComum.class)&&cliente.getEmprestimoLivro()>0){
            int emprestimo=cliente.getEmprestimoLivro();
            emprestimo--;
            cliente.setEmprestimoLivro(emprestimo);
            System.out.println("Devolução realizada com Sucesso!");
        }else{
            if(Usuario.class.getClass().equals(UsuarioEspecial.class)&&cliente.getEmprestimoLivro()>0){
                int emprestimo=cliente.getEmprestimoLivro();
                emprestimo--;
                cliente.setEmprestimoLivro(emprestimo);
                System.out.println("Devolução realizado com Sucesso!");
            }
        }
    }

}