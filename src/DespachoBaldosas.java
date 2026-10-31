import java.util.Scanner;

public class DespachoBaldosas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad;
        int cajas;
        int sobrantes;
        int faltantes;

        System.out.print("Ingrese la cantidad de baldosas solicitadas: ");
        cantidad = sc.nextInt();

        cajas = cantidad / 12;
        sobrantes = cantidad % 12;

        if (sobrantes == 0) {

            System.out.println("Pedido completo.");
            System.out.println("Se despacharan " + cajas
                    + " cajas exactas.");

        } else {

            faltantes = 12 - sobrantes;

            System.out.println("Pedido incompleto: Se arman "
                    + cajas + " cajas completas (" + (cajas * 12)
                    + " uds).");

            System.out.println("Faltan " + faltantes
                    + " baldosas para completar la caja #"
                    + (cajas + 1) + ".");
        }

        sc.close();
    }
}