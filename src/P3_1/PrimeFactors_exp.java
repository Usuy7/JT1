package P3_1;
import Metodos.Metodos;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
/*
Realiza un algoritmo que visualice en pantalla los factores primos de N 
en la forma “ A exp B ” siendo A el factor primo y B el exponente.
 */
public class PrimeFactors_exp {

    public PrimeFactors_exp() {

        Scanner tec = new Scanner(System.in);

        int num, div = 2, exp = 0;

        System.out.print("Introduce un número: ");
        num = tec.nextInt();
        num = Metodos.MayorCero(num);

        System.out.print(num + " = ");

        if (num == 1) {
            System.out.println("1 exp 1");
        } else {
            while (num != 1) {
                if (num % div == 0) {
                    num = num / div;
                    exp++;
                    while (num % div == 0) {
                        num = num / div;
                        exp++;
                    }
                    System.out.print(div + " exp " + exp + " ");
                } else {
                    div++;
                    exp = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        new PrimeFactors_exp();
    }
}
