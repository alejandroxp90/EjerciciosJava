package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandroxp90*/
public class doWhile03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float suma = 0, valorNum;
        do{
            System.out.print("Ingrese un valor o ingrese (9999) para terminar el programa:  ");
            valorNum = teclado.nextFloat();
            if(valorNum!=9999){
               suma = suma + valorNum; 
            }            
        }while(valorNum!=9999);        
        System.out.println("Se ha terminado la carga...");
        System.out.print("El valor acumulado es: ");
        System.out.println(suma);
        if(suma==0){
            System.out.println("La suma total tiene un valor de CERO...");
        }else{
            if(suma>0){
                System.out.println("La suma total tiene un valor mayor a CERO...");
            }else{
                System.out.println("La suma total tiene un valor menor a CERO...");
            }
        }
    }
}
