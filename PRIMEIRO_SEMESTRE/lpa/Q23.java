import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipo, ficcao = 0, romance = 0, aventura = 0, masc = 0;
        String sexo;

        System.out.println("Deseja participar do questionário? digite 5 - para começar, 0 - para encerrar");
        tipo = sc.nextInt();

        do {

            System.out.println("Selecione o tipo de livro que foi vendido. \n"
                    + "0 - Para encerrar o questionário \n"
                    + "1 - Ficção \n"
                    + "2 - Romance \n"
                    + "3 - Aventura \n");
            tipo = sc.nextInt();

            if (tipo != 0) {

                System.out.println("Qual o seu sexo? F - para feminino e M - para masculino");
                sexo = sc.next();
                sexo = sexo.toUpperCase();

                if (tipo == 1) {

                    ficcao += 1;

                }

                else {

                    if (tipo == 2) {

                        romance += 1;

                        if (sexo.equals("M")) {

                            masc += 1;
                        }

                    }

                    else {

                        aventura ++;

                    }
                }
            }

        } while (tipo != 0);

        if ((ficcao > romance) && (ficcao > aventura)) {

            System.out.println("Ficção é o tipo de livro mais vendido.");

        } else if ((romance > ficcao) && (romance > aventura)) {

            System.out.println("Romance é o tipo de livro mais vendido.");

        } else {

            System.out.println("Aventura é o tipo de livro mais vendido. ");

        }
        float porcento=0;
        if (romance > 0) {

            porcento = (masc * 100) / romance;
        }
        System.out.println(porcento + "% dos homens que lêem romance.");

    }
}
