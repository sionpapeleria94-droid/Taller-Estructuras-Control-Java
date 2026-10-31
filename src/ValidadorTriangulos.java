import javax.swing.JOptionPane;

public class ValidadorTriangulos {
    public static void main(String[] args) {

        double A = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el lado A: "));

        double B = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el lado B: "));

        double C = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el lado C: "));

        if (A + B > C && A + C > B && B + C > A) {

            if (A == B && B == C) {

                JOptionPane.showMessageDialog(null,
                        "ESTRUCTURA VÁLIDA\n"
                                + "Triángulo EQUILÁTERO.\n"
                                + "Tres lados iguales.");

            } else if (A == B || A == C || B == C) {

                JOptionPane.showMessageDialog(null,
                        "ESTRUCTURA VÁLIDA\n"
                                + "Triángulo ISÓSCELES.\n"
                                + "Dos lados iguales.");

            } else {

                JOptionPane.showMessageDialog(null,
                        "ESTRUCTURA VÁLIDA\n"
                                + "Triángulo ESCALENO.\n"
                                + "Tres lados diferentes.");
            }

        } else {

            JOptionPane.showMessageDialog(null,
                    "ESTRUCTURA NO VÁLIDA.\n"
                            + "Los lados no forman un triángulo.");
        }
    }
}