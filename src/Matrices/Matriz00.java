package Matrices;
import java.util.Scanner;

/*@author Alejandro_xp90*/
public class Matriz00 {
  private Scanner teclado;
  private int[][] matriz;
  
  public void CargarMatriz(){
      teclado = new Scanner(System.in);
      matriz = new int[3][5];
      for(int a=0;a<3;a++){
          for(int f=0;f<5;f++){
              System.out.print("Ingrese un numero: ");
              matriz[a][f] = teclado.nextInt();
          }
      }
  }
  public void ImprimirMatriz00(){
      System.out.println("LA matriz de 3x5 es: \n");
      for(int a=0;a<3;a++){
          for(int f=0;f<5;f++){
              System.out.print(matriz[a][f] +" ");              
          }
          System.out.println();
      }
  }
  
    public static void main(String[] args) {
        Matriz00 mz0;
        mz0 = new Matriz00();
        mz0.CargarMatriz();
        mz0.ImprimirMatriz00();
    }
  
}
