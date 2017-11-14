package Operadores;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Metodos {

    static Scanner tec = new Scanner(System.in);

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
    
    public static int PrimosNot(int num) {

        while (num <= 0) {
            System.out.println("Error");
            num = tec.nextInt();
        }
        return num;
    }
    
    public static int Primos(int num) {

        while (num <= 0) {
            System.out.println("Error");
            num = tec.nextInt();
        }
        return num;
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
        
        /*
        int num = 85;
        String num1 = "";
        
        Integer.toString(num);
        
        num1 = Metodos.DescomponerFP(num);
        System.out.println(num1);
        */
        return numbers;
    }
}
