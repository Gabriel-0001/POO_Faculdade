package Questao1_Carnaval;

public class VIP extends Ingresso{
    private double valorAdicional;

    public VIP(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public void imprimeVIP(){
        System.out.println("Ingresso VIP. Valor normal: "+getValorIngresso());
        setValorIngresso(valorAdicional+getValorIngresso());
        System.out.println("Valor com o adcional: R$"+getValorIngresso());
    }

    
    
}
