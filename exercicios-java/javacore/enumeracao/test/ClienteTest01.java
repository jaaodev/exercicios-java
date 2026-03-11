package javacore.enumeracao.test;

import javacore.enumeracao.domain.Cliente;
import javacore.enumeracao.domain.TipoCliente;
import javacore.enumeracao.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Carlos", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Shamira", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente4 = new Cliente("Afonso", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}

/*
A enumeração é um tipo especial de classe onde todos os atributos que nós criarmos são constantes.
 */
