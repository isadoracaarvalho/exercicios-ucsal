import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Por favor, insira um némero inteiro");
        num1 = i.nextInt();

        System.out.println("Por favor, insira outro número inteiro");
        num2 = i.nextInt();

        System.out.println("Por favor, insira mais um número inteiro");
        num3 = i.nextInt();

        if ((num1 > num2)&&(num1 > num3)) {

            System.out.println("O maior número inserido é: " +num1);

        }

        else {

            if ((num2 > num1)&&(num2 > num3)) {

                System.out.println("O maior número inserido é: " +num2);

            }

            else {

                System.out.println("O maior número inserido é: " +num3);

            }
        }

    }
}
