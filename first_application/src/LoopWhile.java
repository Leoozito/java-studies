// FIBONACCI COM WHILE

package first_application.src;

public class LoopWhile {
    public static void main(String[] args) {
        int numeroAnterior = 0;
        int numeroSeguinte = 1;

        int qntdNumImprimidos = 0;
        while (qntdNumImprimidos <= 20) {
            int soma = numeroAnterior + numeroSeguinte;
            numeroAnterior = numeroSeguinte;
            numeroSeguinte = soma;

            System.out.println("Números FIBONACCI: " + numeroSeguinte);
            qntdNumImprimidos++;

        }
    }
}
