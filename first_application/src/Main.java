package first_application.src;
public class Main {
    public static void main(String[] args) {
        System.out.println("""
            Alô Mundo
        --------------------------------------
        """);
        // declarações de variavel de diversos tipos e concatenação
        int lancamento = 2021;
        double media = (9.9 + 9.5 + 8.0) / 3;
        String descricaoFilme = """
            Filme: Ilha do Medo
            Ator: Leonardo Di Caprio

           Lançamento:""" + lancamento + """
            
           Nota média do publico:""" + media;

        System.out.println(descricaoFilme);

        // IMPORTANTE - Casting: Abaixo um exemplo de fazer um casting
        int totalEstrelasAvaliacao = (int) media / 2;
        // a variavel media não é de tipo int, e para fazer com que a variavel do tipo int aceite a logica feita com uma variavel de tipo diferente, fazemos o Casting, colocando (int).
        System.out.println(totalEstrelasAvaliacao);
    }
}

