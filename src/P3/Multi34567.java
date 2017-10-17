package P3;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/* Programa que calcule cuántos múltiplos de 3, 4, 5, 6 y 7 están comprendidos
entre dos números enteros positivos introducidos por teclado comprendidos entre 0 y 50000.
 */
public class Multi34567 {

    public Multi34567() {

        Scanner teclado = new Scanner(System.in);

        int min = 0, max = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0;

        System.out.println("Introduce el intervalo minimo: ");
        min = teclado.nextInt();

        while (min < 0 || max > 50000) {
            System.out.println("El intervalo minimo no es valido");
            System.out.println("Vuelve a introducir el minimo: ");
            min = teclado.nextInt();
        }

        System.out.println("Introduce el intervalo maximo: ");
        max = teclado.nextInt();

        while (min < 0 || max > 50000) {
            System.out.println("El intervalo maximo no es valido");
            System.out.println("Vuelve a introducir el maximo: \n");
            max = teclado.nextInt();
        }

        for (int i = min; max >= i; i++) {

            if (i % 3 == 0) {
                cont3++;
            }
            if (i % 4 == 0) {
                cont4++;
            }
            if (i % 5 == 0) {
                cont5++;
            }
            if (i % 6 == 0) {
                cont6++;
            }
            if (i % 7 == 0) {
                cont7++;
            }
        }

        System.out.println("\nMultiplos de 3: " + cont3);
        System.out.println("Multiplos de 4: " + cont4);
        System.out.println("Multiplos de 5: " + cont5);
        System.out.println("Multiplos de 6: " + cont6);
        System.out.println("Multiplos de 7: " + cont7);
    }

    public static void main(String[] args) {
        new Multi34567();
    }
}
