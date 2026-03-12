package javacore.IclassesAbstratas.test;

import javacore.IclassesAbstratas.domain.Desenvolvedor;
import javacore.IclassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Shamira", 12000);
        System.out.println(gerente);
        Desenvolvedor dev = new Desenvolvedor("João", 8000);
        System.out.println(dev);
        dev.imprime();
        gerente.imprime();
    }

    /*
    A classe abstrata é uma classe que foi criada para ser extendida, por exemplo, não faria sentido eu criar um funcionario sendo que não vou saber o cargo dele
    então dessa forma eu sou obrigado a criar um objeto com o cargo do funcionario, nesse caso Gerente.
    E como uma class final não pode ser extendida então é impossivel criar uma classe final abstract.
    No caso do metodo abstrato ele não pode ter corpo, ele é criado apenas para ser sobrescrito, e todas as subclasses precisam ter esse metodo implementado.
    Os metodos abstratos so podem existir dentro de classes abstratas
     */

}
