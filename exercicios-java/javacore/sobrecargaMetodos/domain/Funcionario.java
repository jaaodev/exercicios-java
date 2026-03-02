package javacore.sobrecargaMetodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeDados() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public void mediaSalario() {
        if (salario == null) {
            return;
        }
        double soma = 0;
        double media = 0;
        for (double num : salario) {
            soma += num;
        }
        media = soma / salario.length;
        System.out.println("A média dos salarios é: " + media);
    }
}
