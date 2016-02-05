package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class DiaMesAno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, ano;
        
        System.out.print("Ingrese el dia: ");
        dia = teclado.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = teclado.nextInt();
        System.out.print("Ingrese el año: ");
        ano = teclado.nextInt();
        
        if(mes > 0 && mes <4){
            System.out.print("Corresponde al primer trimestre del año...");
        }else{
            if(mes > 3 && mes < 7){
                System.out.println("Corresponde al segundo trimestre del año...");
            }else{
                if(mes > 6 && mes < 10){
                System.out.println("Corresponde al tercer trimestre del año...");
            }else{
                if(mes > 9 && mes < 13){
                System.out.println("Corresponde al cuarto trimestre del año...");
                }
        }
        
    }
    
    }
}
}