package P3;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
/*
Escribe un programa en java que lea dígitos por teclado (de uno en uno) y termine cuando se
introduzca un número negativo. Con esos dígitos ha de crear un número entero (entero largo, por si
tiene muchas cifras) que tenga como unidad la primera de las cifras introducidas, como decena la
segunda, y así sucesivamente. Al final sacará ese número por pantalla.
 */
public class Number_Unity {

    public Number_Unity() {

        Scanner tec = new Scanner(System.in);

        long num, unity = 0, cont = 1;

        System.out.print("Introduce un número: ");
        num = tec.nextInt();

        while (num >= 0) {

            unity += num * (cont);
            cont *= 10;

            System.out.print("Introduce un número: ");
            num = tec.nextInt();
        }

        System.out.println(unity);
    }

    public static void main(String[] args) {
        new Number_Unity();
    }
}
