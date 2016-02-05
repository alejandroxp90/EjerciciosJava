package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class planoCartesiano {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valX, valY;
        
        System.out.print("Ingrese el valor de X en el plano Cartesiano: ");
        valX = teclado.nextInt();
        System.out.print("\nIngrese el valor de Y en el plano Cartesiano: ");
        valY = teclado.nextInt();
        
        if(valX == 0 || valY == 0){
            System.out.println("\nNinguno de los valores debe ser igual a CERO");
        }else{
            if(valX > 0 && valY > 0){
                System.out.println("\nLas coordenadas proporcionadas pertenecen al PRIMER CUADRANTE...");
            }else{
            if(valX < 0 && valY > 0){
                System.out.println("\nLas coordenadas proporcionadas pertenecen al SEGUNDO CUADRANTE...");
            }else{
            if(valX < 0 && valY < 0){
                System.out.println("\nLas coordenadas proporcionadas pertenecen al TERCER CUADRANTE...");
            }else{
            if(valX > 0 && valY < 0){
                System.out.println("\nLas coordenadas proporcionadas pertenecen al CUARTO CUADRANTE...");
            }
        }
      }
  }
 }
}
}