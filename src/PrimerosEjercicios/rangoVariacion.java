package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class rangoVariacion {
    public static void main(String[] args) {
        float val1, val2, val3, rVariacion12, rVariacion23, rVariacion13, rVariacio23, rVariacio21,rVariacio13;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Escriba el PRIMER valor: ");
        val1 = teclado.nextFloat();
        System.out.print("Escriba el SEGUNDO valor: ");
        val2 = teclado.nextFloat();
        System.out.print("Escriba el TERCER valor: ");
        val3 = teclado.nextFloat();
        rVariacion12 = val1 - val2;
        rVariacion13 = val1 - val3;
        rVariacion23 = val2 - val3;
        
        rVariacio23 = val2 - val3;
        rVariacio21 = val2 - val1;
        rVariacio13 = val1 - val3;
        
        if(val1 > val2 && val2 > val3){
            System.out.print("\nEl valor MAYOR es: ");
            System.out.println(val1);
            System.out.print("El valor MENOR es: ");
            System.out.println(val3);
            
            System.out.print("\nEl rango de variacion entre el valor 1 y valor 2 es: ");
            System.out.println(rVariacion12);
            
            System.out.print("\nEl rango de variacion entre el valor 1 y valor 3 es: ");
            System.out.println(rVariacion13);
            
            System.out.print("\nEl rango de variacion entre el valor 2 y valor 3 es: ");
            System.out.println(rVariacion23);            
        }else{
            if(val2 > val1 && val1 > val3){
            System.out.print("\nEl valor MAYOR es: ");
            System.out.println(val2);
            System.out.print("El valor MENOR es: ");
            System.out.println(val3);
            
            System.out.print("\nEl rango de variacion entre el valor 2 y valor 3 es: ");
            System.out.println(rVariacio23);
            
            System.out.print("\nEl rango de variacion entre el valor 2 y valor 1 es: ");
            System.out.println(rVariacion13);
            
            System.out.print("\nEl rango de variacion entre el valor 1 y valor 3 es: ");
            System.out.println(rVariacio13);            
        }
        }
    }
}
