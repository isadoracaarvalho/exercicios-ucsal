import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        float salario;

        System.out.println("Por favor, insira seu salário");
        salario = i.nextFloat();

        if ((salario <= (3 * 1412))) {

            salario *= 0.1;
            System.out.printf("O seu novo salário sera de R$ %.2f", salario);

        }

        else {

            if ((salario > (3 * 1412))&&(salario <= 14120)) {

                salario *= 0.2;
                System.out.printf("O seu novo salário sera de R$ %.2f", salario);

            }

            else {

                salario *= 0.3;
                System.out.printf("O seu novo salário sera de R$ %.2f", salario);

            }
        }

    }

}
