import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num, fatorial=1, cont=1;

        System.out.println("Por favor, escreva o número para saber qual o fatorial dele: ");
        num = sc.nextInt();

        do {

            fatorial *= cont;
            cont++;

        } while (cont <= num);

        System.out.println("O fatorial do número é: " +fatorial);

    }
}
