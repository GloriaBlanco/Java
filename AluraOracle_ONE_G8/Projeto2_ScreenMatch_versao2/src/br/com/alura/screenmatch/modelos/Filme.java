/*
// para linha
Agora é com você! Faça o mesmo procedimento que eu fiz na aula,
criando o projeto ScreenMatch no IntelliJ, sendo que nele você deve
criar a classe br.com.alura.screenmatch.modelos.Filme, contendo os atributos nome, anoDeLancamento,
duracaoEmMinutos, incluidoNoPlano, somaDasAvaliacoes e totalDeAvaliacoes,
além de também conter os métodos exibeFichaTecnica, avalia e pegaMedia.

Além disso, crie também uma outra classe contendo o métodoMAIN, no qual
você deve criar um objeto br.com.alura.screenmatch.modelos.Filme, preencher seus atributos e chamar seus métodos.
*/

package br.com.alura.screenmatch.modelos;
public class Filme {

    public String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("############ Classe br.com.alura.screenmatch.modelos.Filme #####");
        System.out.println("Nome do filme: " +nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Duração do filme em minutos: " +duracaoEmMinutos);
        System.out.println("Está incluído no plano: " +incluidoNoPlano);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
        System.out.println("somadasavaliacoes: " +somaDasAvaliacoes);
        System.out.println("Total de avaliaçoes: " + getTotalDeAvaliacoes());
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / (totalDeAvaliacoes);
    }

}
