package PrimerosEjercicios;

import java.util.Scanner;

/*** @author Alejandro_xp90*/
public class SueldoOperario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float horasTrabajadas;
        float ctoHora;
        float totalSueldo;
        
        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = teclado.nextFloat();
        System.out.print("Ingrese el costo de la hora: ");
        ctoHora = teclado.nextFloat();
        totalSueldo = horasTrabajadas * ctoHora;
        System.out.print("\n\nEl total del sueldo percibido es: ");     
        System.out.println(totalSueldo);
    }     
}
