package javacore.associacao.test;

import java.util.Scanner;

public class LeituraTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O PROGRAMA QUE PREVÊ O SEU FUTURO!!!!");
        System.out.println("Digite a sua pergunta e eu responderei SIM ou NÃO");
        String pergunta =  input.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM!");
        } else {
            System.out.println("NÃO!");
        }
    }
}
