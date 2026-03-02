package javacore.associacao.test;

import javacore.associacao.domain.Jogador;
import javacore.associacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Vinicius Jr");
        Jogador jogador3 = new Jogador("Raphinha");
        Time time = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador1,jogador2, jogador3};

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("--- Jogador ---");

        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
