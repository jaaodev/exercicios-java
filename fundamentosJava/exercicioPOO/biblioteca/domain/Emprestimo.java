package fundamentosJava.exercicioPOO.biblioteca.domain;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataDevolucao;
    private boolean ativo = true;

    public Emprestimo(Livro livro, Usuario usuario, String dataEmprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void finalizar(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
        ativo = false;
    }

    @Override
    public String toString() {
        return String.format("Emprestimo[%s -> %s em %s | %s]",
                usuario.getNome(), livro.getTitulo(), dataEmprestimo,
                ativo ? "ATIVO" : "DEVOLVIDO em " + dataDevolucao);
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }
}
