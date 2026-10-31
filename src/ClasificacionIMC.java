import java.util.Scanner;
import java.util.Locale;

public class ClasificacionIMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        double peso;
        double estatura;
        double imc;
        String diagnostico;

        System.out.print("Ingrese el nombre del deportista: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese el peso en kilogramos: ");
        peso = sc.nextDouble();

        System.out.print("Ingrese la estatura en metros: ");
        estatura = sc.nextDouble();

        imc = peso / (estatura * estatura);

        if (imc < 18.5) {

            diagnostico = "Bajo peso";

        } else if (imc < 25.0) {

            diagnostico = "Peso normal";

        } else if (imc < 30.0) {

            diagnostico = "Sobrepeso";

        } else {

            diagnostico = "Obesidad";
        }

        System.out.println("\n----- RESULTADO DEL IMC -----");

        System.out.println("Paciente: " + nombre);

        System.out.println("IMC Calculado: "
                + String.format(Locale.forLanguageTag("es-CO"),
                "%.2f", imc));

        System.out.println("Diagnostico: " + diagnostico);

        sc.close();
    }
}