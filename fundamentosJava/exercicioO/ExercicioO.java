/*
15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos,
meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
(Ex: 5 anos, 2 meses e 15 dias de vida)
 */

package fundamentosJava.exercicioO;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ExercicioO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ano que você nasceu: ");
        int anoNascimento = input.nextInt();

        LocalDate nascimento = LocalDate.of(anoNascimento, 8, 17);
        LocalDate hoje = LocalDate.now();

        Period periodo = Period.between(nascimento, hoje);

        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        int totalDias = (anos * 365) + (meses * 30) + dias;
        int anosVida = totalDias / 365;
        int mesesVida = (totalDias % 365) / 30;
        int diasVida = (totalDias % 365) % 30;

        System.out.printf("Essa pessoa já viveu: %d anos, %d meses e %d dias.%n",
                anosVida, mesesVida, diasVida);

        input.close();
    }
}
