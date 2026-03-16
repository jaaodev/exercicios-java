package fundamentosJava.exercicioL;

public enum TipoPagamento {
    DINHEIRO_OU_PIX {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.15;
        }
    }, CREDITO_A_VISTA {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.10;
        }
    }, CREDITO_DUAS_VEZES {
        @Override
        public double calcularDesconto(double valor) {
            return 0;
        }
    }, CREDITO_TRES_VEZES {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.10;
        }
    };

    public abstract double calcularDesconto(double valor);
}
