package Questao2_Folha_De_Pagamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Cadastroo de funcionario-----------");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Matricula: ");
        int matricula = sc.nextInt();
        System.out.print("Salario: R$");
        double salario = sc.nextDouble();
        System.out.println("Tipo \n1)Padrao\n2)Comissiondo\n3)Produtividade: ");
        int tipo = sc.nextInt();

        Funcionario funcionario;

        if (tipo == 1){
            funcionario = new FPadrao(matricula, name, salario);
            System.out.println("Salario do funcionario Padroa: R$"+((FPadrao)funcionario).calcularProventos());
        }else if (tipo == 2){
            System.out.println("Percentual sobre as vendas: ");
            float percentual = sc.nextFloat();
            System.out.println("Quantidade vendida em especie: R$");
            double vendas = sc.nextDouble();
            funcionario = new FComissionado(matricula, name, salario, percentual,vendas);
            System.out.println("Salario do funcionario Comissionado: R$"+((FComissionado)funcionario).calcularProventos());
        } else if (tipo == 3) {
            System.out.println("Digite o valor por producao: R$");
            double valor = sc.nextDouble();
            System.out.println("Digite a quantidade de unidades produzidas: ");
            int producao = sc.nextInt();
            funcionario = new FProdutivade(matricula, name, salario, valor,producao);
            System.out.println("Salario do funcionario Produtividade: R$"+((FProdutivade)funcionario).calcularProventos());
        }

    }
}
