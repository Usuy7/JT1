package P3;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
// Realiza un algoritmo que calcule la suma de los divisores de N.
public class Divisors_Sum {

    Scanner tec = new Scanner(System.in);

    public Divisors_Sum() {

        int suma = 1;
        String numbers="";

        System.out.print("Introduce un número: ");
        int num = tec.nextInt();

        while (num <= 0) {
            System.out.print("El número introducido no es válido, introduce otro: ");
            num = tec.nextInt();
        }
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                suma += i;
                numbers = numbers + " " + Integer.toString(i);
            }
        }
        
        System.out.println("\nLos divisores son: "+ numbers);
        System.out.print("La suma de los divisores es: " + suma);
    }

    public static void main(String[] args) {
        new Divisors_Sum();
    }
}
