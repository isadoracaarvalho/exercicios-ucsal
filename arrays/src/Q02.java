import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[8], B = new int[8], C = new int[8];

        System.out.println("Por favor, insira 8 números: ");

        for (int i = 0; i < A.length; i++) {

            System.out.println((i + 1) + "° número: ");
            A[i] = Integer.parseInt(sc.next());

        }

        System.out.println("Por favor, insira 8 números: ");

        for (int i = 0; i < B.length; i++) {

            System.out.println((i + 1) + "° número: ");
            B[i] = Integer.parseInt(sc.next());

        }

        for (int i = 0; i < C.length; i++) {

            C[i] = A[i] + B[i];
            System.out.println("Soma = " + C[i]);

        }

    }
}
