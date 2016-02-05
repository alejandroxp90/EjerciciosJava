package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class cicloFor04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nValor, num = 0, x, cant = 0;
        
        System.out.print("Cuantos valores desea ingresar: ");
        nValor = teclado.nextInt();
        
        for(x=1;x<=nValor;x++){
            System.out.print("Ingrese un numero: ");
             num = teclado.nextInt();
             if(num>=1000){
             cant = cant + 1;
        }
        }
       
        System.out.print("Los numero MAYORES a MIL son: ");
        System.out.println(cant);
    }
}
