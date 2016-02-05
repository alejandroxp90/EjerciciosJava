package PrimerosEjercicios;

import java.util.Scanner;

/** @author Alejandro_xp90*/
public class periCuadra {
    public static void main(String[] args) {
        float lado;
        float perimetro;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado: ");
        lado = teclado.nextFloat();
        perimetro = lado * 4;
        System.out.print("\nEl perimetro del rectangulo es: ");
        System.out.println(perimetro);        
    }   
}
