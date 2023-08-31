package Questão_1_Concecionária;

public class Transacao {
    Cliente cliente = new Cliente();
    Carro carro = new Carro();

    public int definiModoDePagamento() {
        System.out.println("Seleciona e retorna o modo de pagamento esclhido pelo cliente"+
        "1) PIX"+
        "2)Boleto"+
        "3) Credito"+
        "4) Financiamento");
        return 1;
    }
    public boolean fazPagamento(int codCliente, int codCarro, int definiModoDePagamento){
        System.out.println("Metodo defini o valor a ser cobrado e qual cliente deve ser cobrado e metodo de pagamento, assim realizando pagamento"+
        "Retorna a confirmação do pagameto"+
        "True = pago"+
        "False = não pago");
        return true;
    }
    
    
}
