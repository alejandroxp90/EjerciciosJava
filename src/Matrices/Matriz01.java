package Matrices;
import java.util.Scanner;

/*@author Alejandro_xp90*/
public class Matriz01 {
   private Scanner teclado;
   private int[][] matriz01;
   
   public void CargarMatriz01(){
      teclado = new Scanner(System.in);
      matriz01 = new int[4][4];
      for(int f=0;f<4;f++){
          for(int k=0;k<4;k++){
              System.out.print("Ingrese los nuemeros: ");
              matriz01[f][k] = teclado.nextInt();
          }
      }
   }
   public void ImprimirMatriz01(){
       System.out.println("El resultado de la matriz de 4x4 es: ");
       for(int m=0;m<4;m++){
           System.out.println(matriz01[m][m]+" ");
       }
   }
    
      public static void main(String[] args) {
        Matriz01 mz1;
        mz1 = new Matriz01();
        mz1.CargarMatriz01();
        mz1.ImprimirMatriz01();
    }
}
