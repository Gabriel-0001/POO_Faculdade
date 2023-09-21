package Questao1_Carnaval;

public class VIP extends Ingresso{
    private double valorAdicional;

    public VIP(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public void imprimeVIP(){
        setValorIngresso(valorAdicional+getValorIngresso());
        System.out.println("Ingresso VIP. Valor: "+getValorIngresso());
    }

    
    
}
