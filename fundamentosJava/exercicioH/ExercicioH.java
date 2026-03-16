//8 - Faça um algoritmo que leia três valores inteiros
// diferentes e imprima na tela os valores em ordem decrescente.

package fundamentosJava.exercicioH;

import java.util.Scanner;

public class ExercicioH {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A > B && A > C) {
            System.out.println(A);
            if(B > C) {
                System.out.println(B);
                System.out.println(C);
            }   else {
                System.out.println(C);
                System.out.println(B);
            }
        }   else if ( B > A && B > C) {
                System.out.println(B);
                if(A > C) {
                    System.out.println(A);
                    System.out.println(C);
                } else  {
                    System.out.println(C);
                    System.out.println(A);
                }
            } else {
                System.out.println(C);
                if (A > B) {
                    System.out.println(A);
                    System.out.println(B);
                } else  {
                    System.out.println(B);
                    System.out.println(A);
                }
        }
    }
}
