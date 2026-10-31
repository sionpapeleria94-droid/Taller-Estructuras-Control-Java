import java.util.Scanner;

public class LiquidacionCosecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del recolector: ");
        String nombre = sc.nextLine();

        System.out.print("Kilos recolectados: ");
        double kilos = sc.nextDouble();

        System.out.print("Precio por kilo: ");
        double precioKilo = sc.nextDouble();

        double pagoBruto = kilos * precioKilo;
        double retencion = pagoBruto * 0.04;
        double netoPagar = pagoBruto - retencion;

        System.out.println("\n=== COMPROBANTE DE RECOLECCIÓN ===");
        System.out.println("Recolector: " + nombre);
        System.out.println("Peso: " + kilos + " kg");
        System.out.println("Pago bruto: $" + pagoBruto);
        System.out.println("Retención (4%): $" + retencion);
        System.out.println("NETO A PAGAR: $" + netoPagar);

        sc.close();
    }
}