package javacore.Eassociacao.domain;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this(titulo, local);
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("----------- Seminario -----------");
        System.out.println(this.getTitulo() + " - " + this.local.getEndereco());
        System.out.println("\nAlunos cadastrados no seminário:");
        if (alunos != null) {
            for (Aluno i : alunos) {
                System.out.println(i.getNome() + " - " + i.getIdade());
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
