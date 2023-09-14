package Questao1_Estoque;

public class Estoque {
    private String name;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String name, int qtdAtual, int qtdMinima) {
        this.name = name;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtd){
        if (qtdAtual - qtd > 0){
            qtdAtual -= qtd;
        }

    }

    public String mostra(){
        return "Name product: "+name+", Quantidade atual: "+qtdAtual+", Qaunrtidade minima: "+qtdMinima;
    }

    public boolean precisaRepor(){
        if(qtdAtual < qtdMinima){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
    }
}
