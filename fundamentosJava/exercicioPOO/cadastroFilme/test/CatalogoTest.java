package fundamentosJava.exercicioPOO.cadastroFilme.test;
import fundamentosJava.exercicioPOO.cadastroFilme.domain.Catalogo;
import fundamentosJava.exercicioPOO.cadastroFilme.domain.Filme;

public class CatalogoTest {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        //Adicionando filmes ao catálogo
        catalogo.adicionarFilme(new Filme("Homem Aranha", "Super Herói", 2005));
        catalogo.adicionarFilme(new Filme("Homem de Ferro", "Super Herói", 2007));
        catalogo.adicionarFilme(new Filme("O Planeta dos Macacos", "Ficção Cientifica", 2010));
        //Lista de filmes no catálogo
        catalogo.listarFilmes();
        //Procurando por filme no catálogo
        catalogo.procurarFilme("Homem aranha");

        catalogo.procurarFilme("O planeta dos Macacos");

        catalogo.procurarFilme("o homem de ferro");
    }
}
