package P2;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.print("Tabla del " + n + "\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
