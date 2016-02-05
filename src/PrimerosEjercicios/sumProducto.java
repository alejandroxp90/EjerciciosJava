package PrimerosEjercicios;

import java.util.Scanner;

/*** @author Alejandro_xp90*/
public class sumProducto {
    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
        float num4;
        float suma;
        float producto;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextFloat();
        System.out.print("Ingrese el tercer numero: ");
        num3 = teclado.nextFloat();
        System.out.print("Ingrese el cuarto numero: ");
        num4 = teclado.nextFloat();
        
        suma = num1 + num2;
        producto = num3 * num4;
        
        System.out.print("La suma de los primeros dos numeros es: ");
        System.out.println(suma);
        System.out.print("El producto de los numero 3 y 4 es: ");
        System.out.println(producto);
    }
    
}
