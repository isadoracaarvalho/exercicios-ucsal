import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int idade, codObj, codInic, total=0, fem=0, masc=0, servico=0;
        String sexo;

        System.out.println("Caso deseje encerrar a pesquisa, digite 5. Para continuar, tecle 0.");
        codInic = sc.nextInt();

        do {

            System.out.println("Qual a sua idade? ");
            idade = sc.nextInt();

            System.out.println("Qual o seu sexo? F - feminino e M - masculino");
            sexo = sc.next();
            sexo = sexo.toUpperCase();

            System.out.println("Insira o código equivalente ao motivo da sua ida ao shopping: \n"
                    + "1 - compras \n"
                    + "2 - serviços (banco, correios, etc) \n"
                    + "3 - lazer (cinema, jogos, etc) \n"
                    + "4 - alimentação (restaurantes e lanchonetes)");
            codObj = sc.nextInt();

            System.out.println("Caso deseje encerrar a pesquisa, digite 5. Para continuar, tecle 0.");
            codInic = sc.nextInt();

            total += 1;

            if (codObj == 2) {

                servico += 1;

            }

            if (sexo == "F") {

                fem += 1;

            } else {

                masc += 1;

            }

        } while (codInic != 5);

        float porcento = servico * 100 / total;
        System.out.println(porcento+ "% de indivíduos buscavam serviços.");

        System.out.println((fem > masc) ? "Mais mulheres frequentam." : "Mais homens frequentam");

    }
}
