package Questao2_Folha_De_Pagamento;

public class FProdutivade  extends Funcionario{
    private double valor;
    private int producao;

    


    public FProdutivade(int matricula, String nome, double salario, double valor, int producao) {
        super(matricula, nome, salario);
        this.valor = valor;
        this.producao = producao;
    }

    public double calcularProventos(){
        double proventos = 0.0;
        return proventos;
    }
    
}
