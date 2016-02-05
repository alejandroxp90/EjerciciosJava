package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class cicloFor06 {
    public static void main(String[] args) {
        int x, vNum, suma = 0, cont = 0;
        Scanner teclado = new Scanner(System.in);
        for(x=1;x<=10;x++){
            System.out.print("Ingrese el numero: ");
            vNum = teclado.nextInt();
                if(x > 5){
                suma = suma + vNum;
            }
        }
        System.out.print("La suma de los ultimos 5 valores es: ");
        System.out.println(suma);
    }
}
