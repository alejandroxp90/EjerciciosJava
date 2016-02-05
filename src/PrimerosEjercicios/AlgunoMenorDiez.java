package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class AlgunoMenorDiez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int val1, val2, val3;
        
        System.out.print("Ingrese el primer valor: ");
        val1 = teclado.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        val2 = teclado.nextInt();
        System.out.print("Ingrese el tercer valor: ");
        val3 = teclado.nextInt();
        
        if(val1 < 10 || val2 < 10 || val3 < 10){
            System.out.println("\nAlguno de los valores ingresados es menor a DIEZ... ");
            
        }else{
            System.out.println("\nNinguno es menor a DIEZ...");
        }
}
}

