package QUESTAO_1;

abstract class Pagamento {
    private String dataHoraPagamento;
    private int numeroPagamento;
    private double valorPago;

    public String getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(String dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public void setNumeroPagamento(int numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }


    public void pagamento(){

    };
    public void pagamento(String dataHoraPagamento, int numeroPagamento, double valorPago){};

    public abstract String imprimirCupomFiscal();

}
