import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        float valor, tipo;

        System.out.println("Por favor, insira um valor em reais");
        valor = i.nextFloat();

        System.out.println("Qual o tipo de conversão você deseja fazer?"
                + "1- Dólar"
                + "2- Libra"
                + "3- Peso");
        tipo = i.nextFloat();

        if (tipo == 1) {

            valor *= 1.87;
            System.out.printf("O valor inserido em dólar é: %.2f", valor);

        }

        else {

            if (tipo == 2) {

                valor *= 3.05;
                System.out.printf("O valor inserido em libra é: %.2f", valor);

            }

            else {

                valor *= 1.4;
                System.out.printf("O valor inserido em pesos é: %.2f", valor);

            }
        }

    }
}
