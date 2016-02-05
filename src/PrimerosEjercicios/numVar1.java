package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class numVar1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int no1;
        
        System.out.print("Ingrese un numero: ");
        no1 = teclado.nextInt();
    
        
    if(no1>0){
            System.out.println("El numero que ingreso es POSITIVO... ");            
        }else {
            if(no1 == 0){
            System.out.println("El numero que ingreso es NULO...");               
        } else{
                System.out.println("El numero que ingreso es NEGATIVO");
            }       
    }     
}
}

