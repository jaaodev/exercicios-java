package fundamentosJava.exercicioPOO.cadastroFilme.domain;

public class Filme {
    private String titulo;
    private String categoria;
    private int anoLancamento;

    public Filme(String titulo, String categoria, int anoLancamento) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Filme {" +
                "titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
}
