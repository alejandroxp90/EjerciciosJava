package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class while2 {
    public static void main(String[] args) {
        float x = 1, suma = 0, prom, num =0;
        Scanner teclado = new Scanner(System.in);
        while(x <= 10){
            System.out.print("Ingrese un numero por favor: ");
            num = teclado.nextFloat();
            suma = suma + num;
            x++;   
        }
        prom = suma / 10;
        System.out.print("La suma total de los numeros ingresados es: ");
        System.out.print(suma);
        System.out.print("\nEl promedio de la suma actual es: ");
        System.out.println(prom);
    }
}
