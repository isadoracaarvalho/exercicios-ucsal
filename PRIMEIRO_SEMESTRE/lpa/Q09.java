import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        int num;

        System.out.println("Por favor, insira um número inteiro:");
        num = i.nextInt();

        if ((num % 2) == 0) {

            System.out.println("O número inserido é par");
        }

        else {

            if (num == 0) {

                System.out.println("O número inserido é 0");

            }

            else {

                System.out.println("O número inserido é ímpar");

            }
        }

    }
}
