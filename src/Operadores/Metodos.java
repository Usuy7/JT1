package Operadores;

import static Operadores.Menu_Figuras.tec;

/**
 *
 * @author AlumMati
 */
public class Metodos {

    public static int MayorCero(int num) {

        while (num <= 0) {
            System.out.println("Error");
            num = tec.nextInt();
        }
        return num;
    }

    public static double MayorCero(double num) {

        while (num <= 0) {
            System.out.println("Error");
            num = tec.nextDouble();
        }
        return num;
    }
    
    
}
