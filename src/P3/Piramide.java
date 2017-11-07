 package P3;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Piramide {

    /*
    Algoritmo que pida un número entero, entre 0 y 20, y que muestre en pantalla una
    secuencia de números, repitiendo cada número tantas veces como el valor que representa.
     */
    public Piramide() {

        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.print("Introduce el valor: ");
        num = teclado.nextInt();

        while (num < 0 || num > 20) {
            System.out.println("El valor no es valido, prueba otra vez: ");
            num = teclado.nextInt();
        }

        for (int i = 1; i <= num; i++) {

            System.out.println("");

            for (int j = 1; j <= i; j++) {

                System.out.print(i);
            }
        }
    }

    public static void main(String[] args) {

        new Piramide();
    }
}
