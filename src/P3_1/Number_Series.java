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
    String secuencia = "", positivos = "", negativos = "", pares = "", impares = "", primos = "", nprimos = "", perfectos = "", nperfectos = "", amigos = "";
    int contPosi = 0, contNega = 0, contPar = 0, contImP = 0, contPrim = 0, contNPrim = 0, contPerfct = 0, contNPerfct = 0, contFriends = 0;
    int sumPosi = 0, sumNega = 0, sumPar = 0, sumImP = 0, sumPrim = 0, sumNPrim = 0, sumPerfct = 0, sumNPerfct = 0, sumFriends = 0;
    float medPosi = 0,  medNega = 0,  medPar = 0,  medImP = 0,  medPrim = 0,  medNPrim = 0,  medPerfct = 0,  medNPerfct = 0,  medFriends = 0;
    float porcentPosi = 0,  porcentNega = 0,  porcentPar = 0, porcentImP = 0,  porcentPrim = 0, porcentNPrim = 0,  porcentPerfct = 0,  porcentNPerfct = 0,  porcentFriends = 0;
    
    public Number_Series() {
        Read();
        Return();
    }
    
    public void Read(){
        System.out.print("Introduce los números: ");
        do {
            num = tec.nextInt();
            secuencia += " " + num;
            
        } while (num != 0);
    }
    
    public void Return(){
        System.out.println("Los números a evaluar son:" + secuencia);
        
        System.out.println("Números Positivos" + "\n" + secuencia);
        System.out.println("Cantidad: " + secuencia);
        System.out.println("Suma: " + secuencia);
        System.out.println("Media: " + secuencia);
        System.out.println("%:" + secuencia);
        
        System.out.println("Números Negativos" + "\n" + secuencia);
        System.out.println("Cantidad: " + secuencia);
        System.out.println("Suma: " + secuencia);
        System.out.println("Media: " + secuencia);
        System.out.println("%:" + secuencia);
        
        System.out.println("Números Pares" + "\n" + secuencia);
        System.out.println("Cantidad: " + secuencia);
        System.out.println("Suma: " + secuencia);
        System.out.println("Media: " + secuencia);
        System.out.println("%:" + secuencia);
        
        System.out.println("Números Impares" + "\n" + secuencia);
        System.out.println("Cantidad: " + secuencia);
        System.out.println("Suma: " + secuencia);
        System.out.println("Media: " + secuencia);
        System.out.println("%:" + secuencia);
        
        System.out.println("Números Primos" + "\n" + secuencia);
        System.out.println("Cantidad: " + secuencia);
        System.out.println("Suma: " + secuencia);
        System.out.println("Media: " + secuencia);
        System.out.println("%:" + secuencia);
        
        System.out.println("Números No Primos" + "\n" + secuencia);
        System.out.println("Cantidad: " + secuencia);
        System.out.println("Suma: " + secuencia);
        System.out.println("Media: " + secuencia);
        System.out.println("%:" + secuencia);
        
        System.out.println("Números Perfectos" + "\n" + secuencia);
        System.out.println("Cantidad: " + secuencia);
        System.out.println("Suma: " + secuencia);
        System.out.println("Media: " + secuencia);
        System.out.println("%:" + secuencia);
        
        System.out.println("Números No Perfectos" + "\n" + secuencia);
        System.out.println("Cantidad: " + secuencia);
        System.out.println("Suma: " + secuencia);
        System.out.println("Media: " + secuencia);
        System.out.println("%:" + secuencia);
        
        System.out.println("Números Amigos" + "\n" + secuencia);
        System.out.println("Cantidad: " + secuencia);
        System.out.println("Suma: " + secuencia);
        System.out.println("Media: " + secuencia);
        System.out.println("%:" + secuencia);
    }

    public static void main(String[] args) {
        new Number_Series();
    }
}
