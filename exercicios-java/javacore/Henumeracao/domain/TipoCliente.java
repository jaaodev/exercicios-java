package javacore.Henumeracao.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente value : values()) {
            if(value.getNomeRelatorio().equals(nomeRelatorio)){
                return value;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
