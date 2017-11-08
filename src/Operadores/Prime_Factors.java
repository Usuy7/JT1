package Operadores;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */

/*
Realiza un algoritmo que visualice en pantalla los factores primos de N 
en la forma “ A exp B ” siendo A el factor primo y B el exponente.
 */
public class Prime_Factors {

    public Prime_Factors() {

        Scanner tec = new Scanner(System.in);

        String numbers = "";

        System.out.print("Introduce un número: ");
        int num = tec.nextInt();

        while (num <= 0) {
            System.out.print("El número introducido no es válido, introduce otro: ");
            num = tec.nextInt();
        }

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " * ");
                //numbers = numbers + " " + Integer.toString(i);
                num = num / i;
            }
        }

        System.out.println(numbers);
    }

    public static void main(String[] args) {
        new Prime_Factors();
    }
}
