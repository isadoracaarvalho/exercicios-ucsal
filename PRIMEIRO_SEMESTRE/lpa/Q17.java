import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num;

        System.out.println("Insira um número: ");
        num = sc.nextInt();

        int menor = num;

        do {

            if (num <= menor) {

                menor = num;

            }

            System.out.println("Insira um número para continuar, para terminar digite 0");
            num = sc.nextInt();

        } while (num != 0);

        System.out.println("O menor número inserido é: " +menor);

    }
}
