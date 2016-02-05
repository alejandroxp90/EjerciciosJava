package PrimerosEjercicios;

import java.util.Scanner;

/** @author Alejandro_xp90*/
public class SuperficeCuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float lado;
        float superCuad;
        System.out.print("Ingrese el valor del lado: ");
        lado = teclado.nextFloat();
        superCuad = lado * lado;
        System.out.print("\n\nEl valor de la superficie para este cuadro es: ");
        System.err.print(superCuad);
    }
}
