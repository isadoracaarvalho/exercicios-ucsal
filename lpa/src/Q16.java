import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num, par=0, impar=0;

        System.out.println("Insira um número: ");
        num = sc.nextInt();

        do {

            if (num % 2 == 0) {

                par += 1;

            } else {

                impar += 1;

            }

            System.out.println("Se deseja continuar, insira outro número. Para parar, insira -1");
            num = sc.nextInt();

        } while (num != -1);

        System.out.println("Você digitou: " +par+ " números pares e " +impar+ " números ímpares.");

    }
}
