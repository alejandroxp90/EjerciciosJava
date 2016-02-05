package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class sumPromedio {
        public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
        float num4;
        float suma;
        float promedio;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextFloat();
        System.out.print("Ingrese el tercer numero: ");
        num3 = teclado.nextFloat();
        System.out.print("Ingrese el cuarto numero: ");
        num4 = teclado.nextFloat();
        
        suma = num1 + num2 + num3 + num4;
        promedio = (num1 + num2 + num3 + num4) / 4 ;
        
        System.out.print("La suma de los numeros es: ");
        System.out.println(suma);
        System.out.print("El promedio de los numeros es: ");
        System.out.println(promedio);
    }    
}
   
