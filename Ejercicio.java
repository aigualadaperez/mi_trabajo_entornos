package ejercicio;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String nombre;
           double radio;
           int n;         
           System.out.print("Introduzca el radio de la circunferencia: ");
           radio = sc.nextDouble();
           System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
           System.out.print("Introduzca un n�mero entero: "); 
           n = sc.nextInt();//sin introduzco un 10, se almacena 10\n y el \n se queda
           System.out.println("El cuadrado es: " + Math.pow(n,2));
          // System.out.print("Introduzca otro n�mero entero: "); 
          //n = sc.nextInt();//aqu� no hace falta vaciar
          //System.out.println("El n�mero es: " + n);
           sc.nextLine();//vaciamos el buffer
           System.out.print("Introduzca su nombre: ");        
           nombre = sc.nextLine();  //leemos el String despu�s del double
           System.out.println("Hola " + nombre + "!!!");
    }
}
