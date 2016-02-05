package PrimerosEjercicios;

import java.util.Scanner;

/** @author Alejandro_xp90 */
public class while10 {
    public static void main(String[] args) {
        int x = 1, num, contPar = 0, contImpar = 0, valorNum;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Cuantos valores desea registrar: ");
        num = teclado.nextInt();
        
        while (x <= num) {            
            System.out.print("Ingrese el valor del registro: ");
            valorNum = teclado.nextInt();
            
            if(valorNum%2==0){
                contPar = contPar + 1;
            }else{
                if(valorNum%2==1){
                    contImpar = contImpar + 1;
                }
            }
                       
            x++;
        }
        System.out.print("La cantidad de valores PARES fueron: ");
        System.out.println(contPar);
        System.out.print("La cantidad de valores IMPARES fueron:  ");
        System.out.println(contImpar);
        
    }
}
