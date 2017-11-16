package P3;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
/*
Escribe un programa en java que pida dos números enteros (base y altura) e imprima en pantalla un
rectángulo de : ceros en las filas impares y el número correspondiente a las filas pares, con esa base
y esa altura
*/
public class Rectangulo {
    
    public Rectangulo(){
        
        Scanner tec = new Scanner(System.in);
        
        int base, altura;
        
        System.out.println("Introduce la base: ");
        base = tec.nextInt();
        
        while (base <= 0) {
            System.out.print("El número introducido no es válido, introduce otro: ");
            base = tec.nextInt();
        }
        
        System.out.println("Introduce la altura: ");
        altura = tec.nextInt();
        
        while (altura <= 0) {
            System.out.print("El número introducido no es válido, introduce otro: ");
            altura = tec.nextInt();
        }
        
        System.out.println("");
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {
                if (i % 2 != 0){
                    System.out.print(0);
                } else {
                    System.out.print(i);
                }
            }
            System.out.println("");
        }
    }
  
    public static void main(String[] args) {
        new Rectangulo();
    }
}
