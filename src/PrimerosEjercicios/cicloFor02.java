package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class cicloFor02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        float nota, contM = 0, contm = 0;
        
        for(x=1; x<=10; x++){
            System.out.print("Ingrese la nota del alumno: ");
            nota = teclado.nextFloat();
            
            if(nota < 7){
                contm = contm + 1;
            }else{
                if(nota>=7){
                    contM = contM + 1;
                }
            }
            
        }
        System.out.print("Las notas con calificaciones mayores a SIETE son: ");
        System.out.println(contM);
        System.out.print("Las notas con calificaciones menores a SIETE son: ");
        System.out.println(contm);
    }
}
