package PrimerosEjercicios;

import java.util.Scanner;
/**@author Alejandroxp90*/
public class cicloFor11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, valorNum, contValNeg=0, contValPos=0, contValMult15=0, contValorPares=0;
        
        for(x = 1; x <=10; x++){
            System.out.print("Ingrese el valor: ");
            valorNum = teclado.nextInt();
            
            if(valorNum<0){
                contValNeg = contValNeg + 1;
            }else{
                if(valorNum>0){
                    contValPos = contValPos + 1;
                }
            }
            
            if(valorNum%15==0){
                contValMult15 = contValMult15 + 1;
            }
            if(valorNum%2==0){
                contValorPares = contValorPares + valorNum;
            }
        }
        System.out.print("\nLa cantidad de valores NEGATIVOS es: ");
        System.out.println(contValNeg);
        System.out.print("La cantidad de valores POSITIVOS es: ");
        System.out.println(contValPos);
        System.out.print("La cantidad de multiplos de QUINCE es: ");
        System.out.println(contValMult15);
        System.out.print("El valor acumulado de los numeros PARES es: ");
        System.out.println(contValorPares);
    }
    
}
