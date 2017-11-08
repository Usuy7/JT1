package Operadores;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

public class DescompFp {
    
    // Algoritmo que lea un número entero y lo descomponga en factores primos.

    public DescompFp() {

        Scanner teclado = new Scanner(System.in);

        int num = 0, num2 = 0, c = 2;

        System.out.print("Introduce un número: ");
        num = teclado.nextInt();
        num2 = num;

        if (num > 1) {

            System.out.print(num2 + " = ");

            System.out.print("1");

            for (int i = 0; i <= num; i++) {

                if (num % c == 0) {
                    System.out.print(" * " + c);
                    num = num / c;

                } else {
                    c++;
                }
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        new DescompFp();
    }
}
