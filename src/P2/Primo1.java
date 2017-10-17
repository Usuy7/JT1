package P2;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Primo1 {

    public Primo1() {

        Scanner teclado = new Scanner(System.in);

        int n, c = 2;

        System.out.print("Introduce un numero positivo: ");
        n = teclado.nextInt();

        while (n < 0) {
            System.out.print("El número no es valido, vuelve a introducirlo: ");
            n = teclado.nextInt();
        }

        while (n % c != 0) {
            c = c + 1;
        }

        if (n == c) {
            System.out.print("Es un numero primo ");
        } else {
            System.out.print("No es un numero primo ");
        }

    }

    public static void main(String[] args) {
        new Primo1();
    }
}
