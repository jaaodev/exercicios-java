package fundamentosJava.exercicioPOO.biblioteca.domain;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList <Livro> acervo = new ArrayList<>();;
    private ArrayList <Usuario> usuarios = new ArrayList<>();;
    private ArrayList <Emprestimo> emprestimos = new ArrayList<>();;

    public void cadastrarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Livro buscarLivroIsbn (String isbn) {
        for (Livro l : acervo) {
            if (l.getIsbn().equals(isbn)) return l;
        }
        return null;
    }

    public Usuario buscarUsuarioDocumento (String documento) {
        for (Usuario u : usuarios) {
            if (u.getDocumento().equals(documento)) return u;
        }
        return null;
    }

    public boolean emprestar(String docUsuario, String isbnLivro, String data) {
        Usuario u = buscarUsuarioDocumento(docUsuario);
        Livro l = buscarLivroIsbn(isbnLivro);
        if (u == null || l == null) return false;
        if (!l.isDisponivel()) return false;
        if (!u.podeEmprestar()) return false;

        Emprestimo e = new Emprestimo(l, u, data);
        emprestimos.add(e);
        u.getHistorico().add(e);
        l.setDisponivel(false);
        return true;
    }

    public boolean devolver(String docUsuario, String isbnLivro, String dataDevolucao) {
        for (Emprestimo e : emprestimos) {
            if (e.isAtivo() && e.getUsuario().getDocumento().equals(docUsuario) && e.getLivro().getIsbn().equals(isbnLivro)) {
                e.finalizar(dataDevolucao);
                e.getLivro().setDisponivel(true);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Emprestimo> listarEmprestimosAtivos() {
        ArrayList<Emprestimo> ativos = new ArrayList<>();
        for (Emprestimo e : emprestimos) {
            if (e.isAtivo()) ativos.add(e);
        }
        return ativos;
    }

    public ArrayList<Livro> listarLivrosDisponiveis() {
        ArrayList<Livro> disponiveis = new ArrayList<>();
        for (Livro l : acervo) {
            if(l.isDisponivel()) disponiveis.add(l);
        }
        return disponiveis;
    }

}
