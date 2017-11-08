package Operadores;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

// Algoritmo que permita averiguar si dos números son amigos.

public class Friends {

    public static int suma (int n, int s) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }
        return s;
    }

    public Friends() {

        Scanner teclado = new Scanner(System.in);

        int n1, n2;
        int sum1 = 1, sum2 = 1;

        System.out.println("Introduce el primer número: ");
        n1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        n2 = teclado.nextInt();

        sum1 = suma(n1, sum1);
        sum2 = suma(n2, sum2);

        if ((sum1 == n2) && (sum2 == n1)) {

            System.out.println("Son números amigos");

        } else {

            System.out.println("No son números amigos");
        }

    }

    public static void main(String[] args) {
        new Friends();
    }
}
