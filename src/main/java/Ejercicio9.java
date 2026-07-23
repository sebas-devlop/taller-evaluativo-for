import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bacterias;
        int horas;

        System.out.print("Ingrese la cantidad inicial de bacterias: ");
        bacterias = sc.nextInt();

        System.out.print("Ingrese la cantidad de horas: ");
        horas = sc.nextInt();

        for (int i = 1; i <= horas; i++) {
            bacterias = bacterias * 2;
            System.out.println("Hora " + i + ": " + bacterias + " bacterias");
        }

        sc.close();
    }
}