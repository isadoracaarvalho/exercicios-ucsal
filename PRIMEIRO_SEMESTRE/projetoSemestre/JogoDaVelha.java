import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] jogo = new String[3][3];

        String jogador = "X";

        int rodada = 1;

        boolean resultado = false;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                jogo[i][j] = " ";

            }

        }

        tabuleiro(jogo);

        do {

            System.out.printf(" %d° RODADA\n Jogador: %s\n", rodada, jogador);
            System.out.println(" Qual a posição da linha você deseja  jogar: (1 - 3)");
            int linha = sc.nextInt();
            System.out.println(" Qual a posição da coluna você deseja jogar: (1 - 3)");
            int coluna = sc.nextInt();

            if(linha > 3 || coluna > 3) {

                System.out.println(" Valor inválido! Insira um valor entre 1 e 3");
                continue;

            }

            if (jogo[linha - 1][coluna - 1].equals(" ")) {

                jogo[linha - 1][coluna - 1] = jogador;

            } else {

                System.out.println("-------------------");
                System.out.println("| Posição ocupada |");
                System.out.println("-------------------");
                continue;

            }

            tabuleiro(jogo);

            resultado = resultado(jogo, jogador);

            if (!resultado && rodada == 9) {

                System.out.println("-----------");
                System.out.println("| Empate! |");
                System.out.println("-----------");
                break;
            }

            if (resultado) {

                System.out.println("-----------------------");
                System.out.printf("| O jogador %s venceu! |\n", jogador);
                System.out.println("-----------------------");

            }

            rodada++;

            jogador = jogador.equals("X") ? "O" : "X";

        } while (!resultado);

    }

    public static void tabuleiro(String[][] jogo) {

        System.out.println(" ");
        System.out.printf("  %s  |  %s  | %s  \n", jogo[0][0], jogo[0][1], jogo[0][2]);
        System.out.printf("-------------------\n");
        System.out.printf("  %s  |  %s  | %s  \n", jogo[1][0], jogo[1][1], jogo[1][2]);
        System.out.printf("-------------------\n");
        System.out.printf("  %s  |  %s  | %s  \n", jogo[2][0], jogo[2][1], jogo[2][2]);
        System.out.println(" ");

    }

    public static boolean resultado(String[][] jogo, String jogador) {

        for (int i = 0; i < 3; i++) {

            if (!jogo[i][0].equals(" ") && jogo[i][0].equals(jogo[i][1]) && jogo[i][0].equals(jogo[i][2])) {

                return true;

            }

            if (!jogo[0][i].equals(" ") && jogo[0][i].equals(jogo[1][i]) && jogo[0][i].equals(jogo[2][i])) {

                return true;

            }

        }

        if (!jogo[0][0].equals(" ") && jogo[0][0].equals(jogo[1][1]) && jogo[0][0].equals(jogo[2][2])) {

            return true;

        }

        if (!jogo[0][2].equals(" ") && jogo[0][2].equals(jogo[1][1]) && jogo[0][2].equals(jogo[2][0])) {

            return true;

        }

        return false;

    }

}