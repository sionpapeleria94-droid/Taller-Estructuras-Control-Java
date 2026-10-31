import java.util.Scanner;

public class DivisionCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Consumo base: $");
        double consumo = sc.nextDouble();

        System.out.print("Porcentaje de propina: ");
        double porcentajePropina = sc.nextDouble();

        System.out.print("Cantidad de personas: ");
        int personas = sc.nextInt();

        double impoconsumo = consumo * 0.08;
        double propina = consumo * porcentajePropina / 100;
        double totalFactura = consumo + impoconsumo + propina;
        double cuotaPersona = totalFactura / personas;

        System.out.println("\n=== DETALLE DE LA CUENTA ===");
        System.out.println("Consumo: $" + consumo);
        System.out.println("Impoconsumo (8%): $" + impoconsumo);
        System.out.println("Propina: $" + propina);
        System.out.println("Total factura: $" + totalFactura);
        System.out.println("Cuota por persona: $" + cuotaPersona);

        sc.close();
    }
}
