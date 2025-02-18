import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número da operação: ");
        double num1 = sc.nextDouble();

        System.out.println("Insira o segundo número da operação: ");
        double num2 = sc.nextDouble();

        System.out.println("Selecione a operação que deseja realizar: +, -, *, /");
        char cod = sc.next().charAt(0);

        switch (cod) {

            case '+':

                System.out.println(num1+ " + " +num2+ " = " +soma(num1, num2));
                break;

            case '-':

                System.out.println(num1+ " - " +num2+ " = " +subtracao(num1, num2));
                break;

            case '*':

                System.out.println(num1+ " * " +num2+ " = " +mult(num1, num2));
                break;

            case '/':

                System.out.println(num1+ " / " +num2+ " = " +div(num1, num2));
                break;
        }


    }

    public static double soma(double num1, double num2) {

        double resultado = num1 + num2;
        return resultado;

    }

    public static double subtracao(double num1, double num2) {

        double resultado = num1 - num2;
        return resultado;

    }

    public static double mult(double num1, double num2) {

        double resultado = num1 * num2;
        return resultado;

    }

    public static double div(double num1, double num2) {

        double resultado = num1 / num2;
        return resultado;

    }

}