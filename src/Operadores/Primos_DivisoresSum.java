package Operadores;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
/*
Desarrolla un algoritmo y codifícalo en java que:
a. Lea 2 números no primos, A y B
b. Calcule mediante una función la suma de los divisores de cada número.
c. Y visualice en el programa principal la suma de los divisores de los 2.
 */
public final class Primos_DivisoresSum {

    static Scanner tec = new Scanner(System.in);
    static int num1;
    static int sum1;
    static int num2;
    static int sum2;
    static int sumTotal;

    public Primos_DivisoresSum() {
        Leer();
    }

    public void Leer() {

        System.out.print("Introduce un número: ");
        num1 = tec.nextInt();
        num1 = Metodos.MayorCero(num1);
        boolean primo = (num1 != 0);
        primo = Metodos.esPrimo(num1);

        if (primo) {
            while (primo) {
                System.out.print("Introduce un número no primo: ");
                num1 = tec.nextInt();
                num1 = Metodos.MayorCero(num1);
                primo = (num1 != 0);
                primo = Metodos.esPrimo(num1);
            }
        }

        System.out.print("Introduce otro número: ");
        num2 = tec.nextInt();
        num2 = Metodos.MayorCero(num2);
        boolean primo2 = (num2 != 0);
        primo2 = Metodos.esPrimo(num2);

        if (primo2) {
            while (primo2) {
                System.out.print("Introduce un número no primo: ");
                num2 = tec.nextInt();
                num2 = Metodos.MayorCero(num2);
                primo2 = (num2 != 0);
                primo2 = Metodos.esPrimo(num2);
            }
        }

        System.out.println("\nLa suma de los divisores de " + num1 + " es: " + (sum1 = Metodos.SumaDivisores(num1)));
        System.out.println("La suma de los divisores de " + num2 + " es: " + (sum2 = Metodos.SumaDivisores(num2)));
        System.out.println("La suma conjunta de los divisores de ambos es: " + (sumTotal = sum1 + sum2));
    }

    public static void main(String[] args) {
        new Primos_DivisoresSum();
    }
}
