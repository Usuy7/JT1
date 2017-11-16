package Operadores;
import Metodos.Metodos;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

public class PrimeFactors {
    
    // Algoritmo que lea un número entero y lo descomponga en factores primos.

    public PrimeFactors() {

        Scanner teclado = new Scanner(System.in);

        int num;
        String number = "";

        System.out.print("Introduce un número: ");
        num = teclado.nextInt();
        num = Metodos.MayorCero(num);
        number = Integer.toString(num);
        number = Metodos.DescomponerFP(num);
        System.out.println(number);
    }

    public static void main(String[] args) {
        new PrimeFactors();
    }
}
