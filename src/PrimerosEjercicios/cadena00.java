package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandroxp90 */
public class cadena00 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre1, nombre2;
        int edad1, edad2;
        
        System.out.print("Ingrese el nombre de la primera persona: ");
        nombre1 = teclado.next();
        System.out.print("Ingrese la edad: ");
        edad1 = teclado.nextInt();
        System.out.print("Ingrese el nombre de la segunda persona: ");
        nombre2 = teclado.next();
        System.out.print("Ingrese la edad: ");
        edad2 = teclado.nextInt();
                
        if(edad1>edad2){
            System.out.print("\nEl nombre de la persona con la mayor edad es: ");
            System.out.println(nombre1);
        }else{
            System.out.print("\nEl nombre de la persona con la mayor edad es: ");
            System.out.println(nombre2);
        }
    }
    
}
