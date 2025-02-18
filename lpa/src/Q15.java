import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        int a, b, soma=0;

        System.out.println("Insira o número que inicia e que temina o intervalo: ");
        a = i.nextInt();
        b = i.nextInt();

        do {

            int div = a % 2;

            if (div != 0) {

                soma += a;

            }

            a++;

        } while (a <= b);

        System.out.println("A soma dos números ímpares é: " +soma);

    }
}
