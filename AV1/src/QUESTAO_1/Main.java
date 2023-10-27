package QUESTAO_1;

public class Main {
    public static void main(String[] args) {
        Pagamento cartaoDebito = new CartaoDebito("21097856334","Gabriel");
        cartaoDebito.setDataHoraPagamento("21;09");
        cartaoDebito.setNumeroPagamento(500);
        cartaoDebito.setValorPago(1500);

        System.out.println(cartaoDebito.imprimirCupomFiscal());

        Pagamento cartaoCredito = new CartaoCredito("09089098","Matercard","Joaozinho de barro");
        cartaoCredito.setDataHoraPagamento("4:20");
        cartaoCredito.setValorPago(1600);
        cartaoCredito.setNumeroPagamento(400);

        System.out.println(cartaoCredito.imprimirCupomFiscal());

        Pagamento pix = new Pix(true);
        pix.setDataHoraPagamento("5:20");
        pix.setValorPago(12000);
        pix.setNumeroPagamento(200);
    }
}
