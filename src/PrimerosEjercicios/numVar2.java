package PrimerosEjercicios;

import java.util.Scanner;

/*** @author Alejandro_xp90*/
public class numVar2 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int no1;
        
        System.out.print("Ingrese un numero: ");
        no1 = teclado.nextInt();
    
        
    if(no1>0 && no1<10){
            System.out.println("El numero que ingreso TIENE UNA CIFRA... ");            
        }else {
            if(no1>=10 && no1<100){
            System.out.println("El numero que ingreso TIENE DOS CIFRAS...");               
        } else{
                System.out.println("El numero que ingreso TIENE TRES CIFRAS");
            }       
    }     
}
}