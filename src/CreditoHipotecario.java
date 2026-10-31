import javax.swing.JOptionPane;

public class CreditoHipotecario {
    public static void main(String[] args) {

        double ingreso = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese su ingreso mensual: "));

        if (ingreso >= 3000000) {

            int antiguedad = Integer.parseInt(
                    JOptionPane.showInputDialog("Antigüedad laboral en años: "));

            double deudas = Double.parseDouble(
                    JOptionPane.showInputDialog("Valor de sus deudas actuales: "));

            double porcentajeDeuda = (deudas / ingreso) * 100;

            if (antiguedad >= 2 && deudas <= ingreso * 0.30) {

                JOptionPane.showMessageDialog(null,
                        "[CRÉDITO APROBADO]\n"
                                + "Ingreso válido: $" + ingreso
                                + "\nAntigüedad cumplida: " + antiguedad + " años"
                                + "\nEndeudamiento: " + porcentajeDeuda + "%");

            } else {

                JOptionPane.showMessageDialog(null,
                        "[CRÉDITO RECHAZADO]\n"
                                + "No cumple con la antigüedad laboral o el límite de deudas.\n"
                                + "Endeudamiento: " + porcentajeDeuda + "%");
            }

        } else {

            JOptionPane.showMessageDialog(null,
                    "[CRÉDITO RECHAZADO]\n"
                            + "El ingreso mensual debe ser mínimo de $3.000.000.");
        }
    }
}