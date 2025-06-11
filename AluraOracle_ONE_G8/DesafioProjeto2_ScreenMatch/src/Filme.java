/*
// para linha
Agora é com você! Faça o mesmo procedimento que eu fiz na aula,
criando o projeto ScreenMatch no IntelliJ, sendo que nele você deve
criar a classe Filme, contendo os atributos nome, anoDeLancamento,
duracaoEmMinutos, incluidoNoPlano, somaDasAvaliacoes e totalDeAvaliacoes,
além de também conter os métodos exibeFichaTecnica, avalia e pegaMedia.

Além disso, crie também uma outra classe contendo o métodoMAIN, no qual
você deve criar um objeto Filme, preencher seus atributos e chamar seus métodos.
*/

public class Filme {

    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("############ Classe Filme #####");
        System.out.println("Nome do filme: " +nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Duração do filme em minutos: " +duracaoEmMinutos);
        System.out.println("Está incluído no plano: " +incluidoNoPlano);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
        System.out.println("somadasavaliacoes: " +somaDasAvaliacoes);
        System.out.println("totaldasavaliacoes: " +totalDeAvaliacoes);
    }

    double pegaMedia() {
        return somaDasAvaliacoes / (totalDeAvaliacoes);
    }

}
