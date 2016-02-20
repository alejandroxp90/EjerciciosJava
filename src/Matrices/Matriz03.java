package Matrices;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class Matriz03 {
    private Scanner teclado;
    private int[][] matriz03;
    
    public void CargarMatriz03(){
        teclado = new Scanner(System.in);
        matriz03 = new int[2][5];
        for(int f=0;f<5;f++){
            for(int k=0;k<2;k++){
                System.out.print("Ingrese los datos de la matriz 2x5: ");
                matriz03[k][f] = teclado.nextInt();
            }
        }       
    }
    
    public void ImprimirMatriz03(){
        for(int f=0;f<2;f++){
            for(int k=0;k<5;k++){
                System.out.print(matriz03[f][k]+" ");                
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Matriz03 mz03;
        mz03 = new Matriz03();
        mz03.CargarMatriz03();
        mz03.ImprimirMatriz03();
    }
}
