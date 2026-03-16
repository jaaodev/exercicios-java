package fundamentosJava.exercicioPOO.cadastroFilme.domain;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Filme> filmes = new ArrayList<>();

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
        System.out.println("Filme " + filme.getTitulo() + " adicionado ao catálogo.");
    }

    public void listarFilmes() {
        System.out.println("\n ------ LISTA DE FILMES NO CATALOGO ------");
        for (Filme f : filmes) {
            System.out.println(f.getTitulo());
        }
    }

    public void procurarFilme(String titulo) {
        System.out.println("\n------ PROCURANDO FILME ------");
        for (Filme f : filmes) {
            if (f.getTitulo().equalsIgnoreCase(titulo)) { // corrigido equals
                System.out.println("Filme: " + f.getTitulo()
                        + ", Categoria: " + f.getCategoria()
                        + ", Ano de lançamento: " + f.getAnoLancamento());
                return;
            }
        }
        System.out.println("Nenhum filme encontrado com o título: " + titulo);
    }
}
