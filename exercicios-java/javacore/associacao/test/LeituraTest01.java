package javacore.associacao.test;

import java.util.Scanner;

public class LeituraTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite a sua idade");
        int idade = input.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = input.next().charAt(0);
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Nome: " + nome);
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Idade: " + idade);
        System.out.println("- - - - - - - - - - - -");
        if (sexo == 'M'){
            System.out.println("Sexo : Masculino");
        } else if (sexo == 'F'){
            System.out.println("Sexo : Feminino");
        } else {
            System.out.println("Opção de sexo invalida");
        }
    }
}
