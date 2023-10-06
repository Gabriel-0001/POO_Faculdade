package QUESTAO_1;

public class CartaoDebito extends Pagamento{
    private String numeroCartao;
    private String titularCartao;

    public CartaoDebito(String numeroCartao, String titularCartao) {
        this.numeroCartao = numeroCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Data do pagamento: "+getDataHoraPagamento()+
                "Numero do pagamento: "+getNumeroPagamento()+
                "Valor pago: "+getValorPago()+
                "Numero cartao: "+getNumeroCartao()+
                "Titular do cartao: "+getTitularCartao();
    }


}
