import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int N, pos = 0;
        boolean obj = false;

        System.out.println("Insira um número inteiro qualquer: ");
        N = sc.nextInt();

        System.out.println("Insira 10 valores: ");

        for (int i = 0; i < vet.length; i++) {

            System.out.println((i + 1) + "° valor: ");
            vet[i] = Integer.parseInt(sc.next());

            if (vet[i] == N) {

                obj = true;
                pos = i;

            }

        }

        if (obj == true) {

            System.out.println(N + " está na posição " + pos);

        } else {

            System.out.println(N + " não esta no vetor lido.");

        }

    }
}
