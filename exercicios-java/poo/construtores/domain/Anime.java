//Sobrecarga de métodos

package poo.construtores.domain;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;

    public Anime(String nome,  String genero, int episodios) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
    }

    public void init(String nome, int episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }

    public void init(String nome, int episodios, String genero) {
        this.init(nome, episodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
