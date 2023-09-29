package Questao_4.Celular;

    abstract class CelularGenerico implements ModeloCelular{
        private double preco;

        public CelularGenerico(double preco) {
            this.preco = preco;
        }

        public double getPreco() {
            return preco;
        }
    }

