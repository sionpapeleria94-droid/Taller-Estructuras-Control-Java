import java.util.Scanner;

public class SobrepesoEquipaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del pasajero: ");
        String nombre = sc.nextLine();

        System.out.print("Valor del tiquete: $");
        double tiquete = sc.nextDouble();

        System.out.print("Peso de la maleta en kg: ");
        double peso = sc.nextDouble();

        double total = tiquete;

        if (peso > 23) {
            double exceso = peso - 23;
            double recargo = exceso * 15000;

            total = total + recargo;

            System.out.println("\n¡ALERTA! Equipaje con sobrepeso.");
            System.out.println("Kilos excedentes: " + exceso);
            System.out.println("Recargo aplicado: $" + recargo);
        }

        System.out.println("\n=== RESUMEN DEL TIQUETE ===");
        System.out.println("Pasajero: " + nombre);
        System.out.println("Total final a pagar: $" + total);

        sc.close();
    }
}