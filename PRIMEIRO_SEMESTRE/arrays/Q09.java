import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); {

            int[] vetA = new int[10], vetB = new int[10], vetC = new int[20], vetD = new int[10];
            int num, cont1 = 0, cont2 = 0, k = 0, tc = 0;

            System.out.println("Insira ate 10 números inteiros positivos para gerar a primeira sequência: (999 para parar)");

            do {

                System.out.println((cont1 + 1) + "° número da primeira sequência: ");
                num = sc.nextInt();

                if (num != 999) {

                    vetA[cont1] = num;

                    cont1++;

                }

            } while ((cont1 < 10) && (num != 999));

            System.out.println("Insira ate 10 números inteiros positivos para gerar a segunda sequência: (999 para parar)");

            do {

                System.out.println((cont2 + 1) + "° número da segunda sequência: ");
                num = sc.nextInt();

                if (num != 999) {

                    vetB[cont2] = num;

                    cont2++;

                }

            } while ((cont2 < 10) && (num != 999));

            for (tc = 0; tc < vetA.length; tc++) {

                vetC[tc] = vetA[tc];

            }

            for (int i = 0; i < vetB.length; i++) {

                for (k = 0; k < tc; k++) {

                    if (vetC[k] == vetB[i]) {

                        break;

                    }

                }

                if (k == tc) {

                    vetC[tc] = vetB[k];
                    tc++;

                }

            }

            System.out.println("A união dos elementos é: ");

            for (int i = 0; i < tc; i++) {

                System.out.println(vetC[i]);

            }

        }

    }
}
