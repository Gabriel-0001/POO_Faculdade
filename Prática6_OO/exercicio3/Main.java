package exercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Artigo> listaArtigos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Artigo artigo = new Artigo("Titulo " + i, "Resumo " + i, "Autor " + i);
            listaArtigos.add(artigo);
        }

        Edicao edicao = new Edicao(1, 1, "21/10/2023", 1000);
        for (Artigo a : listaArtigos) {
            edicao.adicionaArtigo(a);

        }

        RevistaCientifica revista = new RevistaCientifica("POO na Newton", 1234567890123L, "Semestral");
        revista.adicionaEdicao(edicao);
        for (Artigo a: listaArtigos){
            System.out.println("Titulo: "+revista.getTitulo()+
                    "\nissn: "+revista.getIssn()+
                    "\nPeridiocidade: "+revista.getPeridiocidade()+
                    "\nEdicoes: "+edicao.getDataEdicao()+
                    "\nArtigo: "+a.getResumo());
        }
        //System.out.println(revista.toString());

    }
}
