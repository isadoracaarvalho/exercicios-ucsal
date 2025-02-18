import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        float total, itapua, pituba, cp, ci, d,  percentual;

        System.out.println("Quantas fitas existem no acervo completo da locadora?");
        total = i.nextFloat();

        System.out.println("Quantas fitas existem no momento na loja de Itapua?");
        itapua = i.nextFloat();

        System.out.println("Quantas fitas existem no momento na loja da Pituba?");
        pituba = i.nextFloat();

        d = total/2;

        cp = d - pituba;
        ci = d - itapua;
        percentual = (ci + cp)*100/total;

        System.out.println("Existem " +cp+ " fitas com os clientes da Pituba e " +ci+ "fitas com os clientes de Itapuã.");
        System.out.printf("A porcentagem de fitas com os clientes é de %.2f", percentual, "%");

    }
}
