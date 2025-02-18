import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira um número inteiro");
        num1 = i.nextInt();

        System.out.println("Insira outro número inteiro");
        num2 = i.nextInt();

        if (num1 >= num2) {

            System.out.println("Valores em ordem ascendente: " +num2+ "e " +num1);

        }
        else {

            System.out.println("Valores em ordem ascendente: " +num1+ "e " +num2);
        }

    }
}
