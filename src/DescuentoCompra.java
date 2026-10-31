import javax.swing.JOptionPane;

public class DescuentoCompra {

    public static void main(String[] args) {

        double valor = Double.parseDouble(
                JOptionPane.showInputDialog("Valor de la compra: "));

        double valorDescuento = 0;
        String promocion = "";

        int martes = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "¿Hoy es martes de descuento?\n1 = Sí\n2 = No"));

        if (martes == 1) {

            int medioPago = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Medio de pago:\n1 = Efectivo\n2 = Tarjeta"));

            if (medioPago == 1) {

                valorDescuento = valor * 0.15;
                promocion = "Martes en efectivo (15%)";

            } else {

                valorDescuento = valor * 0.10;
                promocion = "Martes con tarjeta (10%)";

            }

        } else {

            if (valor > 500000) {

                valorDescuento = valor * 0.03;
                promocion = "Descuento general (3%)";

            } else {

                promocion = "Sin descuento";

            }
        }

        double total = valor - valorDescuento;

        JOptionPane.showMessageDialog(null,
                "========== RECIBO DE COMPRA ==========\n\n"
                        + "Valor de compra: $" + valor
                        + "\nPromoción: " + promocion
                        + "\nDescuento: $" + valorDescuento
                        + "\n--------------------------------------"
                        + "\nTOTAL A PAGAR: $" + total);
    }
}