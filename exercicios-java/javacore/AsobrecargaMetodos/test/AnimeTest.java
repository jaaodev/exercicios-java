package javacore.AsobrecargaMetodos.test;

import javacore.AsobrecargaMetodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", 23);
        anime.imprime();
    }
}
