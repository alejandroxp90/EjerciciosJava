package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class informeAnti {
    public static void main(String[] args) {
        float sueldo, antiguedad, aumento20,aumento5;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el sueldo que actualemte percibe: ");
        sueldo = teclado.nextFloat();
        System.out.print("\nIngrese los años de antiguedad en el empresa: ");
        antiguedad = teclado.nextFloat();
        
        aumento20 = (sueldo * 20 /100) + sueldo;
        aumento5 = (sueldo * 5 /100) + sueldo;
        
        if(sueldo < 500 && antiguedad >= 10){
            System.out.println("Su incremento en el sueldo es del 20%");
            System.out.print("Su nuevo sueldo es de: ");
            System.out.println(aumento20);
        }else{
            if(sueldo < 500 && antiguedad < 10){
            System.out.println("Su incremento en el sueldo es del 5%");
            System.out.print("Su nuevo sueldo es de: ");
            System.out.println(aumento5); 
            }else{
                if(sueldo >= 500){
                    System.out.println("\nEl sueldo permanece sin CAMBIOS gracias por su visita...");
                }
            }
        }
        
    }
}
