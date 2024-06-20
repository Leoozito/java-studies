package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private double avaliacao;
    private int totalAvaliacoes; // privando de ser modificado em outras classes
    private int duracaoMinutos;
    private int anoLancamento;

    // como os valores estão privados, para utiliza-los em outras class, temos que settar:
    public void SetNome(String nome) {
        this.nome = nome;
    }

    public void SetAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void SetAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void SetDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }


    // void quando não RETORNA NADA
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota) {
        avaliacao += nota;
        totalAvaliacoes++;
    }

    public int retornaTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public double mediaAvaliacoes() {
        return avaliacao / totalAvaliacoes;
    }
}