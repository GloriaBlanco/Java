public class Principal {

    public static void main(String[] args) {

        // classe Filme
        Filme favorito = new Filme();

        favorito.nome = "Um Senhor Estagiário";
        favorito.anoDeLancamento = 2015;
        favorito.duracaoEmMinutos = 121;
        favorito.incluidoNoPlano = true;

        favorito.exibeFichaTecnica();
        favorito.avalia(7);
        favorito.avalia(7);
        favorito.avalia(7);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());


        favorito.nome = "Além do tempo";
        favorito.anoDeLancamento = 2023;
        favorito.duracaoEmMinutos = 127;
        favorito.incluidoNoPlano = true;

        favorito.exibeFichaTecnica();
        favorito.avalia(10);
        favorito.avalia(7);
        favorito.avalia(7);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());

        // Classe Pessoa
        Pessoa pessoaobj = new Pessoa();
        pessoaobj.olaMundo();

        // Classe Calculadora
        Calculadora calculos = new Calculadora();
        int calculodobro = calculos.dobro(7);
        System.out.println("o dobro é "+ calculodobro);

        // Classe Musica
        Musica objmusica = new Musica();

        objmusica.titulo = "Blue Monday";
        objmusica.artista = "New Order";
        objmusica.anoLancamento = 2005;

        objmusica.impressao();

        objmusica.avaliaometodo(10);
        objmusica.avaliaometodo(9);
        objmusica.avaliaometodo(10);

        System.out.println("Média de avaliações da Música: " +objmusica.Media());

        // Classe Carro
        Carro objcarro = new Carro();

        objcarro.modelo = "Clio";
        objcarro.ano = 2001;
        objcarro.cor = "preto";

        objcarro.impressao();

        System.out.println("o carro " + objcarro.modelo + "tem " +objcarro.idadecarro() + " anos");

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

        //System.out.println("o carro " + objcarro.modelo + "tem " +objcarro.idadecarro() + " anos");







    }


}
