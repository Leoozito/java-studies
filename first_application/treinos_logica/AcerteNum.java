package first_application.treinos_logica;

import java.util.Random;
import java.util.Scanner;

public class AcerteNum {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num_computador = new Random().nextInt(100);

        for (int tentativas = 7; tentativas >= 0; tentativas--) {
            System.out.println("""
                
                Digite um número de 1 a 100
            
            """);
            int resposta = leitura.nextInt();
            
            if (resposta == num_computador) {
                System.out.println("Acertou !!!!! Parabéns");
            } else if (num_computador > resposta) {
                System.out.println("----------- O número é MAIOR -----------");
                System.out.println("Tente novamente, você ainda tem [ " + tentativas + " ] tentativas");
            } else if (num_computador < resposta) {
                System.out.println("------------ O número é MENOR ------------");
                System.out.println("Tente novamente, você ainda tem [ " + tentativas + " ] tentativas");
            } else if (tentativas > 5) {
                System.exit(0);
            }
        }
        
        System.out.println("O número era: {" + num_computador + "} ");
    }
}
