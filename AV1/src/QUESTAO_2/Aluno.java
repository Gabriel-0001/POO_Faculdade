package QUESTAO_2;

public class Aluno extends Pessoa{
    private int periodo;
    private int turma;

    public Aluno(int periodo, int turma) {
        this.periodo = periodo;
        this.turma = turma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public String mostraAluno(){
        return "Nome: "+getNome()+
                "email: "+getEmail()+
                "Periodo: "+getPeriodo()+
                "Turma: "+getTurma();
    }
}
