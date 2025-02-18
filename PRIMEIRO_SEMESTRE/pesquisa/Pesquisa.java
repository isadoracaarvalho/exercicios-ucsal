import java.util.Scanner;

public class Pesquisa {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String nome, sexo, nomePesado="", nomeH="";
        double h, peso, cod, somah=0, somap=0, qtdh=0, qtdm=0, maiorPeso=0, maiorH=0;

        System.out.println("Deseja participar da pesquisa? 0- Não 1- Sim ");
        cod = sc.nextDouble();

        do {

            System.out.println("Por favor, informe o seu nome: ");
            nome = sc.next();

            System.out.println("Por favor, informe seu sexo: ");
            sexo = sc.next();
            sexo = sexo.toUpperCase();

            System.out.println("Por favor, informe sua altura: ");
            h = sc.nextDouble();

            System.out.println("Por favor, informe seu peso: ");
            peso = sc.nextDouble();

            System.out.println("Deseja continuar? 0- Não 1- Sim ");
            cod = sc.nextDouble();

            if (sexo.equals("MASCULINO")) {

                qtdh++;
                somah += h;

                if (peso >= maiorPeso) {

                    maiorPeso = peso;
                    nomePesado = nome;

                }

            } else {

                qtdm++;
                somap += peso;

                if (h >= maiorH) {

                    maiorH = h;
                    nomeH = nome;

                }

            }


        } while (cod != 0);

        String letra = nomePesado.substring(0, 1).toUpperCase();
        nomePesado = letra + nomePesado.substring(1);

        String letra1 = nomeH.substring(0, 1).toUpperCase();
        nomeH = letra1 + nomeH.substring(1);

        System.out.println("A média de altura dos homens é: " +mediaAltura(somah, qtdh));
        System.out.println("A média de peso das mulheres é: " +mediaPeso(somap, qtdm));
        System.out.println("O homem mais pesado é: " +nomePesado);
        System.out.println("A mulher mais alta é: " +nomeH);

    }

    public static double mediaAltura(double somah, double qtdh) {

        double media = somah / qtdh;
        return media;

    }

    public static double mediaPeso(double somap, double qtdm) {

        double media = somap / qtdm;
        return media;
    }

}
