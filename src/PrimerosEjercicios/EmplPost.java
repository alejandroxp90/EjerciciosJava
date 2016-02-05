
package PrimerosEjercicios;

import java.util.Scanner;

/*** @author Alejandro_xp90*/
public class EmplPost {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalPreg, totalCorrectas, promedio;
        
        System.out.print("Ingrese el numero de preguntas que contesto:  ");
        totalPreg = teclado.nextInt();
        System.out.print("Ingrese cuantas preguntas contesto correctamente: ");
        totalCorrectas = teclado.nextInt();
            promedio = totalCorrectas * 100/totalPreg ;
        
        if(promedio>=90){
            System.out.print("Nivel máximo: ");
            System.out.println(promedio);
        }else {
            if(promedio>=75 && promedio<90){
                System.out.print("Nivel medio: ");
                System.out.println(promedio);
            }else{
                if(promedio>=50 && promedio<75){
                    System.out.print("Promedio regular: ");
                    System.out.println(promedio);
                }else{
                    System.out.print("Fuera de nivel: ");
                    System.out.println(promedio);
                }
            }
            
        }        
    }     
}
