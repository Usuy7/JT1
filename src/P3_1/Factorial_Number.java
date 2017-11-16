package P3_1;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Factorial_Number {

    static Scanner tec = new Scanner(System.in);
    
    public Factorial_Number() {
        Leer();
    }

    private void Leer() {

        long num, factorial;

        System.out.print("Introduce un número: ");
        num = tec.nextInt();
        System.out.println("El factorial del número es: " + (factorial = Factorial(num)));
    }
    
    private long Factorial(long num){
        
        int fact = 1;
        
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        
        return fact;  
    }

    public static void main(String[] args) {
        new Factorial_Number();
    }
}
