import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Criar objetos de Categoria
        Categoria categoria1 = new Categoria("Musica legalzinha");
        Categoria categoria2 = new Categoria("Musica muito pica");

        // Criar objetos de Produto
        Evento evento1 = new Evento("Modinha Sertaneja", new Date("09/09/2009"), 150, "muito pica",5, categoria1);
        Evento evento2 = new Evento("DJ Ws da Igrejinha Fest", new Date("05/05/2035"), 200, "Fodasticamente bom",2, categoria2);
        Evento eveno3 = new Evento("Matue fest", new Date("09/09/2079"), 450, "Oto patamar",6, categoria2);
        Evento evento4 = new Evento("Tz da coronel hip hop ", new Date("06/06/2054"), 400, "Daora ta", 6,categoria1);
        Evento evento5 = new Evento("Djonga Fogo nos racista rap festival", new Date("02/02/2020"), 500, "Incrivelmente fodasticamente top", 10,categoria2);

        // Criar objetos de PedidoItem
        PedidoItem item1 = new PedidoItem("Liquidos", 1, evento1.getPrecoEvento());
        PedidoItem item2 = new PedidoItem("Liquidos", 2, evento2.getPrecoEvento());
        PedidoItem item3 = new PedidoItem("Liquidos", 1, eveno3.getPrecoEvento());
        PedidoItem item4 = new PedidoItem("Água ", 5, evento4.getPrecoEvento());

        // Criar objetos de Pedido
        Pedido pedido1 = new Pedido(1, 0, 1);
        Pedido pedido2 = new Pedido(2, 0, 1);

        // Adicionar produtos a um ArrayList de Produtos
        ArrayList<Evento> listaProdutos = new ArrayList<>();
        listaProdutos.add(evento1);
        listaProdutos.add(evento2);
        listaProdutos.add(eveno3);
        listaProdutos.add(evento4);
        listaProdutos.add(evento5);

        // Adicionar pedidos a um ArrayList de Pedidos
        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        // Inserir itens nos pedidos
        pedido1.inserirItensPedido(item1);
        pedido1.inserirItensPedido(item2);
        pedido1.inserirItensPedido(item3);

        pedido2.inserirItensPedido(item2);
        pedido2.inserirItensPedido(item4);

        // Imprimir informações no terminal
        System.out.println("Lista de Produtos:");
        for (Evento produto : listaProdutos) {
            System.out.println("Nome do produto: " + produto.getNomeEvento());
            System.out.println("Valor: " + produto.getPrecoEvento());
            System.out.println("Numeração: " + produto.getDescEvento());
            System.out.println("Estoque : " + produto.getQtdeIngresso());
            System.out.println("Categoria: " + produto.getCategoria().getDescCategoria());
            System.out.println("---------------------------");
        }

        System.out.println("\nLista de Pedidos:");
        for (Pedido pedido : listaPedidos) {
            System.out.println("Número de Pedido: " + pedido.getNumeroPedido());
            System.out.println("Data e Hora : " + pedido.getDataHoraPedido());
            System.out.println("Preço Completo: " + pedido.getPrecoTotal());
            System.out.println("Status : " + pedido.getStatusPedido());
            System.out.println("Itens Pedido:");
            for (PedidoItem item : pedido.getItensPedido()) {
                System.out.println("  Nome  Item: " + item.getNomeEvento());
                System.out.println("  Quantidade: " + item.getQtdeIngresso());
                System.out.println("  Preço Unico: " + item.getPacoteIngresso());
                System.out.println("---------------------------");
            }
            System.out.println("---------------------------");
        }
    }
}