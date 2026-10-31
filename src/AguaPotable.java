import javax.swing.*;
//debo de importar la herramienta

public class AguaPotable {
    public static void main(String[] args) {

        double consumo = Double.parseDouble(
        JOptionPane.showInputDialog("Ingrese el consumo en m3: "));

        double tarifa = 0;

        if (consumo <= 15) {
            tarifa = 2500;
        }
        else if (consumo <= 30) {
            tarifa = 3800;
        }
        else {
            tarifa = 5200;
        }
        //declaro las variables

        double costoAgua = consumo * tarifa;

        final double CARGO_FIJO = 12000;

        double total = costoAgua + CARGO_FIJO;

        //con JOption muestro mis resultados en ventanas
        //El "\n" se utiliza para los saltos de pagina

        JOptionPane.showMessageDialog(null, "CONSUMO: m³ " + consumo + "\n" + "TARIFA APLICADA: $" + tarifa + "\n" + "COSTO DEL AGUA: $" + costoAgua + "\n" + "CARGO FIJO: $" +  CARGO_FIJO + "\n" + "TOTAL A PAGAR: $" + total );

    }
}
