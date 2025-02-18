import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        int idade;

        System.out.println("Qual a sua idade?");
        idade = i.nextInt();

        if (idade < 8) {

            System.out.println("Você não se enquadra em nenhuma categoria");

        }

        else {

            if ((idade >= 8)&&(idade <= 10)) {

                System.out.println("Sua categoria é INFANTIL");

            }

            else {

                if ((idade >= 11)&&(idade <= 13)) {

                    System.out.println("Sua categoria é JUVENIL A");

                }

                else {

                    if ((idade >= 14)&&(idade <= 17)) {

                        System.out.println("Sua categoria é JUVENIL B");

                    }

                    else {

                        System.out.println("Sua categoria é SÊNIOR");

                    }
                }
            }
        }
    }
}
