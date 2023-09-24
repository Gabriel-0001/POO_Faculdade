package Questao1_Carnaval;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ingresso ingresso = new Ingresso();

        System.out.print("Escolha a sua opcao: "
                + "\n1) Ingresso Normal"
                + "\n2) VIP"
                + "\n3) Camarote"
                + "\n Sua opcao: ");

        Ingresso ingressoSelecionado = null;
        int opc = sc.nextInt();
        if (opc == 1) {
            ingressoSelecionado = new Normal(50);
            ((Normal) ingressoSelecionado).imprimeNormal();

        } else if (opc == 2) {
            ingressoSelecionado = new VIP(50, 20);
            ((VIP) ingressoSelecionado).imprimeVIP();
        } else if (opc == 3) {
            ingressoSelecionado = new Camarote(50, 40, "Belo Horizonte");
            ((Camarote) ingressoSelecionado).imprimeCamarote();
        }

    }
}
