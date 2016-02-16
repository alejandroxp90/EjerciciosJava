package Vectores;

import java.util.Scanner;

/**@author Alejandro_xp90 */
public class VectorMenor {
     private Scanner teclado;
     private int[] vectorN;
     private int menor;
     
     public void CargarElementos(){
         teclado = new Scanner(System.in);
         int nElementos;        

            System.out.print("Cuantos elementos desea calcular: ");
            nElementos = teclado.nextInt();
            
            vectorN = new int[nElementos];
         for(int f=0;f<nElementos;f++){
             System.out.print("Ingrese el elemento numero "+f+": ");
             vectorN[f] = teclado.nextInt();
         }
     }
     
     public void ImprimirElementos(){
         menor = vectorN[0];
         int pos = 0;
         
         for(int f=1;f<vectorN.length;f++){
             if(vectorN[f]<menor){
                 menor = vectorN[f];  
                 pos = f;
             }           
         }
         System.out.print("El valor menor del arreglo es: "+menor);         
     }
     
     public void RepiteNumero(){
         int cant=0;
         for(int f=0;f<vectorN.length;f++){
             if(vectorN[f]==menor){
                 cant = cant + 1;
             }
         }
         if(cant>1){
             System.out.println("\n\nEl elemento se repite en la lista.");
         }else{
             System.out.println("\n\nEl elemento No se repite en la lista.");
         }
     }
     
     
     
     public static void main(String[] args) {
        VectorMenor vm1;
        vm1 = new VectorMenor();
        vm1.CargarElementos();
        vm1.ImprimirElementos();
        vm1.RepiteNumero();
    }
     
} 
