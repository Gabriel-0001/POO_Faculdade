package Questão_1_Concecionária;

public class Carro {
    String tipoVeiculo;
    String nomeModelo;
    int anoFabricaco;
    int anoModelo;

    public String  defineAutomovel (){
       return "Com base nos parametros da classe o método define que veiculo eh";
    }
    public double valorAutomovel (){
        if (defineAutomovel() == "Cb 300f"){
            System.out.println("retorna o valor do veiuculo");
        } 
        return 19.000;
         
    }
    public int codCarro(){
        System.out.println("Retorna o codigo do produto com base no seu valor e modelo");
    }
    return 1;
    
}
