package Vectores;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class VectorParalelo {
    private Scanner teclado;
    private String[] nombres;
    private int[] edades;
    
    public void CargaPersonas(){
        teclado = new Scanner(System.in);
        nombres = new String[5];
        edades = new int[5];
        for(int f=0;f<nombres.length;f++){
            System.out.print("Ingrese un nombre: ");
            nombres[f] = teclado.next();
            System.out.print("Ingrese la edad: ");
            edades[f] = teclado.nextInt();      
        }
        }
        public void ImprimirMayEdad(){
        System.out.print("Los nombres de las personas que son mayores de edad son: ");
            for(int f=0;f<nombres.length;f++){
                if(edades[f]>=18){
                    System.out.println("\n"+nombres[f]);
                }
            }
}
        public static void main(String[] args) {
        VectorParalelo vp1;
        vp1 = new VectorParalelo();
        vp1.CargaPersonas();
        vp1.ImprimirMayEdad();
    }        
}
    
    

