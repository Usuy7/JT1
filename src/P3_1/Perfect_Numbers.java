package P3_1;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
/**
 * Realiza un algoritmo que compruebe si un número es o no perfecto. Un número
 * es perfecto cuando la suma de sus divisores + 1 es igual al mismo número.
 */
public class Perfect_Numbers {

    public static String Divisors(int n, String d) {

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                if (i == 1) {
                    d = Integer.toString(i);
                } else {
                    d += " + " + Integer.toString(i);
                }
            }
        }
        return d;
    }

    public static int Sum(int n, int s) {

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        return s;
    }

    public Perfect_Numbers() {

        Scanner tec = new Scanner(System.in);

        int num, suma = 0;
        String divisores = "";

        System.out.print("Introduce el número a comprobar: ");
        num = tec.nextInt();

        while (num <= 0) {
            System.out.println("El número introducido no es válido, introduce otro: ");
            num = tec.nextInt();
        }

        divisores = Divisors(num, divisores);
        suma = Sum(num, suma);

        System.out.println("El resultado de la suma de los divisores es: " + divisores + " = " + suma);

        if (num == suma) {
            System.out.println("Por lo tanto el número " + num + " es perfecto");
        } else {
            System.out.println("Por lo tanto el número " + num + " no es perfecto");
        }

    }

    public static void main(String[] args) {
        new Perfect_Numbers();
    }
}
