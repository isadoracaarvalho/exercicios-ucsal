import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num;

        System.out.println("Insira um número para descobrir quais os seus divisores:  ");
        num = sc.nextInt();

        for (int cont=1; cont <= num; cont++) {

            if (num % cont == 0) {

                System.out.println(cont);

            }

        }

    }
}
