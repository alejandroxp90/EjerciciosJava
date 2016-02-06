package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class cicloFor08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0, mult, x;
        
        System.out.print("Ingrese la tabla de multiplicar que desee operar: ");
        num = teclado.nextInt();
        
        for(x=1; x<=12; x++){
            mult = num * x;
            System.out.print(num);
            System.out.print(" x ");
            System.out.print(x);
            System.out.print(" = ");
            System.out.println(mult);
        }
    }
}
