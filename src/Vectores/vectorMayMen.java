package Vectores;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class vectorMayMen {
    private Scanner teclado;
    private int[] vector;
    
    
    public void CargarVector(){
        teclado = new Scanner(System.in);
        vector = new int[10];
        
        for(int f=0; f<10;f++){
            System.out.print("Ingrese un valor para el vector: ");
            vector[f] = teclado.nextInt();
        }        
    }
    public void VerificarOrden(){
        int orden = 1;
        for(int f=0; f<9;f++){
            if(vector[f+1]<vector[f]){
                orden=0;
            }            
        }
        if(orden==1){
                System.out.print("El vector esta ordenado de menor a mayor...\n");
            }else{
                System.out.print("El vector No esta ordenado de menor a mayor...\n");
            }
    }
    public static void main(String[] args) {
        vectorMayMen vMm1;
        vMm1 = new vectorMayMen();
        vMm1.CargarVector();
        vMm1.VerificarOrden();
    }
}
