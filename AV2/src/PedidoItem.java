public class PedidoItem {
    private String nomeEvento;
    private int qtdeIngresso;
    private double pacoteIngresso;

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public double getPacoteIngresso() {
        return pacoteIngresso;
    }

    public void setPacoteIngresso(double pacoteIngresso) {
        this.pacoteIngresso = pacoteIngresso;
    }

    public PedidoItem(String nomeEvento, int qtdeIngresso, double pacoteIngresso) {
        this.nomeEvento = nomeEvento;
        this.qtdeIngresso = qtdeIngresso;
        this.pacoteIngresso = pacoteIngresso;
    }


    public boolean atualizaEstoqueIngresso() {
        return true;
    }
}
