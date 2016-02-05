package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class cicloFor03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, valor;
        float mul3 = 0, mult5 = 0;
        
        for (x=1; x<=10; x++){
            System.out.print("Ingrese el numero entero: ");
            valor = teclado.nextInt();
            if((valor%5)==0){
                mult5 = mult5 + 1;
            }else{
                if((valor%3)==0){
                    mul3 = mul3 + 1;
                }
            }
        }
        System.out.print("Los valores multiplos de CINCO son: ");
        System.out.println(mult5);
        System.out.print("Los valores multiplos de TRES son: ");
        System.out.println(mul3);
    }
}
