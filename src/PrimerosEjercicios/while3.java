package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class while3 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       float x = 1, nPiezas, cantPiezas = 0, longPerfil;
        System.out.print("Ingrese el numero de piezas: ");
        nPiezas = teclado.nextFloat();
       while(x<=nPiezas){
           System.out.print("Ingrese la longitud de la pieza: ");
           longPerfil = teclado.nextFloat();
           if(longPerfil >= 1.20 && longPerfil <= 1.30){
           cantPiezas = cantPiezas + 1;           
       }       
           x++;
       }    
        System.out.print("La cantidad de piezas que hay entre el rango permitido es: ");
        System.out.println(cantPiezas);
    }
}
