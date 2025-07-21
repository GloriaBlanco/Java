/*
Crie uma classe Aluno com atributos nome, idade,
 e um métdo para exibir informações.
 Crie uma instância da classe Aluno, atribua valores
 aos seus atributos e utilize o mtodo para exibir as informações.
 */
public class Aluno {
    String nome;
    int idade;

    void impressao() {
        System.out.println("Nome do aluno : " + nome);
        System.out.println("Idade do aluno : " + idade);
    }
}
