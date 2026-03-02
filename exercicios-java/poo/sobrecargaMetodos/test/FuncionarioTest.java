package poo.sobrecargaMetodos.test;

import poo.sobrecargaMetodos.domain.Funcionario;

public class FuncionarioTest {
        public static void main(String[] args) {
            Funcionario funcionario01 = new Funcionario();

            funcionario01.nome = "Joao";
            funcionario01.idade = 22;
            funcionario01.salario = new double[] {4000, 4000, 4000};

            funcionario01.imprimeDados();
            funcionario01.mediaSalario();

        }
    }

