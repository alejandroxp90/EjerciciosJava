package Vectores;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class VectorOdenMenMay {
    private Scanner teclado;
    private int[] vectorOrd;
    
    
    
    public void CargarDatos(){
     teclado = new Scanner(System.in);
     vectorOrd = new int[5];
     
     for(int f=0;f<vectorOrd.length;f++){
         System.out.print("Ingrese el valor del vector: ");
         vectorOrd[f] = teclado.nextInt();
     }     
    }
    
    public void OrdenarDatos(){
        for(int k=0; k<4; k++){
            for(int f=0; f<4-k; f++){
                if(vectorOrd[f]>vectorOrd[f+1]){
                    int aux;
                    aux = vectorOrd[f];
                    vectorOrd[f] = vectorOrd[f+1];
                    vectorOrd[f+1] = aux;
                }
            }
        }
    }
    public void ImprimirDatos(){
        System.out.println("Los valores ordenados de menor a mayor es: \n");
        for(int f=0; f<vectorOrd.length;f++){
            System.out.println(vectorOrd[f]);
        }        
    }
    
    public static void main(String[] args) {
        VectorOdenMenMay vMn1;
        vMn1 = new VectorOdenMenMay();
        vMn1.CargarDatos();
        vMn1.OrdenarDatos();
        vMn1.ImprimirDatos();
        
    }
    
}
