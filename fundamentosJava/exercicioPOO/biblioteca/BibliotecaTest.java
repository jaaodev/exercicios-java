package fundamentosJava.exercicioPOO.biblioteca;

import fundamentosJava.exercicioPOO.biblioteca.domain.Biblioteca;
import fundamentosJava.exercicioPOO.biblioteca.domain.Emprestimo;
import fundamentosJava.exercicioPOO.biblioteca.domain.Livro;
import fundamentosJava.exercicioPOO.biblioteca.domain.Usuario;

public class BibliotecaTest {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        // Cadastro de novos livros
        biblioteca.cadastrarLivro(new Livro("Dom Casmurro", "Machado de Assis", "98653", true));
        biblioteca.cadastrarLivro(new Livro("O Alquimista", "Paulo Coelho", "85638", true));
        biblioteca.cadastrarLivro(new Livro("Dom Quixote", "Miguel de Cervantes", "87745", true));
        biblioteca.cadastrarLivro(new Livro("Crime e Castigo", "Fiódor Dostoiévski", "99563", true));
        biblioteca.cadastrarLivro(new Livro("Hamlet", "William Shakespeare", "88523", true));
        // Cadatro de novos usuários
        biblioteca.cadastrarUsuario(new Usuario("João", "1153688"));
        biblioteca.cadastrarUsuario(new Usuario("Shamira", "2235427"));
        // Emprestando livros
        System.out.println("Emprestar (João, 85638): " + biblioteca.emprestar("1153688", "85638", "2026-03-15"));
        System.out.println("Emprestar (Shamira, 88523): " + biblioteca.emprestar("2235427", "88523", "2026-03-15"));
        System.out.println("Emprestar (João, 98653): " + biblioteca.emprestar("1153688", "99563", "2026-04-15"));
        System.out.println("Emprestar (João, 87745): " + biblioteca.emprestar("1153688", "87745", "2026-03-15"));
        // 4º emprestimo para o mesmo usuario deve falhar
        System.out.println("Emprestar (João, 98653): " + biblioteca.emprestar("1153688", "98653", "2026-03-15"));
        // Devolução
        System.out.println("Devolver (João, 85638): " + biblioteca.devolver("1153688", "85638", "2026/04/02"));
        // Após devolver, pode pegar outro livro
        System.out.println("Emprestar (João, 98653): " + biblioteca.emprestar("1153688", "98653", "2026-04/02"));

        System.out.println("\n --------- LIVROS DISPONIVEIS ---------");
        for (Livro l : biblioteca.listarLivrosDisponiveis()) {
            System.out.println(l.getTitulo());
        }

        System.out.println("\n --------- EMPRESTIMOS ATIVOS ---------");
        for (Emprestimo e : biblioteca.listarEmprestimosAtivos()) {
            System.out.println(e.toString());
        }


    }
}
