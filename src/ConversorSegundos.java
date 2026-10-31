import java.util.Scanner;

public class ConversorSegundos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Segundos totales de renderizado: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println("\nTiempo ingresado: " + totalSegundos + " segundos");
        System.out.println("Equivale a: " + horas + " hora(s), "
                + minutos + " minuto(s) y " + segundos + " segundo(s).");

        sc.close();
    }
}