import java.util.Scanner;

public class ForcaDeAceleraçao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();

        int T = sc.nextInt();

        double V = E/T;

        System.out.println(V);

    }

}