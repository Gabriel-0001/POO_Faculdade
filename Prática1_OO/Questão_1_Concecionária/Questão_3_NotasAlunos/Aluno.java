package Questão_3_NotasAlunos;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private double notaAV1, notaAV2, notaAE;
    private String curso;
    private int periodo;
    public Aluno(String nome, String matricula, double notaAV1, double notaAV2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void alteraNotaAV1(double novaNotaAV1) {
        this.notaAV1 = novaNotaAV1;
    }

    public void alteraNotaAV2(double novaNotaAV2) {
        this.notaAV2 = novaNotaAV2;
    }

    public void alteraNotaAE(double novaNotaAE) {
        this.notaAE = novaNotaAE;
    }    

    void avaliarAluno(){
        if (notaAV1 + notaAV2 >= 60){
            System.out.println("Aprovado");
        }else{
        System.out.println("Recuperacao");
        }
    }

    void avaliarRecuperacao(double notaAE){
        double media = notaAV1 + notaAV2 + notaAE /3;
        if(media>=60){
            System.out.println("Aprovado");
        }else{
        System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Nota da AV1: ");
        double notaAV1 = scanner.nextDouble();

        System.out.print("Nota da AV2: ");
        double notaAV2 = scanner.nextDouble();

        System.out.print("Curso: ");
        scanner.nextLine();  // Consumir a quebra de linha pendente
        String curso = scanner.nextLine();

        System.out.print("Período: ");
        int periodo = scanner.nextInt();

        Aluno aluno = new Aluno(nome, matricula, notaAV1, notaAV2, curso, periodo);

        aluno.avaliarAluno();

        System.out.print("Nota da AE (para recuperação, caso necessário): ");
        double notaAE = scanner.nextDouble();

        if (notaAE > 0) {
            aluno.alteraNotaAE(notaAE);
            aluno.avaliarRecuperacao(notaAE);
        }

        scanner.close();
    }


    
}