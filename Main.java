package armazen;

import armazen.Estoque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque e1 = new Estoque(1, "Arroz", 10, 25);//Usando o construtor da classe Estoque nessa linha de codigo
        Estoque e2 = new Estoque(2, "Feijão", 10, 5.65);//Usando o construtor da classe Estoque nessa linha de codigo
        Estoque e3 = new Estoque(3, "Açucar", 10, 16);//Usando o construtor da classe Estoque nessa linha de codigo

        e1.Acrescimo(100);
        System.out.println(e1.ConsultaEstoque());
        e2.Baixa(7);
        System.out.println(e2.ConsultaEstoque());
        System.out.println(e3.ConsultaEstoque());
        //System.out.println(e3.TotalEstoque());

        Scanner sc = new Scanner(System.in);
        int id, estoque;
        String produto;
        double preco;

        System.out.println("id: ");
        id = sc.nextInt();
        System.out.println("Name product: ");
        produto = sc.nextLine();
        produto = sc.nextLine();
        System.out.println("Estoque: ");
        estoque = sc.nextInt();
        System.out.println("Preço: R$");
        preco = sc.nextDouble();

        Estoque e4 = new Estoque(id, produto, estoque, preco);


    }
}