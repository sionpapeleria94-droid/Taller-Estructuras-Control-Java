import java.util.Scanner;

public class ControlTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temperatura;
        int litros;
        double valorInventario;
        double perdida;

        System.out.print("Ingrese la temperatura actual: ");
        temperatura = sc.nextDouble();

        System.out.print("Ingrese los litros de leche almacenados: ");
        litros = sc.nextInt();

        if (temperatura <= 4.0) {

            System.out.println("La cadena de frio es OPTIMA.");
            System.out.println("Temperatura actual: " + temperatura + " °C");

        } else {

            valorInventario = litros * 3200;
            perdida = valorInventario * 0.12;

            System.out.println("¡ALERTA DE TEMPERATURA ("
                    + temperatura + " °C)!");
            System.out.println("Riesgo en " + litros + " litros.");
            System.out.println("Perdida economica estimada (12%): $"
                    + perdida);
        }

        sc.close();
    }
}