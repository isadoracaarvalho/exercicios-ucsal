import java.util.Scanner;

public class Fatorial {

    public static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n*fatorial(n-1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fatorial(n));

    }
}