package EjerciciosClases;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class PuntoPlano {
    private Scanner teclado;
    private float x, y;

   public void Inicializar(){
       teclado = new Scanner(System.in);
       System.out.print("Ingrese la coordenada X: ");
       x = teclado.nextFloat();
       System.out.print("Ingrese la coordenada Y: ");
       y = teclado.nextFloat();       
   }
   public void ImprimirCuadrante(){
       if(x>0 && y>0){
           System.out.println("\nLos puntos se encuentran en el PRIMER CUADRANTE...");
       }else{
           if(x<0 && y>0){
               System.out.println("\nLos puntos se encuentran en el SEGUNDO CUADRANTE...");
           }else{
               if(x<0 && y<0){
                   System.out.println("\nLos puntos se encuentran en el TERCER CUADRANTE...");
               }else{
                   if(x>0 && y<0){
                       System.out.println("\nLos puntos se encuentran en el CUARTO CUADRANTE...");
                   }else{
                       System.out.println("\nLos puntos no se encuentran en ningun cuadrante...");
                   }
               }
           }
       }
   }
   
    public static void main(String[] args) {
        PuntoPlano puntoPlano;
        puntoPlano = new PuntoPlano();
        puntoPlano.Inicializar();
        puntoPlano.ImprimirCuadrante();
    }
    
}
