package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90 */
public class cicloFor01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int f;
        float suma = 0, promedio, valor;
        
        for(f=1; f<=10; f++){
            System.out.print("Ingrese los datos a sumar: ");
            valor = teclado.nextFloat();
            suma = suma + valor;
            }
        promedio = suma / 10;
        System.out.print("La suma de los valores ingresados es: ");
        System.out.println(suma);
        System.out.print("El promedio de los valores sumados es: ");
        System.out.println(promedio);
    }
}
