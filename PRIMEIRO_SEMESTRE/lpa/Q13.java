import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        int A, B;

        System.out.println("Por favor, insira um número");
        A = i.nextInt();

        System.out.println("Por favor, isira outro número");
        B = i.nextInt();

        if ((A % B) == 0) {

            System.out.println(A+ "é multiplo de " +B);

        }

        else {

            System.out.println(A+ "não é múltiplo de " +B);

        }

    }
}
