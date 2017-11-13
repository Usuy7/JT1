package Operadores;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Factorial_Number {

    public Factorial_Number() {

        Scanner tec = new Scanner(System.in);

        double num, factorial = 1;

        System.out.print("Introduce un número: ");
        num = tec.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }

    public static void main(String[] args) {
        new Factorial_Number();
    }
}
