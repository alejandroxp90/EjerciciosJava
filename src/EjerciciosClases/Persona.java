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
    
    public void Imprimir(){
        System.out.println("La persona de nombre "+nombreP);
        System.out.print("Tiene una edad de "+edadP+" años");
    }
    
    public void MayorEdad18(){
        if(edadP>=18){
            System.out.println(" y es mayor de edad!!...");
        }else{
            System.out.println(" y es menor de edad!!!...");
        }
    }
    
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.Inicializar();
        persona1.Imprimir();
        persona1.MayorEdad18();
    }
}
