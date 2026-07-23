import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidadLecturas;
        int temperatura;
        int temperaturaMaxima = 0;

        System.out.print("¿Cuántas lecturas de temperatura se tomaron?: ");
        cantidadLecturas = sc.nextInt();

        for (int i = 1; i <= cantidadLecturas; i++) {
            System.out.print("Ingrese la temperatura " + i + ": ");
            temperatura = sc.nextInt();

            if (i == 1) {
                temperaturaMaxima = temperatura;
            } else if (temperatura > temperaturaMaxima) {
                temperaturaMaxima = temperatura;
            }
        }

        System.out.println("La temperatura máxima registrada fue: " + temperaturaMaxima + "°C");

        sc.close();
    }
}