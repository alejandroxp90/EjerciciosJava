package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class while4 {
    public static void main(String[] args) {
        float x = 1, notas, cont = 0, contm = 0;
        Scanner teclado = new Scanner(System.in);
        
        while(x <= 10){
            System.out.print("Ingrese una nota: ");
            notas = teclado.nextFloat();
            
            if(notas <= 7){               
                cont = cont + 1;         
            }else{
                contm = contm + 1;
            }
              x++;      
            }            
            System.out.print("Las notas con promedio mayor a siete son: ");
            System.out.println(contm);      
            System.out.print("Las notas con promedio menor a siete son: ");
            System.out.println(cont); 
        }           
    }

