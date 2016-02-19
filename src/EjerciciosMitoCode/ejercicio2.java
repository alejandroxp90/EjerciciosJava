package EjerciciosMitoCode;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class ejercicio2 {
    public static void main(String[] args) {
        String letras;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese las palabras que desea que se muestren: ");
        letras = teclado.next();
        
        System.out.println("Las letras que introduciste fueron: ");
        System.out.println(letras);
    }
}
