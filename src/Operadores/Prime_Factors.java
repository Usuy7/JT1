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

        int num, div = 2;
        int cont = 0;

        System.out.print("Introduce un número: ");
        num = tec.nextInt();
        num = Metodos.MayorCero(num);

        System.out.print(num + " = ");
        
        for (int i = 0; i <= num; i++) {
            if (num % div == 0) {
                System.out.print(div + " ");
                num = num / div;
            } else {
                div++;
            }
        }
        
    }
    public static void main(String[] args) {
        new Prime_Factors();
    }
}
