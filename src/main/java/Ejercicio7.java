import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int trm;
        int conversion;

        System.out.print("Ingrese la TRM del día (COP por 1 USD): ");
        trm = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            conversion = i * trm;
            System.out.println(i + " USD = " + conversion + " COP");
        }

        sc.close();
    }
}