import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int notas=0, soma=0;
        int[] vetNotas = new int[notas];

        System.out.println("Insra as notas: (-1 para parar)");
        notas = sc.nextInt();

        for(int i=0; i < vetNotas.length; i++) {

            if(notas != -1) {

                vetNotas[i] = notas;
                soma += notas;
                break;

            }

        }

        float media = soma/notas;

        System.out.println(media);

    }
}
