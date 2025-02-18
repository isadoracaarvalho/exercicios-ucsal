import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] m = new int[5][2];

        int produto = 1;

        System.out.println("Insira 10 numeros: ");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 2; j++) {

                m[i][j] = sc.nextInt();

                produto *= i * j;

            }

        }

        System.out.println(produto);

    }
}
