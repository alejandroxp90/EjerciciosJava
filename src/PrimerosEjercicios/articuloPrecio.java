package PrimerosEjercicios;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class articuloPrecio {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float precioArt;
        int cantClient;
        float AbonoComp;
        
        System.out.print("Ingrese el precio del Articulo:  ");
        precioArt = teclado.nextFloat();
        System.out.print("Ingrese la cantidad de Articulos:  ");
        cantClient = teclado.nextInt();
        AbonoComp = precioArt * cantClient;
        System.out.print("\n\nEl total a pagar por sus Articulos es:  ");     
        System.out.println(AbonoComp);
    }     
}
   
