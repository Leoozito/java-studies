package br.com.central.banco.modelos;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    } 

    public double Saque(double valor_saque){
        if (valor_saque <= saldo) {
            saldo -= valor_saque;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }

    public double retornaSaldo() {
        return saldo;
    }
}
