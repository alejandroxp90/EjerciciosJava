package PrimerosEjercicios;

import java.util.Scanner;

/*@author Alejandroxp90*/
public class cadena01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad1, edad2;
        String nomApe1, nomApe2;
        
        System.out.print("Ingrese el Nombre y Apellido de la persona: ");
        nomApe1 = teclado.nextLine();
        System.out.print("Ingrese la edad de la persona:");
        edad1 = teclado.nextInt();
        System.out.print("Ingrese el Nombre y Apellido de la persona: ");
        teclado.nextLine();
        nomApe2 = teclado.nextLine();
        System.out.print("Ingrese la edad de la persona:");
        edad2 = teclado.nextInt();
        
        if(edad1>edad2){
            System.out.print("El nombre de la persona con mayor edad es: ");
            System.out.println(nomApe1);
        }else{
            System.out.print("El nombre de la persona con mayor edad es: ");
            System.out.println(nomApe2);
        }
        
    }
}
