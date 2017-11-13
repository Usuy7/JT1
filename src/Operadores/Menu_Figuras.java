package Operadores;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
/*
Escribir un programa que calcule la longitud y el área de las siguientes figuras geométricas:
rectángulo, cuadrado y triángulo. Para ello, primero pediremos de qué figura se desean calcular estos
dos datos
 */
public class Menu_Figuras {

    static Scanner tec = new Scanner(System.in);

    public Menu_Figuras() {
        Menu();
    }

    public void Menu() {
        int opc;
        do {
            System.out.println("***** MENÚ *****");
            System.out.println("  1.RECTÁNGULO");
            System.out.println("  2.CUADRADO");
            System.out.println("  3.TRIÁNGULO");
            System.out.println("  4.CERRAR");
            System.out.println("----------------");
            System.out.println("Selecciona una opción: ");
            
            opc = tec.nextInt();
        } while (opc != 4);

    }

    public int Rectangulo() {
        return 0;

    }

    public int Cuadrado() {
        return 0;

    }

    public int Triangulo() {
        return 0;

    }

    public static void main(String[] args) {
        new Menu_Figuras();
    }
}
