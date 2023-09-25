package Questao_1.contaAbstract;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Conta classe pricipal
 */
abstract class Conta {

    private double saldo;

    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void imprimeExtrato();

}
