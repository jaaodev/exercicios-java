package javacore.Henumeracao.test;

import javacore.Henumeracao.domain.Cliente;
import javacore.Henumeracao.domain.TipoCliente;
import javacore.Henumeracao.domain.TipoPagamento;

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
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente);
    }
}

/*
A enumeração é um tipo especial de classe onde todos os atributos que nós criarmos são constantes.
Dentro do enum TipoCliente tem um metodo para procurar por atributos que é o tipoClientePorNomeRelatorio().
Basicamente você usa uma informação que você tem, nesse caso o nomeRelatorio para procurar por outro
atributo do TipoCliente.
 */
