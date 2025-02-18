import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        float p1, p2, p3, media;

        System.out.println("Por favor, informe o valor da gasolina no primeiro posto");
        p1 = i.nextFloat();

        System.out.println("Por favor, informe o valor da gasolina no segundo posto");
        p2 = i.nextFloat();

        System.out.println("Por favor, informe o valor da gasolina no terceiro posto");
        p3 = i.nextFloat();

        media = (p1 + p2 + p3)/3;

        System.out.printf("A média do valor da gasolina nos três postos é de R$ %.2f", media);

    }
}
