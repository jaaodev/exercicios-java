/*
13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
 */

package fundamentosJava.exercicioM;

import java.util.Scanner;

public class ExercicioM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();

        if(idade < 18) {
            System.out.println(nome + ", você é menor de idade!");
        } else {
            System.out.println(nome + ", você é maior de idade!");
        }


        input.close();
    }
}
