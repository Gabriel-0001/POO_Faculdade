package Questao2_Folha_De_Pagamento;

public class FProdutivade  extends Funcionario{
    private double valor;
    private int producao;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getProducao() {
        return producao;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }

    public FProdutivade(int matricula, String nome, double salario, double valor, int producao) {
        super(matricula, nome, salario);
        this.valor = valor;
        this.producao = producao;
    }

    public double calcularProventos(){
        double proventos = (getValor()* getProducao())+getSalario();
        return proventos;
    }
    
}
