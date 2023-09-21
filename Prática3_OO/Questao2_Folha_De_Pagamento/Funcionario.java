package Questao2_Folha_De_Pagamento;

public class Funcionario {
    private int matricula;
    private String nome;
    private double salario;
    
    public Funcionario(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularProventos (){
        double proventos = 0.0;
        return proventos;
    }

    public String toString() {
        return "Funcionario matricula = " + matricula + ", nome = " + nome + ", salario R$" + salario;
    }


}
