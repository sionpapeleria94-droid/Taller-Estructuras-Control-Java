import java.util.Scanner;

public class PresupuestoCombustible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de la ruta: ");
        String ruta = sc.nextLine();

        System.out.print("Distancia en kilómetros: ");
        double distancia = sc.nextDouble();

        System.out.print("Rendimiento (km por galón): ");
        double rendimiento = sc.nextDouble();

        System.out.print("Precio del galón: $");
        double precioGalon = sc.nextDouble();

        double galones = distancia / rendimiento;
        double costoTotal = galones * precioGalon;

        System.out.println("\n=== PRESUPUESTO DEL VIAJE ===");
        System.out.println("Ruta: " + ruta);
        System.out.printf("Combustible requerido: %.2f galones%n", galones);
        System.out.printf("Costo estimado: $%.2f%n", costoTotal);

        sc.close();
    }
}