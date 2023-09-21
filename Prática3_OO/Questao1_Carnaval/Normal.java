package Questao1_Carnaval;

public class Normal extends Ingresso{

    public Normal(double valorIngresso) {
        super(valorIngresso);
    }

    public void imprimeNormal(){
        System.out.println("Ingresso Normal. Valor do ingresso: "+getValorIngresso());
    }
    
}