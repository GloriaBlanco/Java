import java.util.Scanner;

/* Esta class Main tem diversos códigos de outros exercício/desafios
Eu não fiz 1 projeto para criar cada classe, senão ocuparia muito espaço
Então eu separei por nome de cada classe se precisar fazer um projeto para cada
Aqui todos os exercício/desafios são executados em uma única execuçao no Main
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
        System.out.println("Hello world!");
        System.out.println("Hello and welcome!");


        // Class Condicional
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

        // Class ExemploScanner
        // usei o import java.util.Scanner; no inicio desta class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();
        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");
        // tenho outros scanner de entrada entao so vou usar o scanner.close(); no final

        // Class Exercício1
        String nome1 = "Alura";
        String saudacao = "Olá, ";
        String mensagem = saudacao + nome1 + "!";
        String senha = "12345";
        System.out.println(mensagem);
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }
        String mensagem2 = """
                Olá, mundo!
                Este é um Text Block.
                Ele permite escrever textos com múltiplas linhas
                sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                """;
        System.out.println(mensagem2);

        // Class Exercício2
        String nome2 = "Maria";
        int idade2 = 30;
        double valor2 = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome2, idade2, valor2));
        String nome3 = "João";
        int aulas = 4;

        String mensagem1 = """
                Olá, %s!
                Boas vindas ao curso de Java.
                Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                """.formatted(nome3, aulas);

        System.out.println(mensagem1);

        // class ExercicioCase
        int dia = 3;
        String nomeDia;
        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);

        // Class Leitura
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int qualanoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println("Nome do filme " + filme);
        System.out.println("Ano de lançamento " + qualanoDeLancamento);
        System.out.println("avaliacao é nota " + avaliacao);


        // Class PrimeiroProjeto
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");
        // variáveis
        int anoDeLancamento2 = 1990;
        // ou int ano;  ano=2022;
        //convenções de código, letra miniscula, so se for composto anoLancamento
        // variaveis costumam ser ingles
        System.out.println(anoDeLancamento2);
        System.out.println("Ano de lançamento: " + anoDeLancamento2);
        boolean incluidoNoPlano2 = true;
        double notaDoFilme2 = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);
        sinopse = """ 
                Filme Top Gun
                Muito bom!
                Ano de lançamento """ + anoDeLancamento2;
        System.out.println(sinopse);
        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println("Classificação " + classificacao);
        // casting explicito, tem uma tabela
        // ou
        // int classificacao = (int) (media/2);


        // class Loop {
        Scanner leitura3 = new Scanner(System.in);
        double mediaAvaliacao3 = 0;
        double nota3 = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme  ");
            nota3 = leitura3.nextDouble();
            mediaAvaliacao3 += nota3;
        }

        System.out.println("Média de avaliações " + mediaAvaliacao3 / 3);

        // Class OutroLoop
        Scanner leitura4 = new Scanner(System.in);
        double mediaAvaliacao4 = 0;
        double nota4 = 0;
        int totalDeNotas4 = 0;

        while (nota4 != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar  ");
            nota4 = leitura4.nextDouble();

            if (nota4 != -1) {
                mediaAvaliacao4 += nota4;
                totalDeNotas4++;
            //} else { // Sem ponto e vírgula aqui
            //    break; // O break agora faz parte do bloco else
            }

        }
        System.out.println("Média de avaliações " + mediaAvaliacao4 / totalDeNotas4);

        // Class Soma
        int x = 10;
        double y = x; // casting implícito
        double x2 = 10.5;
        int y2 = (int) x2; // casting explícito
        System.out.println("Soma " + y2);

        // Class Operadores
        int a = 10; // Atribui o valor 10 à variável a
        int b = 5; // Atribui o valor 5 à variável b
        int c = 30; // Atribui o valor 30 à variável c
        System.out.println("a = " + a +"\nb = "+b+"\nc = "+c);
        System.out.println("boolean igual = (b == a); //Nesse caso a variável igual ficará com o valor false, pois o valor de b não é igual ao valor de a.");
        System.out.println("boolean diferente = (b != c); //A variável diferente ficará com o valor true, pois o valor de b é diferente do valor de c.");
        System.out.println("boolean maior = (b > a); //A variável maior ficará com o valor false, pois o valor de b é menor que o valor de a.");
        System.out.println("boolean menorIgual = (b <= c); //A variável menorIgual ficará com o valor true, pois o valor de b é menor que o valor de c.");
    }
}
