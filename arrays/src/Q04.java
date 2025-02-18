import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] VET1 = new int[10], VET2 = new int[10], VET3 = new int[20];
        int a = 0, b = 0;

        System.out.println("Insira 10 números em ordem crescente: ");

        for (int i = 0; i < VET1.length; i++) {

            System.out.println((i + 1) + "° número: ");
            VET1[i] = Integer.parseInt(sc.next());

            if ((i > 0) && (VET1[i] <= VET1[i - 1])) {

                System.out.println("Erro. Por favor, insira um número maior que o anterior.");
                i--;

            }
        }

        System.out.println("Insira mais 10 números em ordem crescente: ");

        for (int i = 0; i < VET2.length; i++) {

            System.out.println((i + 1) + "° número: ");
            VET2[i] = Integer.parseInt(sc.next());

            if ((i > 0) && (VET2[i] <= VET2[i - 1])) {

                System.out.println("Erro. Por favor, insira um número maior que o anterior.");
                i--;

            }
        }

        for (int i = 0; i < 10; i++) {

            VET3[a] = VET1[i];
            a++;

            VET3[a] = VET2[i];
            a++;

        }

        System.out.println("Dados do vetor resultante: ");

        for (a = 0; a < VET3.length; a++) {

            System.out.println(VET3[a]);

        }

    }
}
