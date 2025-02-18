import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][2], b = new int[3][2], c = new int[3][2];

        System.out.println("Insira 6 números para a primeira matriz: ");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {

                a[i][j] = sc.nextInt();

            }

        }

        System.out.println("Insira 6 números para a segunda matriz: ");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {

                b[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {

                c[i][j] = a[i][j] + b[i][j];

                System.out.println(c[i][j]);

            }

        }

    }
}
