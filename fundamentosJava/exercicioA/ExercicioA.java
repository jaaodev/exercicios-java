//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida
// imprima na tela a soma entre A e B é mostre se a soma é menor que C.

package fundamentosJava.exercicioA;

import java.util.Scanner;

public class ExercicioA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int res = A + B;

        if (res < C) {
            System.out.println(res + " é menor que: " + C);
        } else {
            System.out.println(res + " não é menor que: " + C);
        }

    }
}
