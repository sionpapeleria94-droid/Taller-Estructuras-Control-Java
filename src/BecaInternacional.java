import javax.swing.JOptionPane;

public class BecaInternacional {
    public static void main(String[] args) {

        int edad = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese su edad: "));

        double promedio = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese su promedio acumulado: "));

        int ingles = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "¿Tiene inglés certificado?\n1 = Sí\n0 = No"));

        int concurso = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "¿Ha ganado un concurso de algoritmos?\n1 = Sí\n0 = No"));

        if (edad >= 18 && edad <= 28
                && promedio >= 4.3
                && (ingles == 1 || concurso == 1)) {

            JOptionPane.showMessageDialog(null,
                    "RESULTADO DE CONVOCATORIA\n"
                            + "¡POSTULACIÓN APROBADA!\n"
                            + "Cumple los requisitos de edad, promedio y mérito académico.");

        } else {

            JOptionPane.showMessageDialog(null,
                    "RESULTADO DE CONVOCATORIA\n"
                            + "POSTULACIÓN NO APROBADA.\n"
                            + "No cumple todos los requisitos.");
        }
    }
}