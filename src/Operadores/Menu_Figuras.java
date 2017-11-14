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
    static double base;
    static double altura;
    static double area;
    static double longitud;

    public Menu_Figuras() {
        Menu();
    }

    public void Menu() {
        int opc;
        do {
            System.out.println("\n***** MENÚ *****");
            System.out.println("  1.RECTÁNGULO");
            System.out.println("  2.CUADRADO");
            System.out.println("  3.TRIÁNGULO");
            System.out.println("  4.CERRAR");
            System.out.println("----------------");
            System.out.print("Selecciona una opción: ");
            opc = tec.nextInt();

            while (opc < 1 || opc > 4) { // MEDIDA DE PREVENCIÓN DE ERRORES
                System.out.println("\nError, seleccione de nuevo: ");
                opc = tec.nextInt();
            }

            switch (opc) {
                case 1:
                    Rectangulo();
                    System.out.println("\nEl área del rectángulo es: " + area);
                    System.out.println("La longitud del rectángulo es: " + longitud);
                    break;
                case 2:
                    Cuadrado();
                    System.out.println("\nEl área del rectángulo es: " + area);
                    System.out.println("La longitud del rectángulo es: " + longitud);
                    break;
                case 3:
                    Triangulo();
                    break;
            }
        } while (opc != 4);
    }

    public void Rectangulo() {

        System.out.print("\nIntroduce la base: ");
        base = tec.nextDouble();
        base = Metodos.MayorCero(base);

        System.out.print("Introduce la altura: ");
        altura = tec.nextDouble();
        altura = Metodos.MayorCero(altura);

        area = base * altura;
        longitud = 2 * base + 2 * altura;
    }

    public void Cuadrado() {

        System.out.print("\nIntroduce el lado: ");
        base = tec.nextDouble();
        base = Metodos.MayorCero(base);

        area = Math.pow(base, 2);
        longitud = base * 4;
    }

    public double Triangulo() {

        System.out.print("\nIntroduce la base: ");
        base = tec.nextDouble();
        base = Metodos.MayorCero(base);

        System.out.print("Introduce la altura: ");
        altura = tec.nextDouble();
        altura = Metodos.MayorCero(altura);

        area = base * altura / 2;
        System.out.println("El área del triángulo es: " + area);

        return area;

    }

    public static void main(String[] args) {
        new Menu_Figuras();
    }
}
