import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int primero = 0;
        int segundo = 1;
        int siguiente;

        System.out.print("Ingrese la cantidad de términos: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print(primero);

            if (i < n) {
                System.out.print(", ");
            }

            siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

        sc.close();
    }
}
