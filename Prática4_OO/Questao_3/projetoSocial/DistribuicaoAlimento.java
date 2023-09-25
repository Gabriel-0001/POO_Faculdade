package Questao_3.projetoSocial;

public class DistribuicaoAlimento extends Projeto{
    private String descAlimento;
    private float qtde;

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String ecdereco, String dataInicio,
            String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, ecdereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public boolean validaProjeto(){
        if(getDataFim().isEmpty()){
            return true;
        }
        return false;
    }

    public String imprimeProjeto(){
        return "\n******************************"
        +"\nNome do Projeto: "+getNomeProjeto()
        +"\nDescricao do projeto: "+getDescricao()
        +"\nData incio: "+getDataInicio()
        +"\nData fim: "+getDataFim()
        +"\n Descricao alimeto: "+descAlimento
        +"\nQuantidade: "+qtde
        +"\n******************************";
    }
}
