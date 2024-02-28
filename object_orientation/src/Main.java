import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        // atribuindo valores às variaveis do meu objeto
        Filme meuFilme = new Filme();
        meuFilme.SetNome("Ilha do Medo");
        meuFilme.SetAnoLancamento(2017);
        meuFilme.SetDuracaoMinutos(180);

        // chamando funções do meu objeto
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(7.2);
        meuFilme.avalia(10);

        System.out.println("Total de Avaliações: " + meuFilme.retornaTotalAvaliacoes());
        
        System.out.println("Media avaliação: "+ meuFilme.mediaAvaliacoes());
    }
}
