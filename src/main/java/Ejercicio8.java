import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra;

        System.out.print("Ingrese una palabra o cadena de texto: ");
        palabra = sc.nextLine();

        System.out.print("Cadena invertida: ");

        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }

        sc.close();
    }
}