import javax.swing.JOptionPane;

public class AnioBisiesto {
    public static void main(String[] args) {

        int anio = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el año a evaluar: "));

        if ((anio % 4 == 0 && anio % 100 != 0)
                || (anio % 400 == 0)) {

            JOptionPane.showMessageDialog(null,
                    "El año " + anio + " ES BISIESTO.\n"
                            + "Febrero tiene 29 días.\n"
                            + "Total: 366 días.");

        } else {

            JOptionPane.showMessageDialog(null,
                    "El año " + anio + " NO ES BISIESTO.\n"
                            + "Febrero tiene 28 días.\n"
                            + "Total: 365 días.");
        }
    }
}