package Questao2_Folha_De_Pagamento;

public class FComissionado extends Funcionario{
    private double percentual;
    private double vendas;
    
    public FComissionado(int matricula, String nome, double salario, double percentual, double vendas) {
        super(matricula, nome, salario);
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public double calcularProventos(){
        double proventos = percentual * vendas;
        return proventos;
    }
    
}
