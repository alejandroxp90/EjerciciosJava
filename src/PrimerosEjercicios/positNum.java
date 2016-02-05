package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class positNum {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int no1;
        
        System.out.print("Ingrese un numero por favor:  ");
        no1 = teclado.nextInt();
        
        if(no1<10){
            System.out.println("El numero ingresado tiene un digito... ");
        }else{
            
            if(no1<100) {
            System.out.println("El numero ingresado tiene dos digitos... ");
        }        
    }     
}
}