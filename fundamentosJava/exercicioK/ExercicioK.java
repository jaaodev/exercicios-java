/* 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule
 a média das nota obtidas, imprima na tela o nome do aluno e
 se o aluno foi aprovado ou reprovado. Para o aluno ser considerado
 aprovado sua média final deve ser maior ou igual a 7. */

package fundamentosJava.exercicioK;

import java.util.Scanner;

public class ExercicioK {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a sua nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua nota 3: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite sua nota 4: ");
        double nota4 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 7) {
            System.out.println("João Rocha você foi aprovado!");
        } else {
            System.out.println("João Rocha você foi reprovado!");
        }
    }
}
