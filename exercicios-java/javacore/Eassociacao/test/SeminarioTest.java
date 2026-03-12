package javacore.Eassociacao.test;

import javacore.Eassociacao.domain.Aluno;
import javacore.Eassociacao.domain.Local;
import javacore.Eassociacao.domain.Professor;
import javacore.Eassociacao.domain.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {

        Local local = new Local("Rua das almondegas");
        Local local1 = new Local("Rua das almondegas");
        local.setEndereco("Rua das Bolotas");
        Aluno aluno = new Aluno("João", 26);
        Aluno aluno1 = new Aluno("Marcos", 17);
        Aluno aluno3 = new Aluno("Shamira", 24);
        Aluno aluno4 = new Aluno("Maria", 18);
        Aluno[] alunos = {aluno, aluno1};
        Aluno[] alunos1 = {aluno3, aluno4};
        Seminario seminario = new Seminario("A trilha Java", local, alunos);
        Seminario seminario2 = new Seminario("Spring Boot para os brabos", local1, alunos1);
        Seminario[] seminariosProf = {seminario, seminario2};
        Seminario[] seminariosProf1 = {seminario2};
        Professor professor = new Professor("Marcos", "Beck-end", seminariosProf);
        Professor professor1 = new Professor("José", "Fullstack", seminariosProf1);
        aluno.setSeminario(seminario);
        aluno1.setSeminario(seminario);
        aluno3.setSeminario(seminario2);
        aluno4.setSeminario(seminario2);

        seminario.imprime();
        seminario2.imprime();
        aluno.imprime();
        aluno1.imprime();
        aluno3.imprime();
        aluno4.imprime();
        professor.imprime();
        professor1.imprime();

    }
}
