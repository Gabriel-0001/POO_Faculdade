package QUESTAO_1;

public class Pix extends Pagamento{
    private boolean comprovanteTransacaoPix;

    public Pix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Data do pagamento: "+getDataHoraPagamento()+
                "Numero do pagamento: "+getNumeroPagamento()+
                "valor pago: "+getValorPago()+
                "Comprovante da transacao: "+comprovanteTransacaoPix;
    }
}
