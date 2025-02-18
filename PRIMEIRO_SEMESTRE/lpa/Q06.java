import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        float km, conversao;

        System.out.println("Por favor, insira um valor em km/h");
        km = i.nextFloat();

        conversao = km/(36/10);

        System.out.printf("O valor inserido equivale a %.1f", conversao, "em m/s");

    }
}
