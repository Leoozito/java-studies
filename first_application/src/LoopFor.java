package first_application.src;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int bimestre = 1; bimestre <= 4; bimestre++) {
            System.out.println("Digite a nota do " + bimestre + "° bimestre:");

            nota = leitura.nextDouble();

            mediaAvaliacao += nota / 4;
        }

        System.out.println("Sua média final: " + mediaAvaliacao);
    }
}
