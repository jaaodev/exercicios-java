package javacore.construtores.test;

import javacore.construtores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Kaiju N 8", "Ficção", 11);

     //   anime.init("Naruto", 27, "Comédia");
        anime.imprime();
    }
}
