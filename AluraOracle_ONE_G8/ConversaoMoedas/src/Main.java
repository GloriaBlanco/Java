
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final String API_KEY ="chave sigilosa, coloque sua chave no site https://www.exchangerate-api.com\n";
    public static void main(String[] args) {
        System.out.println("PARA FUNCIONAR --------- coloque sua API_Key do site https://www.exchangerate-api.com");
        Scanner scnUsr = new Scanner(System.in);
        Conv_Moeda cvrMoed = new Conv_Moeda();
        Resp_API rpsAPI = null;
        try {
            rpsAPI = cvrMoed.obte_Cot(API_KEY);
        } catch (IOException e) {
            System.out.println("Erro para obter cotações da API: " + e.getMessage());
            scnUsr.close();
            return;
        }
        int opcSelec = 0;
        double valorEntr = 0.0;
        while (opcSelec != 7) {
            exib_Menu();
            System.out.print("Digite uma das opções do menu: ");
            if (scnUsr.hasNextInt()) {
                opcSelec = scnUsr.nextInt();
                scnUsr.nextLine();
                if (opcSelec >= 1 && opcSelec <= 6) {
                    System.out.print("Digite o valor que você quer converter: ");
                    if (scnUsr.hasNextDouble()) {
                        valorEntr = scnUsr.nextDouble();
                        scnUsr.nextLine();
                        double valorFina = 0.0;
                        System.out.println(".........................................");
                        switch (opcSelec) {
                            case 1: // dólar para real
                                valorFina = cvrMoed.conver_Moedas(valorEntr, rpsAPI.conversion_rates.BRL);
                                System.out.printf("Conversão = $ %.2f dólares equivalem a R$ %.2f reais.%n", valorEntr, valorFina);
                                break;
                            case 2: //  real para dólar
                                valorFina = cvrMoed.conver_Moedas(valorEntr, 1.0 / rpsAPI.conversion_rates.BRL);
                                System.out.printf("Conversão = R$ %.2f reais equivalem a $ %.2f dólares.%n", valorEntr, valorFina);
                                break;
                            case 3: // Euro para real
                                valorFina = cvrMoed.conver_Moedas(valorEntr, rpsAPI.conversion_rates.BRL / rpsAPI.conversion_rates.EUR);
                                System.out.printf("Conversão = %.2f euros equivalem a R$ %.2f reais.%n", valorEntr, valorFina);
                                break;
                            case 4: // real para euro
                                valorFina = cvrMoed.conver_Moedas(valorEntr, 1.0 / (rpsAPI.conversion_rates.BRL / rpsAPI.conversion_rates.EUR));
                                System.out.printf("Conversão = R$ %.2f reais equivalem a %.2f euros.%n", valorEntr, valorFina);
                                break;
                            case 5: // dólar para euro
                                valorFina = cvrMoed.conver_Moedas(valorEntr, 1.0 / rpsAPI.conversion_rates.EUR);
                                System.out.printf("Conversão = $ %.2f dólares equivale(m) a %.2f euros.%n", valorEntr, valorFina);
                                break;
                            case 6: // euro para dólar
                                valorFina = cvrMoed.conver_Moedas(valorEntr, rpsAPI.conversion_rates.EUR);
                                System.out.printf("Conversão = %.2f euro equivalem a $ %.2f dólares.%n", valorEntr, valorFina);
                                break;
                        }
                    } else {
                        System.out.println("Valor  inválido, por favor, digite um número válido.");
                        scnUsr.nextLine();
                    }
                } else if (opcSelec == 7) {
                    System.out.println("Até a próxima!");
                } else {
                    System.out.println("Opção inválida! Por favor, escolha uma opção entre 1 e 7.");
                }
            } else {
                System.out.println("Opção inválida! Por favor, digite um numero válido.");
                scnUsr.nextLine();
            }
            System.out.println("\n******************************************************************");
        }
        scnUsr.close();
    }

    public static void exib_Menu() {
        System.out.println("........... Conversão de moedas ..........");
        System.out.println("1. Dólar para Real");
        System.out.println("2. Real  para Dólar");
        System.out.println("3. Euro para Real");
        System.out.println("4. Real para Euro");
        System.out.println("5. Dólar  para Euro");
        System.out.println("6. Euro para Dólar");
        System.out.println("7. Sair do programa");
        System.out.println("....................................................");
    }
}
