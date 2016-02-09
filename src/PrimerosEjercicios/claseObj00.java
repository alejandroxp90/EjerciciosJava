package PrimerosEjercicios;

import java.util.Scanner;

/*@author Alejandroxp90*/
public class claseObj00 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreP;
        int edadP;
        
        System.out.print("Ingrese el nombre: ");
        nombreP = teclado.next();
        System.out.print("Ingrese la edad: ");
        edadP = teclado.nextInt();
        
        if(edadP>=18){
            System.out.print("\nLa persona de nombre: ");
            System.out.println(nombreP);
            System.out.println("Es mayor de 18 años...");
        }else{
            System.out.print("\nLa persona de nombre: ");
            System.out.println(nombreP);
            System.out.println("Es menor de 18 años...");
        }
        
        
    }
    
    
}
