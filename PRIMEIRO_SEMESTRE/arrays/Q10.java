import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet = new int[5], vetOrdenado = new int[5];

        System.out.println("Insira cinco números: ");

        for (int i = 0; i < vet.length; i++) {

            for (int k = i + 1; k < vetOrdenado.length; k++) {

                if (vet[i] > vetOrdenado[k]) {

                    System.out.println(vetOrdenado[k]);

                }

            }

        }

    }
}
