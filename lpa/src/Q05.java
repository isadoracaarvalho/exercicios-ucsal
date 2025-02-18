import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        int num, p, f, m;

        System.out.println("Por favor, insira um número interito de três dígitos");
        num = i.nextInt();

        p = num/100;
        m = num/100;
        m = num%10;
        f = num%10;

        System.out.println("O inverso de " +num+ " é " +f+m+p);

    }
}
