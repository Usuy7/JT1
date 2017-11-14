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
public class Primos_DivisoresSum {
    
    static Scanner tec = new Scanner (System.in);
    static int num1;
    static int num2;
    
    public Primos_DivisoresSum (){
        Leer();
    }
    
    public void Leer (){
        
        System.out.println("Introduce un número: ");
        num1 = tec.nextInt();
        num1 = Metodos.MayorCero(num1);
        System.out.println("Introduce otro número: ");
        num2 = tec.nextInt();
        num2 = Metodos.MayorCero(num1);
        
    }
    
    public static void main(String[] args) {
        new Primos_DivisoresSum();
    }
}
