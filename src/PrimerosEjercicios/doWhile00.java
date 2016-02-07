package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandroxp90*/
public class doWhile00 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, num;
        do{
            System.out.print("Ingrese un numero de 0 a 999 por favor: ");
            num = teclado.nextInt();
            
            if(num>0 && num<10){
                System.out.println("El numero tiene UN DIGITO...");
            }else{
                if(num>=10 && num<100){
                    System.out.println("El numero tiene DOS DIGITOS...");
                }else{
                    if(num>99 && num<1000){
                        System.out.println("El numero tiene TRES DIGITOS...");
                    }
                }
            }
        }while (num!=0);
    }
}
