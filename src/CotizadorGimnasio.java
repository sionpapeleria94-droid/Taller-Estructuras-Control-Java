import javax.swing.JOptionPane;

public class CotizadorGimnasio {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Nombre del cliente: ");

        int plan = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Seleccione el plan:\n"
                                + "1 = Mensual ($90.000)\n"
                                + "2 = Trimestral ($240.000)\n"
                                + "3 = Anual ($850.000)"));

        double valorPlan = 0;
        int meses = 0;
        String nombrePlan = "";

        switch (plan) {

            case 1:
                valorPlan = 90000;
                meses = 1;
                nombrePlan = "Mensual";
                break;

            case 2:
                valorPlan = 240000;
                meses = 3;
                nombrePlan = "Trimestral";
                break;

            case 3:
                valorPlan = 850000;
                meses = 12;
                nombrePlan = "Anual";
                break;

            default:
                JOptionPane.showMessageDialog(null, "Plan no válido.");
                return;
        }

        int edad = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la edad del cliente: "));

        int entrenador = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "¿Desea incluir entrenador personalizado?\n1 = Sí\n2 = No"));

        double descuento = 0;

        if (edad < 22 || edad > 60) {
            descuento = valorPlan * 0.10;
        }

        double suplemento = 0;

        if (entrenador == 1) {
            suplemento = 50000 * meses;
        }

        double total = valorPlan - descuento + suplemento;

        JOptionPane.showMessageDialog(null,
                "COTIZACIÓN DE GIMNASIO\n"
                        + "Cliente: " + nombre
                        + "\nPlan " + nombrePlan + ": $" + valorPlan
                        + "\nDescuento joven/senior (10%): -$" + descuento
                        + "\nSuplemento entrenador (" + meses
                        + " meses): $" + suplemento
                        + "\n--------------------------------"
                        + "\nTOTAL A PAGAR: $" + total);
    }
}