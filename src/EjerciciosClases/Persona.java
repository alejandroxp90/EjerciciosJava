package EjerciciosClases;

import java.util.Scanner;

/*@author Alejandroxp90*/
public class Persona {
    private Scanner teclado;
    private String nombreP;
    private int edadP;
    
    public void Inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombreP = teclado.next();
        System.out.print("Ingrese la edad: ");
        edadP = teclado.nextInt();
    }
 
    
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.Inicializar();
    }
}
