package Vectores;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class SumaVectorLength {
    private Scanner teclado;
    private int[] elementos;
    private int sumaElementos = 0;
    public void CargarElementos(){
        teclado = new Scanner(System.in);
        int nElementos;
        System.out.print("Cuantos elementos desea ingresar: ");
        nElementos = teclado.nextInt();
        
        elementos = new int[nElementos];
        for(int f=0;f<elementos.length;f++){
            System.out.print("Ingrese el elemento: ");
            elementos[f] = teclado.nextInt();
            sumaElementos = sumaElementos + elementos[f];
        }       
    }
    public void ImprimirElementos(){
        System.out.print("La suma de los elementos ingresados es: "+sumaElementos+"\n");
        
    }
    
    public static void main(String[] args) {
        SumaVectorLength svl1;
        svl1 = new SumaVectorLength();
        svl1.CargarElementos();
        svl1.ImprimirElementos();
    }
    
}
