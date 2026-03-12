package javacore.CblocoInicializacao.test;

import javacore.CblocoInicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int i : anime.getEpisodios()) {
            System.out.print(i + " ");
        }

    }

}
