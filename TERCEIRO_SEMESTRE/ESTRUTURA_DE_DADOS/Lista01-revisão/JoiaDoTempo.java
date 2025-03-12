import java.util.Scanner;

public class JoiaDoTempo {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        boolean vitoria = false;

        while (true) {

            String HF = sc.next();
            String HDF = sc.next();
            String HA = sc.next();

            if (HF.equals("FIM") && HDF.equals("FIM") && HA.equals("FIM")) {
                break;
            } 

            if (HF.equals("NAO") && HDF.equals("SIM") && HA.equals("NAO")) {
                vitoria = true;
            }
        }

        if (vitoria) {
            System.out.println("VITORIA");
        } else {
            System.out.println("DERROTA");
        }

    }

}
