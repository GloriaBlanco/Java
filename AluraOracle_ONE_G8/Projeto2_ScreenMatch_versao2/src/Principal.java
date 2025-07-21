import br.com.alura.screenmatch.modelos.Filme;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // classe br.com.alura.screenmatch.modelos.Filme
        Filme favorito = new Filme();

        favorito.setNome("Um Senhor Estagiário");
        favorito.setAnoDeLancamento(2015);
        favorito.setDuracaoEmMinutos(121);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(7);
        favorito.avalia(7);
        favorito.avalia(7);

        System.out.println("Total de avaliações: " + favorito.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());

        favorito.setNome("Além do tempo");
        favorito.setAnoDeLancamento(2023);
        favorito.setDuracaoEmMinutos(127);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(10);
        favorito.avalia(7);
        favorito.avalia(7);

        System.out.println("Total de avaliações: " + favorito.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());

        // Classe Pessoa
        Pessoa pessoaobj = new Pessoa();
        pessoaobj.olaMundo();

        // Classe Calculadora
        Calculadora calculos = new Calculadora();
        int calculodobro = calculos.dobro(7);
        System.out.println("o dobro é " + calculodobro);

        // Classe Musica
        Musica objmusica = new Musica();

        objmusica.titulo = "Blue Monday";
        objmusica.artista = "New Order";
        objmusica.anoLancamento = 2005;

        objmusica.impressao();

        objmusica.avaliaometodo(10);
        objmusica.avaliaometodo(9);
        objmusica.avaliaometodo(10);

        System.out.println("Média de avaliações da Música: " + objmusica.Media());

        // Classe Carro
        Carro objcarro = new Carro();

        objcarro.modelo = "Clio";
        objcarro.ano = 2001;
        objcarro.cor = "preto";

        objcarro.impressao();

        System.out.println("o carro " + objcarro.modelo + "tem " + objcarro.idadecarro() + " anos");

        // Classe Aluno
        System.out.println("############ Classe Aluno ########");

        Aluno objaluno = new Aluno();

        objaluno.nome = "Gloria";
        objaluno.idade = 15;
        objaluno.impressao();

        objaluno.nome = "Amanda";
        objaluno.idade = 25;
        objaluno.impressao();

        objaluno.nome = "André";
        objaluno.idade = 17;
        objaluno.impressao();

        //System.out.println("o carro " + objcarro.modelo + " tem " +objcarro.idadecarro() + " anos");

        // Classe Conta
        Conta c1 = new Conta();
        c1.saldo = 700;
        c1.sacar(70);

        Conta objconta = new Conta();
        System.out.println("Total de avaliações: " + favorito.getTotalDeAvaliacoes());

        //System.out.println("saldo " + objconta.getAgencia());

        // Classe ParImpar
        ParImpar objparimpar = new ParImpar();
        if (objparimpar.valor % 2 == 0) {
            System.out.println("O número " + objparimpar.valor + " é par.");
        } else {
            System.out.println("O número " + objparimpar.valor + " é ímpar.");
        }

        // Class Aprovado
        Aprovado objaprovado = new Aprovado();
        if (objaprovado.media >= 7.0) {
            System.out.println("O aluno teve média " + objaprovado.media + " e foi aprovado.");
        } else if (objaprovado.media >= 5.0) {
            System.out.println("O aluno teve média " + objaprovado.media + " e está de recuperação.");
        } else {
            System.out.println("O aluno teve média " + objaprovado.media + " e foi reprovado.");
        }

        // Class SenhaConfirma
        SenhaConfirma objsenha = new SenhaConfirma();

        System.out.print("Entre com a senha: ");
        objsenha.tentativa1 = scanner.nextLine();
        //scanner.close();
        if (objsenha.tentativa1.equals(objsenha.senha)) {
            System.out.println("Senha Ok, acesso permitido");
        } else {
            System.out.println("Senha incorreta");
        }

        // agora com a senha = 123
        System.out.print("Entre com a senha de acesso negado: ");
        objsenha.tentativa2 = scanner.nextLine();
        //scanner.close();
        if (objsenha.tentativa2.equals(objsenha.senha2)) {
            System.out.println("Senha Ok, acesso NEGADO");
        } else {
            System.out.println("Senha incorreta");
        }
        // Class Diasemana

        Diasemana objdiasem = new Diasemana();
        System.out.print("****** Verificar dia da semana é dia útil *****");
        System.out.println();
        System.out.print("Digite o dia da semana: ");

        objdiasem.diautil = scanner.nextLine().toLowerCase();
        //String dias = scanner.nextLine().toLowerCase();

        if (objdiasem.diautil.equals("segunda") || objdiasem.diautil.equals("terca") ||
                objdiasem.diautil.equals("quarta") || objdiasem.diautil.equals("quinta") ||
                objdiasem.diautil.equals("sexta")) {
            System.out.println(objdiasem.diautil + " é um dia útil.");
        } else {
            System.out.println(objdiasem.diautil + " não é um dia útil.");
        }

        /*
        if (objdiasem.dias.equals("segunda") || objdiasem.dias.equals("terca") ||
            objdiasem.dias.equals("quarta") || objdiasem.dias.equals("quinta") ||
            objdiasem.dias.equals("sexta")) {
            System.out.println(objdiasem.dias + " é um dia útil.");
        } else {
            System.out.println(objdiasem.dias + " não é um dia útil.");
        }*/
        //scanner.close();


        // Class Comparar2numeros
        Comparar2numeros objcomparar = new Comparar2numeros();
        //Scanner scanner = new Scanner(System.in);
        System.out.print("***** Vamos comparar 2 números ******");
        System.out.println();
        System.out.print("Digite o primeiro número : ");
        objcomparar.numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        objcomparar.numero2 = scanner.nextInt();

        if (objcomparar.numero1 > objcomparar.numero2) {
            System.out.println("O maior é o primeiro número digitado = " + objcomparar.numero1 + ".");
        } else if (objcomparar.numero2 > objcomparar.numero1) {
            System.out.println("O maior é o segundo número digitado = " + objcomparar.numero2 + ".");
        } else {
            System.out.println("Os números são iguais.");
        }

        if (objcomparar.numero1 < objcomparar.numero2) {
            System.out.println("O menor é o primeiro número digitado = " + objcomparar.numero1 + ".");
        } else if (objcomparar.numero2 < objcomparar.numero1) {
            System.out.println("O menor é o segundo número digitado = " + objcomparar.numero2 + ".");
        } else {
            System.out.println("Os números são iguais.");
        }
        //scanner.close();

        //Class Desconto
        Desconto objdesconto = new Desconto();
        System.out.print("Digite o valor da compra: ");
        objdesconto.valortotal = scanner.nextDouble();

        if (objdesconto.valortotal >= 100.0) {
            objdesconto.desconto = objdesconto.valortotal * 0.10;
            objdesconto.valorfinal = objdesconto.valortotal - objdesconto.desconto;
            System.out.printf("Foi aplicado o desconto de 10%%.\nO valor total final é de R$ %.2f\n", objdesconto.valorfinal);
        } else {
            System.out.printf("Não foi aplicado desconto, sendo assim, o valor total da compra é de R$ %.2f\n", objdesconto.valortotal);
        }
        //scanner.close();

        // Class Emprestimo
        Emprestimo objempresti = new Emprestimo();
        System.out.print("****** Empréstimo *****");
        System.out.println();
        System.out.print("Qual o valor que deseja pedir empréstimo ?  ");

        objempresti.valorsolicitado = scanner.nextInt();

        if (objempresti.valorsolicitado >= 1000 && objempresti.valorsolicitado <= 5000) {
            System.out.println("Parabéns!! Empréstimo autorizado. O valor solicitado de R$" + objempresti.valorsolicitado + ",00 está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("Empréstimo de R$" + objempresti.valorsolicitado + ",00 foi negado!! Este valor não está dentro do intervalo permitido para empréstimo");
        }

        // Class Triangulo
        Triangulo objtriang = new Triangulo();
        System.out.print("****** Triângulo *****");
        System.out.println();
        System.out.print("Digite o tamanho do primeiro lado: ");
        objtriang.primeirolado = scanner.nextInt();
        System.out.print("Digite o tamanho do segundo lado: ");
        objtriang.segundolado = scanner.nextInt();
        System.out.print("Digite o tamanho do terceiro lado: ");
        objtriang.terceirolado = scanner.nextInt();
        if ((objtriang.primeirolado + objtriang.segundolado > objtriang.terceirolado) && (objtriang.primeirolado + objtriang.terceirolado > objtriang.segundolado) && (objtriang.segundolado + objtriang.terceirolado > objtriang.terceirolado)) {
            System.out.println("Parabéns !! Os números: " + objtriang.primeirolado + ", " + objtriang.segundolado + " e " + objtriang.terceirolado + "  podem formar um triângulo.");
        } else {
            System.out.println("Este números " + objtriang.primeirolado + ", " + objtriang.segundolado + " e " + objtriang.terceirolado + "  NÃO formam um triângulo.");
        }

        // Class DoacaoSangue
        Doacaosangue objdoacao = new Doacaosangue();
        System.out.print("****** Doação Sangue *****");
        System.out.println();
        System.out.print("Qual sua idade ?  ");
        objdoacao.idadedoacao = scanner.nextInt();
        System.out.print("Qual seu peso ?  ");
        objdoacao.pesodoacao = scanner.nextDouble();

        if (((objdoacao.idadedoacao < 18) || (objdoacao.idadedoacao > 65)) && objdoacao.pesodoacao < 50) {
            System.out.println("Você não é um doador compatível. \nSua idade e peso estão fora dos padrões estabelecidos.");
        } else if (objdoacao.idadedoacao < 18 || objdoacao.idadedoacao > 65) {
            System.out.println("Você não é um doador compatível. \nVocê tem " + objdoacao.idadedoacao + " anos e está fora do padrão estabelecido que é entre 18 e 65 anos.");
        } else if (objdoacao.pesodoacao < 50) {
            System.out.println("Você não é um doador compatível. \nSeu peso é de " + objdoacao.pesodoacao + "Kg e está fora do peso estabelecido que é maior que 50kg.");
        } else if (objdoacao.idadedoacao >= 18 && objdoacao.idadedoacao <= 65 && objdoacao.pesodoacao > 50) {
            System.out.println("Parabéns!!! \nVocê é um doador compatível.");
        }

        //Class Codigoacesso
        Codigoacesso objcod = new Codigoacesso();
        objcod.codigo = 2023;
        objcod.min = 1;
        objcod.max = 3;

        System.out.print("****** Código Acesso *****");
        System.out.println();
        System.out.print("Entre com o código de acesso: ");
        objcod.coddigitado = scanner.nextInt();

        if (objcod.codigo == objcod.coddigitado) {
            System.out.println("Código de acesso válido!!!");
            System.out.print("Qual seu nível de permissão: ");
            objcod.permissao = scanner.nextInt();
            if (objcod.permissao < objcod.min || objcod.permissao > objcod.max) {
                System.out.println("Acesso negado!! \nVocê não tem nível de permissão para acesso.");
            } else {
                System.out.println("Acesso permitido!!");
                System.out.println("Bem-vindo ao sistema!!!");
            }
        } else {
            System.out.println("Acesso negado!!");
            System.out.println("Seu código de acesso é inválido.");
        }

            scanner.close();

    }
}