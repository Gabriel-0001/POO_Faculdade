package Questão_2_EmpregoFaculdade;

public class EmpregoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;
    double getGastos(){
       return horasAula*40; 
    }
    String getInfo(){
        return "nome:” + this.nome + " com salário “ + this.salario;
    }
    
    
}

/*a) Alterar o método getGastos() para somar um bônus de R$ 40 reais por hora/aula.
b) Alterar o método getInfo () para retornar atualizado o valor que o professor irá
receber (salário + bônus).
c) Criar no Void main() um objeto e exibir na tela os resultados dos métodos
getGastos() e getInfo (). */