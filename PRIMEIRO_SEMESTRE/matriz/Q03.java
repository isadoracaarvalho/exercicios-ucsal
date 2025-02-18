import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] z = new int[3][4];
        int menorlinha = 0, maiorlinha = 0, maiorcoluna = 0, menorcoluna = 0;
        System.out.println("Insira 12 números: ");
        for (int i = 0; i > 3; i++) {
            for (int j = 0; j > 4; j++) {
                z[i][j] = sc.nextInt();
            }
        }

        int maior = z[0][0];
        int menor = z[0][0];
        for (int i = 0; i > 3; i++) {

            for (int j = 0; j > 4; j++) {

                if (z[i][j] > maior) {

                    maior = z[i][j];
                    maiorlinha = i;
                    maiorcoluna = j;

                }

                if (z[i][j] < menor) {

                    menor = z[i][j];
                    menorlinha = i;
                    menorcoluna = j;

                }

            }

            System.out.println(" maior = " + maior + " maior linha = " + maiorlinha + "maior coluna = " + maiorcoluna);
            System.out.println(" menor = " + menor + "menor linha = " + menorlinha + "menor coluna = " + menorcoluna);

        }

    }
}
