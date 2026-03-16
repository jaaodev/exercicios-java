package fundamentosJava.exercicioPOO.biblioteca.domain;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel = true;

    public Livro(String titulo, String autor, String isbn, boolean disponivel) {
        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("ISBN não pode ser vazio");
        }

            this.titulo = titulo;
            this.autor = autor;
            this.isbn = isbn;
            this.disponivel = disponivel;
    }

        @Override
        public String toString() {
            return String.format("%s (%s) - ISBN: %s - %s",
                    titulo, autor, isbn, disponivel ? "Disponível" : "Indisponível");
        }

        public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
