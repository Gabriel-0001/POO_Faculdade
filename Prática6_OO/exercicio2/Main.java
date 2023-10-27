package exercicio2;

public class Main {
    public static void main(String[] args) {
        Funcionario[] listaFuncionarios = new Funcionario[5];
        listaFuncionarios[0] = new Funcionario("Bielzin ", "bielFoot@email.com", "7777-2121", "Business Intelligence", 2300.00, "12/09/2023", "mg40228922");


        for (Funcionario f : listaFuncionarios) {
            f.mostrarDados();
        }

        Empresa empresa = new Empresa("Mecanica Simas Turbo Ltda", "12.345.678/0001-99");
        for (Funcionario f : listaFuncionarios) {
            empresa.adicionarFuncionario(f);
        }
    }
}
