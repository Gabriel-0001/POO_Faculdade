package Questao2_Folha_De_Pagamento;

public class FPadrao extends Funcionario{

    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }



    public double calcularProventos(){
       return getSalario();
    }
}
