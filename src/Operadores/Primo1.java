package Operadores;

import Metodos.Metodos;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
// Algoritmo para comprobar si un número es primo.
public class Primo1 {

    public Primo1() {

        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.print("Introduce un numero positivo: ");
        num = teclado.nextInt();
        num = Metodos.MayorCero(num);
        

        boolean primo = (num != 0);
        primo = Metodos.esPrimo(num);
        System.out.println(primo);

    }

    public static void main(String[] args) {
        new Primo1();
    }
}
