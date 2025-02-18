import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        int n1, n2, soma;

        System.out.println("Por favor, insira um número inteiro:");
        n1 = i.nextInt();

        System.out.println("Por favor, insira outro número inteiro:");
        n2 = i.nextInt();

        soma = n1 + n2;

        System.out.println("A soma dos números inseridos é "+soma);

    }
}
