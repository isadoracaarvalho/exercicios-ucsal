import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet1 = new int[20], vet2 = new int[20];
        int num1 = 0, num2 = 0, k = 0;
        String cod;

        System.out.println("Insira ate 20 números inteiros positivos: (-1 para parar)");

        do {

            System.out.println((num1 + 1) + "° número: ");
            vet1[num1] = sc.nextInt();

            System.out.println("Deseja continuar? S - sim, N - não");
            cod = sc.next();
            cod = cod.toUpperCase();

            num1++;

        } while ((cod.equals("S")) && (num1 < 20));

        for (int i = 0; i < num1; i++) {

            for (k = 0; k < num2; k++) {

                if (vet1[i] == vet2[k]) {

                    break;

                }

            }

            if (k == num2) {

                vet2[num2] = vet1[i];
                num2++;

            }

        }

        System.out.println("Números sem repetição: ");

        for (k = 0; k < num2; k++) {

            System.out.println(vet2[k]);

        }

    }
}
