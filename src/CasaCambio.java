import javax.swing.JOptionPane;

public class CasaCambio {
    public static void main(String[] args) {

        double pesos = Double.parseDouble(
                JOptionPane.showInputDialog("Pesos colombianos a cambiar: "));

        int moneda = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Seleccione la moneda destino:\n"
                                + "1 = Dólar estadounidense\n"
                                + "2 = Euro\n"
                                + "3 = Real brasileño"));

        double tasa = 0;
        String nombreMoneda = "";

        switch (moneda) {

            case 1:
                tasa = 4000;
                nombreMoneda = "USD";
                break;

            case 2:
                tasa = 4400;
                nombreMoneda = "EUR";
                break;

            case 3:
                tasa = 800;
                nombreMoneda = "BRL";
                break;

            default:
                JOptionPane.showMessageDialog(null, "Moneda no válida.");
                return;
        }

        double comision = 0;

        if (pesos < 1000000) {
            comision = pesos * 0.02;
        }

        double neto = pesos - comision;

        double divisas = neto / tasa;

        JOptionPane.showMessageDialog(null,
                "CASA DE CAMBIO INTERNACIONAL\n"
                        + "Monto: $" + pesos + " COP"
                        + "\nComisión: $" + comision + " COP"
                        + "\nNeto convertido: $" + neto + " COP"
                        + "\nRecibe: " + String.format("%.2f", divisas)
                        + " " + nombreMoneda);
    }
}