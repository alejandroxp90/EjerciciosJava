package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandroxp90 */
public class doWhile04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numCuenta;
        float saldoActual=0, sumaAcre=0;        
        do{
            System.out.print("Ingrese el numero de cuenta: ");
            numCuenta = teclado.nextInt();
            if(numCuenta>0){            
            System.out.print("Ingrese el saldo actual de la cuenta: ");
            saldoActual = teclado.nextFloat();
            }
            if(saldoActual>0){
               System.out.print("El numero de cuenta: ");
                System.out.println(numCuenta);
                System.out.println("Es una cuenta de ACREEDOR...");
                sumaAcre = sumaAcre + saldoActual;
            }else{
                if(saldoActual<0){
                System.out.print("El numero de cuenta: ");
                System.out.println(numCuenta);
                System.out.println("Es una cuenta de DEUDOR...");
                }else{
                    if(saldoActual==0){
                System.out.print("El numero de cuenta: ");
                System.out.println(numCuenta);
                System.out.println("Es una cuenta NULA...");
                    }
                }
            }
        }while(numCuenta>0);
        
        System.out.print("La suma total de la cuenta ");
        System.out.println(sumaAcre);
        
    }
}
