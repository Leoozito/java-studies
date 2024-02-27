package src;
public class Filme {
    String nome;
    double avaliacao;
    int totalAvaliacoes;
    int duracaoMinutos;
    int anoLancamento;

    
    // criação de métodos

    // void quando não RETORNA NADA
    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        avaliacao += nota;
        totalAvaliacoes++;
    }

    double mediaAvaliacoes() {
        return avaliacao / totalAvaliacoes;
    }
}