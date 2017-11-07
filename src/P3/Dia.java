package P3;

import java.util.Scanner;

/*
 * @author AlumMati
 */
// Algoritmo que permita introducir fechas en formato Día/Mes/año y determine la fecha del día siguiente. Un día = 0 finaliza el proceso.
public class Dia {

    public Dia() {

        Scanner teclado = new Scanner(System.in);

        int dia, mes, ano;

        do {
            System.out.println("Introduce un año: ");
            ano = teclado.nextInt();

        } while (ano < 1904);

        do {
            System.out.println("Introduce el mes: ");
            mes = teclado.nextInt();

        } while (mes < 1 || mes > 12);

        do {
            System.out.println("Introduce el día: ");
            dia = teclado.nextInt();

        } while (dia < 1 || dia > 31);

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            while (dia < 1 || dia > 30) {
                System.out.println("El día introducido no existe, LOL, vuelve a probar.");
                System.out.println("Introduce el día: ");
                dia = teclado.nextInt();
            }
        }

        if (mes == 2) {
            if (ano % 4 == 0) {
                while (dia < 1 || dia > 29) {
                    System.out.println("El día introducido no existe, LOL, vuelve a probar.");
                    System.out.println("Introduce el día: ");
                    dia = teclado.nextInt();
                }
            } else {
                while (dia < 1 || dia > 28) {
                    System.out.println("El día introducido no existe, LOL, vuelve a probar.");
                    System.out.println("Introduce el día: ");
                    dia = teclado.nextInt();
                }
            }
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) {
            if (dia == 31) {
                System.out.println("\n La próxima fecha será: " + 1 + " / " + (mes + 1) + " / " + ano);
            } else {
                System.out.println("\n La próxima fecha será: " + (dia + 1) + " / " + mes + " / " + ano);
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia == 30) {
                System.out.println("\n La próxima fecha será: " + 1 + " / " + (mes + 1) + " / " + ano);
            } else {
                System.out.println("\n La próxima fecha será: " + (dia + 1) + " / " + mes + " / " + ano);
            }
        }

        if (mes == 12) {
            if (dia == 31) {
                System.out.println("\n La próxima fecha será: " + 1 + " / " + 1 + " / " + (ano + 1));
            } else {
                System.out.println("\n La próxima fecha será: " + (dia + 1) + " / " + mes + " / " + ano);
            }
        }

        if (mes == 2) {
            if (ano % 4 == 0) {
                if (dia == 29) {
                    System.out.println("\n La próxima fecha será: " + 1 + " / " + (mes + 1) + " / " + ano);
                } else {
                    System.out.println("\n La próxima fecha será: " + (dia + 1) + " / " + mes + " / " + ano);
                }
            } else {
                if (dia == 28) {
                    System.out.println("\n La próxima fecha será: " + 1 + " / " + (mes + 1) + " / " + ano);
                } else {
                    System.out.println("\n La próxima fecha será: " + (dia + 1) + " / " + mes + " / " + ano);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Dia();
    }
}
