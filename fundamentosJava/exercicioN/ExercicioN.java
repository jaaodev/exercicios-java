/*
14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
 */

package fundamentosJava.exercicioN;

import java.util.Scanner;

public class ExercicioN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = input.nextInt();
        int C = A;
        System.out.println("Digite o valor de B: ");
        int B = input.nextInt();

        A = B;
            System.out.println("Valor de A: " + A);

        B = C;
        System.out.println("Valor de B: " + B);
    }
}
