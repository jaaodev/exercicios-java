/*
12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
 pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
 Tabela de Código de Condições de Pagamento

 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

 2 - À Vista no cartão de crédito, recebe 10% de desconto

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 */

package fundamentosJava.exercicioL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valor = input.nextDouble();
        Produto produto = new Produto(valor);
        System.out.println("Escolha a forma de pagamento");
        System.out.println("Para dinheiro ou pix digite 1");
        System.out.println("Para crédito a vista digite 2");
        System.out.println("Para crédito em duas vezes digite 3");
        System.out.println("Para crédito em três vezes digite 4");
        int opcao = input.nextInt();
        if (opcao == 1) {
            double desconto = TipoPagamento.DINHEIRO_OU_PIX.calcularDesconto(valor);
            System.out.println("No dinheiro ou a vista o valor é: R$" + (valor - desconto) + ", o valor de desconto é de: R$" + desconto);
            System.out.println("O des");
        } else if (opcao == 2) {
            double desconto = TipoPagamento.CREDITO_A_VISTA.calcularDesconto(valor);
            System.out.println("No cartão a vista o valor é: R$" + (valor - desconto) + ", o valor de desconto é de: R$" + desconto);
        } else if (opcao == 3) {
            double desconto = TipoPagamento.CREDITO_DUAS_VEZES.calcularDesconto(valor);
            System.out.println("No cartão em duas vezes o valor é: R$" + (valor - desconto) + ", o valor de desconto é de: R$" + desconto);
        } else if (opcao == 4) {
            double desconto = TipoPagamento.CREDITO_TRES_VEZES.calcularDesconto(valor);
            System.out.println("No cartão em três vezes o valor é: R$" + (valor + desconto) + ", o valor dos juros é de: R$" + desconto);
        }

    }
}