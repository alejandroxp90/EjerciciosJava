package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class sumaIgual {
            public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int val1, val2, val3,suma;
        
        System.out.print("Ingrese el primer valor: ");
        val1 = teclado.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        val2 = teclado.nextInt();
        System.out.print("Ingrese el tercer valor: ");
        val3 = teclado.nextInt();
        suma = val3 * (val1 + val2);
        if(val1 == val2 && val2 == val3){
            System.out.print("El valor de la operacion de los tres numeros ingresados es: ");
            System.out.println(suma);
        }else{
            System.out.println("Gracias por ingresar sus valores....");
        }
}
}