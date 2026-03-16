package fundamentosJava.exercicioPOO.biblioteca.domain;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String documento;
    private ArrayList<Emprestimo> historico = new ArrayList<>();

    public Usuario(String nome, String documento) {
        if (documento == null || documento.isBlank()) {
            throw new IllegalArgumentException("Documento não pode ser vazio");
        }
        this.nome = nome;
        this.documento = documento;
    }

    public boolean podeEmprestar() {
        int ativos = 0;
        for (Emprestimo e : historico) {
            if (e.isAtivo()) ativos++;
        }
        return ativos < 3;
    }

    @Override
    public String toString() {
        return "Usuario {" +
                "nome = " + nome +
                ", documento = " + documento + '}';
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public ArrayList<Emprestimo> getHistorico() {
        return historico;
    }

}
