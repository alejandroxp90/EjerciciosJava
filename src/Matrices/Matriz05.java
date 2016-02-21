package Matrices;
import java.util.Scanner;

/*@author Alejandroxp90*/
public class Matriz05 {
    private Scanner teclado;
    private int[][] matriz4;
    private int fila, col;
    
    public void CargarMatriz05(){
        teclado = new Scanner(System.in);        
        System.out.print("Inserte el numero de filas de la matriz: ");
        fila = teclado.nextInt();
        System.out.print("Inserte el numero de columnas de la matriz: ");
        col = teclado.nextInt();
        matriz4 = new int[fila][col];
        
        for(int f=0;f<matriz4.length;f++){
            for(int k=0;k<matriz4[f].length;k++){
                System.out.print("\nIngrese el valor: ");
                matriz4[f][k] = teclado.nextInt();
            }
        }              
    }
    public void ImprimirMayor(){
        int mayor = matriz4[0][0];
        int fila = 0;
        int columna =0;
        System.out.print("\nEl elemento mayor en la matriz es: ");
       for(int f=0;f<matriz4.length;f++){
            for(int k=0;k<matriz4[f].length;k++){
                if(matriz4[f][k]>mayor){
                    mayor = matriz4[f][k];
                    fila = f;
                    columna = k;
                }
            }
        }
       System.out.println(mayor);
        System.out.println("La fila donde esta "+mayor+" es "+fila+" la columna es "+columna);
    }
        
    public static void main(String[] args) {
        Matriz05 mz5;
        mz5 = new Matriz05();
        mz5.CargarMatriz05();
        mz5.ImprimirMayor();        
    }
}
