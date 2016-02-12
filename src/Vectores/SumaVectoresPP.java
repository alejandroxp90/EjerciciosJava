package Vectores;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class SumaVectoresPP {
    private Scanner teclado;
    private int[] vector1;
    private int[] vector2;
    private int[] sumaVector;
    
    public void CargarVector(){
        teclado = new Scanner(System.in);
        vector1 = new int[4];
        for(int f=0; f<4; f++){
            System.out.print("Ingrese el valor del vector A: ");
            vector1[f] = teclado.nextInt();
        }
        vector2 = new int[4];
        for(int f=0; f<4; f++){
            System.out.print("Ingrese el valor del vector B: ");
            vector2[f] = teclado.nextInt();
        }       
    }
    public void sumaVectores(){
        sumaVector = new int[4];
        for(int f=0; f<4; f++){            
        sumaVector[f] = vector1[f] + vector2[f];
       }
        System.out.println("La suma de los vectores es: ");
        for(int f=0;f<4;f++){
            System.out.println(sumaVector[f]);
        }
    }
    public static void main(String[] args) {
        SumaVectoresPP svPP;
        svPP = new SumaVectoresPP();
        svPP.CargarVector();
        svPP.sumaVectores();
    }
}
