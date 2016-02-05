package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/

public class numMay2 
        {
    public static void main(String[] args) {
        
        float num1, num2, suma,resta,mult,div;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextFloat();
         System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextFloat();
        if (num1>num2) {            
            suma = num1 + num2;
            resta = num1 - num2;
                System.out.print("El numero mayor es: ");
                System.out.println(num1);
                System.out.print("La suma de los numero es: ");
                System.out.println(suma);
                System.out.print("La resta de los numero es: ");
                System.out.println(resta);
                    }else{
            mult = num1 * num2;
            div = num1 / num2;
            System.out.print("El numero mayor es: ");
            System.out.println(num2);
            System.out.print("La multiplicacion de los numero es: ");
                System.out.println(mult);
                System.out.print("La division de los numero es: ");
                System.out.println(div);
            
        }
    
}
}
