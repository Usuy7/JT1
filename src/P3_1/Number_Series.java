package P3_1;

import Metodos.Metodos;
import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
/*
Algoritmo que capture una serie de números y que cuente y sume por separado, los pares, los impares, los positivos, 
los negativos, los primos y los perfectos. Teniendo en cuenta que un número puede cumplir a la vez varias de las 
condiciones anteriores, (2 es par y primo ). El cero finaliza la serie.
 */
public class Number_Series {

    Scanner tec = new Scanner(System.in);
    int num;
    String nume = " ";
    String secuencia = "", positivos = "", negativos = "", pares = "", impares = "", primos = "", nprimos = "", perfectos = "", nperfectos = "";
    int cont = 0, contPosi = 0, contNega = 0, contPar = 0, contImP = 0, contPrim = 0, contNPrim = 0, contPerfct = 0, contNPerfct = 0;
    int sumPosi = 0, sumNega = 0, sumPar = 0, sumImP = 0, sumPrim = 0, sumNPrim = 0, sumPerfct = 0, sumNPerfct = 0;
    float medPosi = 0, medNega = 0, medPar = 0, medImP = 0, medPrim = 0, medNPrim = 0, medPerfct = 0, medNPerfct = 0;
    float porcentPosi = 0, porcentNega = 0, porcentPar = 0, porcentImP = 0, porcentPrim = 0, porcentNPrim = 0, porcentPerfct = 0, porcentNPerfct = 0;

    public Number_Series() {
        Read();
        Return();
    }

    public void Read() {
        System.out.print("Introduce los números: ");
        nume = tec.nextLine();

        while (nume.equals("") || nume.equals(" ")) {
            System.out.print("Introduce algún número: ");
            nume = tec.nextLine();
        }

        num = Integer.parseInt(nume);

        if (num == 0) {
            while (num == 0) {
                System.out.print("Introduce un número distinto de 0: ");
                num = tec.nextInt();
            }
        }

        while (num != 0) {
            secuencia += " " + num;
            cont++;

            if (num > 0) {
                positivos += " " + num;
                contPosi++;
                sumPosi += num;
            }

            if (num < 0) {
                negativos += " " + num;
                contNega++;
                sumNega += num;
            }

            if (num % 2 == 0) {
                pares += " " + num;
                contPar++;
                sumPar += num;
            } else {
                impares += " " + num;
                contImP++;
                sumImP += num;
            }

            boolean primo = (num != 0);
            primo = Metodos.esPrimo(num);

            if (primo) {
                primos += " " + num;
                contPrim++;
                sumPrim += num;
            } else {
                nprimos += " " + num;
                contNPrim++;
                sumNPrim += num;
            }

            boolean perfecto = (num != 0);
            perfecto = Metodos.esPerfecto(num);

            if (perfecto) {
                perfectos += " " + num;
                contPerfct++;
                sumPerfct += num;
            } else {
                nperfectos += " " + num;
                contNPerfct++;
                sumNPerfct += num;
            }
            num = tec.nextInt();
        }
    }

    public void Return() {
        System.out.println("\nLos números a evaluar son:" + secuencia);
        System.out.println("\nNúmeros Positivos" + "\n" + positivos);
        System.out.println("Cantidad: " + contPosi);
        System.out.println("Suma: " + sumPosi);
        System.out.println("Media: " + (medPosi = sumPosi / contPosi));
        System.out.println("%: " + (porcentPosi = contPosi / cont * 100));

        System.out.println("\nNúmeros Negativos" + "\n" + negativos);
        System.out.println("Cantidad: " + contNega);
        System.out.println("Suma: " + sumNega);
        System.out.println("Media: " + (medNega = sumNega / contNega));
        System.out.println("%: " + (porcentNega = contNega / cont * 100));

        System.out.println("\nNúmeros Pares" + "\n" + pares);
        System.out.println("Cantidad: " + contPar);
        System.out.println("Suma: " + sumPar);
        System.out.println("Media: " + (medPar = sumPar / contPar));
        System.out.println("%: " + (porcentPar = contPar / cont * 100));

        System.out.println("\nNúmeros Impares" + "\n" + impares);
        System.out.println("Cantidad: " + contImP);
        System.out.println("Suma: " + sumImP);
        System.out.println("Media: " + medImP);
        System.out.println("%: " + (porcentImP = contImP / cont * 100));

        System.out.println("\nNúmeros Primos" + "\n" + primos);
        System.out.println("Cantidad: " + contPrim);
        System.out.println("Suma: " + sumPrim);
        System.out.println("Media: " + (medPrim = sumPrim / contPrim));
        System.out.println("%: " + (porcentPrim = contPrim / cont * 100));

        System.out.println("\nNúmeros No Primos" + "\n" + nprimos);
        System.out.println("Cantidad: " + contNPrim);
        System.out.println("Suma: " + sumNPrim);
        System.out.println("Media: " + (medNPrim = sumNPrim / contNPrim));
        System.out.println("%: " + (porcentNPrim = contNPrim / cont * 100));

        System.out.println("\nNúmeros Perfectos" + "\n" + perfectos);
        System.out.println("Cantidad: " + contPerfct);
        System.out.println("Suma: " + sumPerfct);
        System.out.println("Media: " + (medPerfct = sumPerfct / contPerfct));
        System.out.println("%: " + (porcentPerfct = contPerfct / cont * 100));

        System.out.println("\nNúmeros No Perfectos" + "\n" + nperfectos);
        System.out.println("Cantidad: " + contNPerfct);
        System.out.println("Suma: " + sumNPerfct);
        System.out.println("Media: " + (medNPerfct = sumNPerfct / contNPerfct));
        System.out.println("%: " + (porcentPerfct = contNPerfct / cont * 100));

    }

    public static void main(String[] args) {
        new Number_Series();
    }
}
