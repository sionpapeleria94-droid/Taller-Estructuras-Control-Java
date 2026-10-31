import javax.swing.JOptionPane;

public class PeajeVial {
    public static void main(String[] args) {

        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo: ");

        int categoria = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Categoría del vehículo:\n"
                                + "1 = Automóvil\n"
                                + "2 = Bus\n"
                                + "3 = Camión de 2 ejes\n"
                                + "4 = Tractomula"));

        double tarifa = 0;
        String tipoVehiculo = "";

        switch (categoria) {

            case 1:
                tarifa = 11500;
                tipoVehiculo = "Automóvil";
                break;

            case 2:
                tarifa = 18200;
                tipoVehiculo = "Bus";
                break;

            case 3:
                tarifa = 26000;
                tipoVehiculo = "Camión";
                break;

            case 4:
                tarifa = 42500;
                tipoVehiculo = "Tractomula";
                break;

            default:
                JOptionPane.showMessageDialog(null, "Categoría no válida.");
                return;
        }

        int telepeaje = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "¿Tiene telepeaje activo?\n1 = Sí\n2 = No"));

        double descuento = 0;

        if (telepeaje == 1) {
            descuento = tarifa * 0.05;
        }

        double total = tarifa - descuento;

        JOptionPane.showMessageDialog(null,
                "PEAJE NACIONAL\n"
                        + "Placa: " + placa
                        + "\nCategoría: " + tipoVehiculo
                        + "\nTarifa base: $" + tarifa
                        + "\nDescuento telepeaje (5%): $" + descuento
                        + "\nCOBRO TOTAL: $" + total);
    }
}