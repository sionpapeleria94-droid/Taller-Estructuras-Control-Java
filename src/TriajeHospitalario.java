import javax.swing.JOptionPane;

public class TriajeHospitalario {
    public static void main(String[] args) {

        int dificultad = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "¿Presenta dificultad respiratoria grave?\n1 = Sí\n2 = No"));

        if (dificultad == 1) {

            JOptionPane.showMessageDialog(null,
                    "CLASIFICACIÓN TRIAJE\n"
                            + "Nivel I (Rojo)\n"
                            + "Atención inmediata.");

        } else {

            double temperatura = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese la temperatura corporal: "));

            int dolor = Integer.parseInt(
                    JOptionPane.showInputDialog("Nivel de dolor (1 a 10): "));

            if (temperatura > 39.0 || dolor >= 8) {

                JOptionPane.showMessageDialog(null,
                        "CLASIFICACIÓN TRIAJE\n"
                                + "Nivel II (Naranja)\n"
                                + "Tiempo máximo de espera: 15 minutos.");

            } else {

                JOptionPane.showMessageDialog(null,
                        "CLASIFICACIÓN TRIAJE\n"
                                + "Nivel III (Amarillo)\n"
                                + "Tiempo máximo de espera: 60 minutos.");
            }
        }
    }
}