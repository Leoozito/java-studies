package src;

public class Main {
    public static void main(String[] args) {
        // atribuindo valores às variaveis do meu objeto
        Filme meuFilme = new Filme();
        meuFilme.nome = "Ilha do Medo";
        meuFilme.anoLancamento = 2017;
        meuFilme.duracaoMinutos = 180;

        // chamando funções do meu objeto
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(7.2);
        meuFilme.avalia(10);

        System.out.println("Avaliação do Filme: " + meuFilme.avaliacao);
        System.out.println("Total de Avaliações: " + meuFilme.totalAvaliacoes);
        
        System.out.println("Media avaliação: "+ meuFilme.mediaAvaliacoes());
    }
}
