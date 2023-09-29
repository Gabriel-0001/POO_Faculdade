package Questao_4.Celular;

public class Main {
    public static void main(String[] args) {
/*Crie um main() para “mocar” os dados e testar os objetos das classes. Exemplo:
• O Fabricante celular A possui todos os recursos comuns aos celulares, porém não
tem TV. O seu valor é R$ 6800.00
• O Fabricante celular B possui todos os recursos comuns aos celulares, porém não
tem rádio. O seu valor é R$ 5200,00.*/
        CelularGenerico Iphone = new CelularFabricanteA();
        CelularGenerico Samsung = new CelularFabricanteB();

        System.out.println("Celular Fabricante A:");
        System.out.println("Preço: R$" + Iphone.getPreco());
        Iphone.ligar();
        Iphone.usarCamera(true);
        Iphone.enviarMensagem(true);
        Iphone.assistirTV(false);

        System.out.println("\nCelular Fabricante B:");
        System.out.println("Preço: R$" + Samsung.getPreco());
        Samsung.ligar();
        Samsung.usarRadio(false);
        Samsung.acessarInternet(true);
        Samsung.enviarEmail(true);
    }

    }
}

