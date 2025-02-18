import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Insira dez números: ");

        for(int i=0; i < vetor.length; i++) {

            System.out.println((i + 1) + "° número: ");
            vetor[i] = Integer.parseInt(sc.next());

            if (vetor[i] % 2 != 0) {

                System.out.println(vetor[i] + "é ímpar.");

            }

        }

    }
}
