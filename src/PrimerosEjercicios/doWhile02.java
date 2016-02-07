package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandroxp90*/
public class doWhile02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contMay = 0, contMen = 0, contEntre = 0, contaGral;
        float valorPeso;
        
        do{
            System.out.print("Ingrese el peso en Kilogramos de la Pieza: ");
            valorPeso = teclado.nextFloat();
            if(valorPeso!=0){
                if(valorPeso>=9.8 && valorPeso<=10.2){
                contEntre = contEntre + 1;
            }else{
                if(valorPeso>10.2){
                    contMay = contMay + 1;
                }else{
                    contMen = contMen + 1;
                }
            }
            }           
        }while (valorPeso!=0);
        contaGral = contEntre + contMay + contMen;
        System.out.print("\nLa cantidad de piezas entre 9.8 y 10.2 es: ");
        System.out.println(contEntre);
        System.out.print("La cantidad de piezas menor 9.8 a es: ");
        System.out.println(contMen);
        System.out.print("La cantidad de piezas mayor a 10.2 es: ");
        System.out.println(contMay);
        System.out.print("\nLa cantidad de piezas totales procesadas es: ");
        System.out.println(contaGral);        
    }
}
