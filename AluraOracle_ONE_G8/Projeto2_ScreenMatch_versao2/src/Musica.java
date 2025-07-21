/* Crie uma classe Musica com atributos titulo, artista,
anoLancamento, avaliacao e numAvaliacoes, e métodos para
exibir a ficha técnica, avaliar a música e calcular a média
de avaliações.
 */
public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double soma;
    int qtdeAvaliacoes;

    void impressao() {
        System.out.println("############ Classe Música #####");
        System.out.println("Título da música: " +titulo);
        System.out.println("Artista da música: " +artista);
        System.out.println("Ano de lançamento: " +anoLancamento);
    }

    void avaliaometodo(double nota) {
        soma += nota;
        qtdeAvaliacoes++;
        System.out.println("somadasavaliacoes: " +soma);
        System.out.println("totaldasavaliacoes: " +qtdeAvaliacoes);
    }

    double Media() {
        return soma / (qtdeAvaliacoes);
    }

}

