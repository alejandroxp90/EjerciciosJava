package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandroxp90*/
public class cadena03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String apellido1, apellido2;
        
        System.out.print("Ingrese el primer apellido: ");
        apellido1 = teclado.next();
        System.out.print("Ingrese el segundo apellido: ");
        apellido2 = teclado.next();
        
        if(apellido1.equals(apellido2)){
            System.out.println("\nLos apellidos son IGUALES...");
        }else{
            System.out.println("\nLos apellidos son DIFERENTES...");
        }
    }
}
