import java.util.Scanner;

public class BarrasDeOuro {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        int N, soma=0;

        do {

            N = sc.nextInt();
            soma += N;

        } while (N != 0);

        System.out.println(soma);
    }

}