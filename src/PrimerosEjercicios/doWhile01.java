package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandroxp90*/
public class doWhile01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x,num,contNum=0;
        float suma = 0, promedio;
        do{
            System.out.print("Ingrese un numero o CERO para calcular: ");
            num = teclado.nextInt();
            if(num!=0){
                suma = suma + num;
                contNum = contNum + 1; 
            }
            
        }while (num!=0);   
            if(contNum!=0){
               promedio = suma / contNum;
               System.out.print("El promedio de los numeros ingresados es: ");
               System.out.println(promedio);  
            }else{
                System.out.println("No se han ingresado numeros...");
            }
               
    }
}
