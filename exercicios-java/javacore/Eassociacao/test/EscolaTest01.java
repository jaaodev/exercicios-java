package javacore.Eassociacao.test;

import javacore.Eassociacao.domain.Escola;
import javacore.Eassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Kakashi");
        Professor professor2 = new Professor("Iruka");
        Professor[] professores = {professor1, professor2};
        Escola  escola = new Escola("Konoha Academy", professores);

        escola.imprime();
    }
}
