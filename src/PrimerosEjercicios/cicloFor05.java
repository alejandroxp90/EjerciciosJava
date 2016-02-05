package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class cicloFor05 {
    public static void main(String[] args) {
         float baseTr = 0, alturaTr = 0, superficiTr = 0;
         int nPares, x, cant = 0;
         Scanner teclado = new Scanner(System.in);
         
         System.out.print("Cuantos pares de datos desea leer: ");
         nPares = teclado.nextInt();
         
         for(x=1; x<=nPares; x++){
             System.out.print("Ingrese la base del triangulo: ");
             baseTr = teclado.nextFloat();
             System.out.print("Ingrese la altura del triangulo: ");
             alturaTr = teclado.nextFloat();
             superficiTr = baseTr * alturaTr / 2;
         
         System.out.print("La superficie del triangulo es: ");
         System.out.println(superficiTr);
         
         if(superficiTr > 12){
             cant = cant + 1;
         }
         
         }
         System.out.print("La cantidad de superficies mayores a 12 es: ");
         System.out.println(cant);
    }
   
}
