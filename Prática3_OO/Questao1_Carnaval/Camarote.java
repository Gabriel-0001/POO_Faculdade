package Questao1_Carnaval;

public class Camarote extends Ingresso{

    private double valorAdicional;
    private String localizacaoCamarote;
    public Camarote(double valorIngresso, double valorAdicional, String localizacaoCamarote) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
        this.localizacaoCamarote = localizacaoCamarote;
    }

    public void imprimeCamarote (){
        System.out.println("Ingresso Camorote. Valor do ingresso normal R$ "+getValorIngresso());
        setValorIngresso(valorAdicional+getValorIngresso());
        System.out.println("Valor com o adiconal R$"+ getValorIngresso()
                +"\n Localizacao do camarote: "+localizacaoCamarote);

    }
    
}
