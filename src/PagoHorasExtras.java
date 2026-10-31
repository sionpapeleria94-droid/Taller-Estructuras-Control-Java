import java.util.Scanner;

public class PagoHorasExtras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        double horas;
        double tarifa;
        double pagoOrdinario;
        double pagoExtras;
        double total;
        double horasExtras;

        System.out.print("Ingrese el nombre del operario: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        horas = sc.nextDouble();

        System.out.print("Ingrese la tarifa de la hora ordinaria: ");
        tarifa = sc.nextDouble();

        if (horas <= 44) {

            pagoOrdinario = horas * tarifa;
            pagoExtras = 0;
            total = pagoOrdinario;

        } else {

            horasExtras = horas - 44;

            pagoOrdinario = 44 * tarifa;
            pagoExtras = horasExtras * (tarifa * 1.25);

            total = pagoOrdinario + pagoExtras;
        }

        System.out.println("\n----- DESGLOSE SALARIAL -----");

        System.out.println("Operario: " + nombre);

        System.out.println("Pago ordinario: $" + pagoOrdinario);

        System.out.println("Pago horas extras: $" + pagoExtras);

        System.out.println("TOTAL A PAGAR: $" + total);

        sc.close();
    }
}