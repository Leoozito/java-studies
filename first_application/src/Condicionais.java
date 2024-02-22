// if else & switch case

package first_application.src;

public class Condicionais {
    public static void main(String[] args) {
        String sinal = "Vermelho";
        
        switch (sinal) {
            case "Vermelho":
                System.out.println("Carro parado");
                break;
            case "Amarelo":
                System.out.println("Desacelere o carro e pare o carro");
                break;
            default:
                System.out.println("Sinal aberto, prossiga!");
                break;
        }

        int lancamento = 2021;
        double media = (9.9 + 9.5 + 8.0) / 3;

        if (media >= 7 && lancamento >= 2020) {
            System.out.println("Um filme recente está sendo bem avaliado");
        } else if (media >= 7 || lancamento >= 2020) {
            System.out.println("Veja os filmes recém lançados ou com melhores avaliação");
        } else {
            System.out.println("Outros filmes");
        }
    }
}
