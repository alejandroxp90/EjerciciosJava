package PrimerosEjercicios;

import java.util.Scanner;

/** @author Alejandro_xp90 */
public class numMay {
        public static void main(String[] args) {
        float num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextFloat();
         System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextFloat();
        if (num1>num2) {
                System.out.print("El numero mayor es: ");
                System.out.println(num1);
                    }else{
            System.out.print("El numero mayor es: ");
            System.out.println(num2);
        }
    }    
}
    

