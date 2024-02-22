package first_application.src;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leitura.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = leitura.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = leitura.nextDouble();
    
        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");
    }
}
