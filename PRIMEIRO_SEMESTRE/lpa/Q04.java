import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        int num, p1, p2, rs;
        float rp;

        System.out.println("Por favor, insira um número inteiro com 4 dígitos");
        num = i.nextInt();

        p1 = num/100;
        p2 = num%100;
        rs = p1 + p2;
        rp = (rs)^2;

        if (rp == num) {
            System.out.println("O número possui a propriedade");
        }

        else {
            System.out.println("");
        }

    }
}
