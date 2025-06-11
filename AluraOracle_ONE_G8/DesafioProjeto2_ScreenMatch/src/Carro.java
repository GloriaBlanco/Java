/* Crie uma classe Carro com atributos modelo, ano, cor e
 métodos para exibir a ficha técnica e calcular a idade do carro.
 */
import java.time.Year;

public class Carro {
    String modelo;
    int ano;
    String cor;
    int anoatual;

    void impressao() {
        System.out.println("############ Classe Carro #####");
        System.out.println("Modelo do carro : " +modelo);
        System.out.println("Ano : " +ano);
        System.out.println("Cor : " +cor);
        }

    int idadecarro() {
        anoatual = Year.now().getValue();
        return anoatual - ano;
    }

}
