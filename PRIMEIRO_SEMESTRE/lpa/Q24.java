import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade, estadoCivil, fem = 0, soma = 0, casado = 0, solteiro = 0;
        String sexo;

        for (int cont = 0; cont < 5; cont++) {

            System.out.println("Qual o seu sexo? F - feminino / M - masculino");
            sexo = sc.next();
            sexo = sexo.toUpperCase();

            System.out.println("Qual a sua idade? ");
            idade = sc.nextInt();

            System.out.println("Qual o seu estado civíl? \n" + "1 - Casado \n" + "2 - Solteiro");
            estadoCivil = sc.nextInt();

            if (sexo.equals("F")) {

                fem += 1;
                soma += idade;

            }

            if (estadoCivil == 1) {

                casado += 1;

            } else {

                solteiro += 1;

            }

        }

        float media = soma / fem;
        System.out.println("A média de idade das mulheres entrevistadas é: " + media);

        if (casado > solteiro) {

            System.out.println("O Estado civil com mais entrevistados foi casado. ");

        } else {

            System.out.println("O Estado civil com mais entrevistados foi solteiro ");

        }

    }
}
