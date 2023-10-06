package QUESTAO_2;

public class Main {
    public static void main(String[] args) {
        Pessoa professor = new Professor(1000, 50);
        Pessoa aluno = new Aluno(3, 506);
        professor.setNome("Michele");
        professor.setEmail("michel2email");
        professor.setSenha("admin123");
        aluno.setNome("Xamuel");
        aluno.setEmail("xamule@ewail");
        aluno.setSenha("123456nome");

        System.out.println(((Professor) professor).mostraProfessor());
        System.out.println(((Aluno) aluno).mostraAluno());
    }
}
