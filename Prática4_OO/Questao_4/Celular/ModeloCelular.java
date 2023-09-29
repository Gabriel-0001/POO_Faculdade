package Questao_4.Celular;

public interface ModeloCelular {
        /*A interface de uso de um celular é composta por recursos como ligar e desligar o
                celular, câmera, acessa ao fone de ouvido e controle de volume.
        Todos os recursos são do tipo SIM ou Não (verdadeiro ou Falso).*/
        void ligar();
        void desligar();
        void ligarDesligar (boolean acao);
        void celular (boolean acao);
        void acessaFone (boolean acao);
        void controleVolume (boolean acao);

        void enviarMensagem(boolean simOuNao);
        void acessarInternet(boolean simOuNao);
        void enviarEmail(boolean simOuNao);
        void usarRadio(boolean simOuNao);
        void assistirTV(boolean simOuNao);
        void verificarSistemaDeArquivos(boolean simOuNao);


    }


