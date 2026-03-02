package poo.sobrecargaMetodos.test;

import poo.sobrecargaMetodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", 23);
        anime.imprime();
    }
}
