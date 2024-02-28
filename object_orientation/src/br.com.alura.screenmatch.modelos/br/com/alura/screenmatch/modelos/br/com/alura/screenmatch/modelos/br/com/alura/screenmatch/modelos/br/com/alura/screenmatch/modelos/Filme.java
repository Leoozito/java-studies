package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private double avaliacao;
    private int totalAvaliacoes; // privando de ser modificado em outras classes
    private int duracaoMinutos;
    private int anoLancamento;

    
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

    int retornaTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    double mediaAvaliacoes() {
        return avaliacao / totalAvaliacoes;
    }
}