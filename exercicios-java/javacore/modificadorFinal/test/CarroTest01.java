package javacore.modificadorFinal.test;

import javacore.modificadorFinal.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("José");
        System.out.println(carro.COMPRADOR);

        /*
        public final String nome; o valor de nome não pode ser alterado. ----- VARIÁVEL PRIMITIVA -----
        public final Comprador COMPRADOR; não pode ser alterada a referencia ao objeto, no caso COMPRADOR
        mas o valor do objeto pode ser alterado. ----- VARIÁVEL DE REFERENCIA -----
        public final class Carro {}, dessa forma você não permite que a classe carro seja extendida
        a uma classe Ferrari por exemplo. ----- CLASSES -----
        public final void imprimir() {}, dessa forma você não permite que as subclasses
        sobrecarreguem o metodo da superclasse. ----- MÉTODOS -----
         */

    }
}
