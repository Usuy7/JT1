package P3_1;
import Metodos.Metodos;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
// Realiza un algoritmo que calcule la suma de los divisores de N.
public class Divisors_Sum {

    public Divisors_Sum() {

        Scanner tec = new Scanner(System.in);

        int suma = 0;
        String numbers = "";

        System.out.print("Introduce un número: ");
        int num = tec.nextInt();
        num = Metodos.MayorCero(num);

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                suma += i;
                numbers = numbers + " " + Integer.toString(i);
            }
        }

        System.out.println("\nLos divisores son: " + numbers);
        System.out.print("La suma de los divisores es: " + suma);
    }

    public static void main(String[] args) {
        new Divisors_Sum();
    }
}
