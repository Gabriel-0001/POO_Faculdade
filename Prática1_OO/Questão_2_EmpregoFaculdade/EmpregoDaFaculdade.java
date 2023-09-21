package Questão_2_EmpregoFaculdade;

public class EmpregoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    
    public EmpregoDaFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    double getGastos() {
        return salario+(horasAula*40);
    }

    public double getSalario() {
        return salario;
    }

    String getInfo(){
        return "nome: "+ this.nome + "Salário = " + this.getGastos(); 
    }
    
    public static void main(String[] args) {
        EmpregoDaFaculdade empregoDaFaculdade = new EmpregoDaFaculdade("Joazin da POO", 5000.00, 15);

        System.out.println(empregoDaFaculdade.getInfo());

        
    }
    
}


/*a) Alterar o método getGastos() para somar um bônus de R$ 40 reais por hora/aula.
b) Alterar o método getInfo () para retornar atualizado o valor que o professor irá
receber (salário + bônus).
c) Criar no Void main() um objeto e exibir na tela os resultados dos métodos
getGastos() e getInfo (). */