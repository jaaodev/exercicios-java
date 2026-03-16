//  10 - Faça um algoritmo que leia três notas obtidas
//  por um aluno, e imprima na tela a média das notas.

package fundamentosJava.exercicioJ;

import java.util.Scanner;

public class ExercicioJ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota número 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota número 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota número 3: ");
        double nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média das suas notas é: %.2f%n", media);
    }
}
