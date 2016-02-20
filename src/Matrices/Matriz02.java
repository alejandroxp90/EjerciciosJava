package Matrices;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class Matriz02 {
    private Scanner teclado;
    private int[][] matriz02;
    
    public void CargarMatriz02(){
        teclado = new Scanner(System.in);
        matriz02 = new int[3][4];
        System.out.println("Impresion de la matriz de 3x4 \n");
        for(int f=0;f<3;f++){
            for(int k=0;k<4;k++){
                System.out.print("Ingrese el numero: ");
                matriz02[f][k] = teclado.nextInt();
            }
        }
        
    }
    public void ImprimirM1(){
        System.out.println("La impresion de la primera fila es: \n");
        for(int f=0;f<4;f++){
            System.out.print(matriz02[0][f]+" ");
        }
    }
    public void ImprimirM2(){
        System.out.println("\nLa impresion de la ultima fila es: \n");
        for(int f=0;f<4;f++){
            System.out.print(matriz02[2][f]+" ");
        }
    }
    public void ImprimirM3(){
        System.out.println("\nLa impresion de la primera columna es: \n");
        for(int f=0;f<3;f++){
            System.out.print(matriz02[f][0]+" ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        Matriz02 mz2;
        mz2 = new Matriz02();
        mz2.CargarMatriz02();
        mz2.ImprimirM1();
        mz2.ImprimirM2();
        mz2.ImprimirM3();
    }
}
