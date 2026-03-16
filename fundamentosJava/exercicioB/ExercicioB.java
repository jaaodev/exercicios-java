//2 - Faça um algoritmo para receber um número qualquer e imprimir
// na tela se o número é par ou ímpar, positivo ou negativo.

package fundamentosJava.exercicioB;

import java.util.Scanner;

public class ExercicioB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            if (num > 0) {
                System.out.println(num + " é par e positivo");
            } else if (num < 0) {
                System.out.println(num + " é par e negativo");
            }
        } else if (num > 0) {
                System.out.println(num + " é ímpar e positivo");
            } if (num < 0) {
                System.out.println(num + " é ímpar e negativo");
            } else if (num == 0) {
            System.out.println(num + " é um número par e neutro");
        }
    }
}
