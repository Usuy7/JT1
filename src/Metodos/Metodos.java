package Metodos;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Metodos {

    static Scanner tec = new Scanner(System.in);

    public static int MayorCero(int num) {

        while (num <= 0) {
            System.out.println("Error, introduce un número positivo");
            num = tec.nextInt();
        }
        return num;
    }

    public static double MayorCero(double num) {

        while (num <= 0) {
            System.out.print("Error, introduce un número mayor que cero: ");
            num = tec.nextDouble();
        }
        return num;
    }

    public static boolean esPrimo(int num) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (num != contador)) {
            if (num % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }

    public static int SumaDivisores(int num) {

        int suma = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static int CuantasCifras(int num) {

        int contador = 0;

        while (num != 0) {
            num = num / 10;
            contador++;
        }
        System.out.println("El número tiene: " + contador + " cifras");

        return contador;
    }

    public static String DescomponerFP(int num) {

        int c = 2;
        String numbers = "";

        if (num > 1) {
            System.out.print("1");
            for (int i = 0; i <= num; i++) {
                if (num % c == 0) {
                    numbers = numbers + " * " + Integer.toString(c);
                    num = num / c;
                } else {
                    c++;
                }
            }
        }
        return numbers;
    }
}
