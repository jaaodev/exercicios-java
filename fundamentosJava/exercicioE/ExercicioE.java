//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor
// do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

package fundamentosJava.exercicioE;

import java.util.Scanner;

public class ExercicioE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do salário minimo: ");
        double salarioMin = sc.nextDouble();
        System.out.println("Agora digite o valor do seu salário: ");
        double salario = sc.nextDouble();
        double res = salario / salarioMin;
        System.out.printf("Você recebe o equivalente a %.2f salários minimos!", res);
    }
}
