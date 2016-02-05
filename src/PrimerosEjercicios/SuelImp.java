package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90 */
public class SuelImp {
    public static void main(String[] args) {
        float sueldo;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el sueldo que percibe: ");
        sueldo = teclado.nextFloat();
        if (sueldo>3000) {
            System.err.println("Debe abonar impuestos por favor...");                   
        }   
        else{
                    System.out.println("Su sueldo es menor a 3000 pesos no debe abonar impuestos...");
                    }
    }    
}
