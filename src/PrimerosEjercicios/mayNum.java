package PrimerosEjercicios;

import java.util.Scanner;

/** @author Alejandro_xp90*/
public class mayNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, promedio;
        
        System.out.print("Ingrese la primera nota:  ");
        nota1 = teclado.nextFloat();
        System.out.print("Ingrese la segunda nota: ");
        nota2 = teclado.nextFloat();
        System.out.print("Ingrese la tercera nota: ");
        nota3 = teclado.nextFloat();
    
        
    if(nota1>nota2 && nota1>nota3){
            System.out.print("El numero mayor es: ");
            System.out.println(nota1);
        }else {
            if(nota2>nota1 && nota2>nota3){
            System.out.print("El numero mayor es: ");
                System.out.println(nota2);
        } else{
                System.out.print("El numero mayor es: ");
                System.out.println(nota3);
            }       
    }     
}
}
