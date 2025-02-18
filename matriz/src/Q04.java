import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas: ");
        int linha = sc.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        int coluna = sc.nextInt();

        int[][] a = new int[linha][coluna], b = new int[linha][coluna], c = new int[linha][coluna];
        System.out.println("Insira " + linha * coluna + " numeros: ");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Insira mais " + linha * coluna + " numeros: ");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                c[i][j] = a[i][j] * b[i][j];

                System.out.println(c[i][j]);
            }
        }


    }
}
