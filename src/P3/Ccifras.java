package P3;

import java.util.Scanner;

/**
 * @author AlumMati
 */

// Escribir un algoritmo que pida un número entero y diga cuántas cifras tiene ese número.

public class Ccifras {

    public Ccifras() {
        Scanner teclado = new Scanner(System.in);

        int contador = 0;

        System.out.println("Introduce un número entero: ");
        int n = teclado.nextInt();

        while (n != 0) {
            n = n / 10;
            contador++;
        }
        System.out.println("El número tiene: " + contador + " cifras");
    }

    public static void main(String[] args) {
        
        new Ccifras();
    }
}
