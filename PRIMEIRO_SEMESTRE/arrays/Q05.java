import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet = new int[12];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, indiceB=0, indiceL=0;

        System.out.println("Informe 12 elementos: ");

        for (int i = 0; i < vet.length; i++) {

            System.out.println((i + 1) + "° elemento: ");
            vet[i] = Integer.parseInt(sc.next());

            if (vet[i] >= maior) {

                maior = vet[i];
                indiceB = i;

            }

            if (vet[i] <= menor) {

                menor = vet[i];
                indiceL = i;

            }

        }

        System.out.println(maior+ " é o maior valor e está no índice: " +indiceB);
        System.out.println(menor+ " é o menor valor e está no índice: " +indiceL);

    }
}
