public class Q19 {
    public static void main(String[] args) {

        int numerador=-1, H=0;

        for (int denominador=1; denominador <= 50; denominador++) {

            H += (numerador/denominador);
            numerador += 2;

            System.out.println(numerador+ "/" +denominador);

        }

        System.out.println("Soma = " +H);

    }
}
