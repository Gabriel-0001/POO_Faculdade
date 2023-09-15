import java.util.Scanner;

public class CalculaRendimento {
    private float investimentoInicial;
    private float taxaDoRendimento;
    private int numeroDeMeses;

    public CalculaRendimento(float investimentoInicial, float taxaDoRendimento, int numeroDeMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaDoRendimento = taxaDoRendimento;
        this.numeroDeMeses = numeroDeMeses;
    }

    public void calculaRendimento(){
        for(int i =0; i < numeroDeMeses; i++){
            investimentoInicial += (investimentoInicial*taxaDoRendimento)/100;
            System.out.printf("Rendimento no mes "+ (i+1) +" = R$ %.2f",investimentoInicial);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o investimento inicial: ");
        float investInicial = sc.nextFloat();
        System.out.print("Qual a taxa de investimeno (somente numeros): ");
        float taxa = sc.nextFloat();
        System.out.print("Quantidade de meses que vai investir: ");
        int meses = sc.nextInt();

        CalculaRendimento calcularRendimento = new CalculaRendimento(investInicial, taxa, meses);

        calcularRendimento.calculaRendimento();

    }
}
