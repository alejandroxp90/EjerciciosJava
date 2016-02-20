package Matrices;
import java.util.Scanner;

/*@author Alejandroxp90*/
public class Matriz04 {
    private Scanner teclado;
    private int[][] matriz4;
    private int m, n;
    
    public void CargarMatriz04(){
        teclado = new Scanner(System.in);        
        System.out.print("Inserte el numero de filas de la matriz: ");
        m = teclado.nextInt();
        System.out.print("Inserte el numero de columnas de la matriz: ");
        n = teclado.nextInt();
        matriz4 = new int[m][n];
        for (int[] matriz41 : matriz4) {
            for (int k = 0; k < matriz41.length; k++) {                
                System.out.print("Ingrese el valor: ");
                matriz41[k] = teclado.nextInt();
            }
        }        
    }
    public void ImprimirMCompleta(){
        System.out.println("\nLos datos de la matriz de presentan a continuacion: \n");
        for (int[] matriz41 : matriz4) {
            for (int k = 0; k < matriz41.length; k++) {
                System.out.print(matriz41[k] + " ");
            }
        }           
    }
    public void ImprimirUltimaF(){
        System.out.println("\n\nLos datos de la ultima fila se presentan a continuacion: \n");
        for(int c=0;c<matriz4[matriz4.length-1].length;c++){
            System.out.print(matriz4[matriz4.length-1][c] + " " );
        }
    }
    
    public static void main(String[] args) {
        Matriz04 mz4;
        mz4 = new Matriz04();
        mz4.CargarMatriz04();
        mz4.ImprimirMCompleta();
        mz4.ImprimirUltimaF();
    }
}
