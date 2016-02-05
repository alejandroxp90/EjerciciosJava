package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class while5 {
    public static void main(String[] args) {
        int x = 1, nAlturas;
        float suma = 0, promAlt, alturaReg = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Cuantos registros de alturas desea ingresar: ");
        nAlturas = teclado.nextInt();
        
        while(x <= nAlturas){
            System.out.print("Ingrese la altura: ");
            alturaReg = teclado.nextFloat();
            suma = suma + alturaReg;
            x++;
        }        
        promAlt = suma / nAlturas;   
        
        System.out.print("La suma de las alturas es: ");
        System.out.println(suma);
        System.out.print("El promedio de las alturas es: ");
        System.out.println(promAlt);
    }
}
