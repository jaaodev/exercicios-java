package javacore.CblocoInicializacao.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

   static { //no bloco de inicialização estatico inicialização estático ele
            //inicializa somente uma vez.
        System.out.println("Anime inicializado dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i=0; i<episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int i : Anime.episodios) {
            System.out.print(i + " ");
        }
    }

    public void imprime(String nome) {
        System.out.println(this.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public int[] getEpisodios(){
        return episodios;
    }

}
