//3 - Faça um algoritmo que leia dois valores inteiros A e B, se
// os valores de A e B forem iguais, deverá somar os dois valores,caso contrário
// devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se
// atribuir o resultado a uma variável C e imprimir seu valor na tela.

package fundamentosJava.exercicioC;

import java.util.Scanner;

public class ExercicioC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C;

        if (A == B) {
            C =  A + B;
            System.out.println(C);
        } else {
            C = A * B;
            System.out.println(C);
        }
    }
}
