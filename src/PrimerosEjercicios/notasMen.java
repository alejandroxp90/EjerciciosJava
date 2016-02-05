package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class notasMen {
           public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, promedio;
        
        System.out.print("Ingrese la primera nota:  ");
        nota1 = teclado.nextFloat();
        System.out.print("Ingrese la segunda nota: ");
        nota2 = teclado.nextFloat();
        System.out.print("Ingrese la tercera nota: ");
        nota3 = teclado.nextFloat();
        promedio = (nota1 + nota2 + nota3)/3;
        System.out.print("Su promedio es:  ");
        System.out.println(promedio);
        if(promedio<=5){
            System.out.println("REPROBADO... ");
        }else {
            if(promedio>=6 && promedio<7){
            System.out.println("Promocionado... pero con un promedio REGULAR... Estudie. ");
        } else{
                if(promedio>=7){
                    System.out.println("EXCELENTE...");
                }
            }       
    }     
}
}