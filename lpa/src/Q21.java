import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, div = 0;

        System.out.println("Insira um número para determinar se ele é primo: ");
        N = sc.nextInt();

        for (int cont = 1; cont <= N; cont++) {

            if (N % cont == 0) {

                div += 1;

            }

        }

        if (div == 2) {

            System.out.println("Primo");

        } else {

            System.out.println("Não primo");

        }

    }
}
