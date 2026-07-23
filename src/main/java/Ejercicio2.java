import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidadPiezas;
        int peso;
        int aprobadas = 0;
        int defectuosas = 0;

        System.out.print("¿Cuántas piezas se van a revisar?: ");
        cantidadPiezas = sc.nextInt();

        for (int i = 1; i <= cantidadPiezas; i++) {
            System.out.print("Ingrese el peso de la pieza " + i + " (g): ");
            peso = sc.nextInt();

            if (peso >= 100 && peso <= 120) {
                aprobadas++;
            } else {
                defectuosas++;
            }
        }

        System.out.println("Piezas aprobadas: " + aprobadas);
        System.out.println("Piezas defectuosas: " + defectuosas);

        sc.close();
    }
}
