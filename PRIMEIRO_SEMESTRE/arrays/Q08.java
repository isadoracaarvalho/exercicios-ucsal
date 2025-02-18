import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra1, palavra2;
        int k, achou = 0;
        char[] p1, p2;

        System.out.println("Por favor, insira a primeira palavra: ");
        palavra1 = sc.next();
        p1 = palavra1.toCharArray();

        System.out.println("Por favor, insira a segunda palavra: ");
        palavra2 = sc.next();
        p2 = palavra2.toCharArray();

        for (int i = 0; i < p1.length; i++) {

            for (k = 0; k < p2.length; k++) {

                if (p1[i] == p2[k]) {

                    p2[k] = ' ';
                    achou++;
                    break;

                }

            }

            if (k == p2.length) {

                break;

            }

        }

        if ((achou == p1.length) && (achou == p2.length)) {

            System.out.println("As palavras são anagramas");

        } else {

            System.out.println("As palavras não são anagramas");

        }

    }
}
