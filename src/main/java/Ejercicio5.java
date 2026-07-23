import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ahorroMensual;
        int meses;
        int acumulado = 0;

        System.out.print("Ingrese el monto que ahorrará cada mes: $");
        ahorroMensual = sc.nextInt();

        System.out.print("Ingrese la cantidad de meses: ");
        meses = sc.nextInt();

        for (int i = 1; i <= meses; i++) {
            acumulado += ahorroMensual;
            System.out.println("Mes " + i + ": $" + acumulado);
        }

        sc.close();
    }
}