import java.util.Scanner;

import br.com.central.banco.modelos.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria dadosConta = new ContaBancaria();
        Scanner valorSacar = new Scanner(System.in);
        dadosConta.setSaldo(2500.00);

        System.out.println("Seu saldo atual: "+ dadosConta.retornaSaldo());
        System.out.println("Digite o valor que deseja sacar");
        double leitura = valorSacar.nextDouble();

        double saldo = dadosConta.Saque(leitura);
        System.out.println("Seu saldo: "+ saldo);
    }
}
