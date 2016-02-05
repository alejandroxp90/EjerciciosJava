package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class while1 {
    public static void main(String[] args) {
        int x = 1,num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Hasta que numero desea imprimir: ");
        num = teclado.nextInt();
        while(x <= num){
            System.out.println(x);
            x++;
        }
        
    }
}
