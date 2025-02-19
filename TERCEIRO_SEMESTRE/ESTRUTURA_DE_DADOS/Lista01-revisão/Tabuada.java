import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i <= 100; i++) {

            int resultado = i * N;

            System.out.println(resultado);
        }

    }

}