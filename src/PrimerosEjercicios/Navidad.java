package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class Navidad {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, ano;
        
        System.out.print("Ingrese el dia: ");
        dia = teclado.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = teclado.nextInt();
        System.out.print("Ingrese el año: ");
        ano = teclado.nextInt();
        
        if(mes == 12 && dia == 24){
            System.out.println("Este dia es NAVIDAD...");
        }else{
            System.out.println("En esa fecha no es navidad...");
        }
        
    }
    
    }



    

