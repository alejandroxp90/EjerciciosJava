package PrimerosEjercicios;

import java.util.Scanner;

/*** @author Alejandro_xp90*/
public class OsumaProd {
    public static void main(String[] args) {
        int num1;
        int num2;
        int suma;
        int producto;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero entero: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        num2 = teclado.nextInt();
        
        suma = num1 + num2;
        producto = num1 * num2;
        
        System.out.print("El resultado de la suma de los numero es: ");
        System.out.print(suma);
        System.out.print("\nEl resultado del producto de los dos numeros es: ");
        System.out.print(producto + "\n");
        
    }
    
    
}
