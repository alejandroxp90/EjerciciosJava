package Vectores;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class Ejemplo00 {
    private Scanner teclado;
    private int[] sueldo;
    
    public void CargarSueldos(){
        teclado = new Scanner(System.in);
        sueldo = new int[5];
        
        for(int f=0;f<sueldo.length;f++){
            System.out.print("Ingrese el sueldo: ");
            sueldo[f] = teclado.nextInt();
        }        
    }
    
    public void OrdenarSueldo(){
    for(int k=0;k<4;k++){
        for(int f=0;f<4-k;f++){
            if(sueldo[f]<sueldo[f+1]){
                int aux;
                aux = sueldo[f];
                sueldo[f] = sueldo[f+1];
                sueldo[f+1] = aux;
            }
        }
    }
}
    
    public void ImprimirSueldo(){
        System.out.println("Los sueldos ordenados son: \n");
        for(int f=0;f<sueldo.length;f++){
            System.out.println(sueldo[f]);
        }
    }
    
    public static void main(String[] args) {
        Ejemplo00 ej1;
        ej1 = new Ejemplo00();
        ej1.CargarSueldos();
        ej1.OrdenarSueldo();
        ej1.ImprimirSueldo();
    }
    
}
