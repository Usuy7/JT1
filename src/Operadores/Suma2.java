package Operadores;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Suma2 {
    
    // Calcular la suma de los cuadrados de los diez primeros números naturales.
    
    public Suma2 (){
        
        Scanner teclado = new Scanner(System.in);
        
        int total = 0;

        for (int i = 0; i <= 10; i++) {
            total = total + i * i;
        }

        System.out.println(total);
    }

    public static void main(String[] args) {
        new Suma2();
    }
}
