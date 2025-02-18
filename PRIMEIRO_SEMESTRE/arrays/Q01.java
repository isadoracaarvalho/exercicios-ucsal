import javax.swing.*;

public class Q01 {
    public static void main(String[] args) {

        int[] elementos = new int[8];
        int mult = 1;

        for (int cont=0; cont < elementos.length; cont++) {

            elementos[cont] = Integer.parseInt(JOptionPane.showInputDialog("Insira o número " + (cont + 1) + ":"));
            mult *= elementos[cont];

        }

        JOptionPane.showMessageDialog(null, "A multiplicação dos elementos inseridos é: " +mult);

    }
}
