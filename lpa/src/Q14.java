import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);

        int N;

        System.out.println("Qual o número para fazer a tabuada?");
        N = i.nextInt();

        for (int c=0; c <= 10; c++) {

            int mult = N * c;
            System.out.println(N+ "x" +c+ "=" +mult);

        }

    }
}
