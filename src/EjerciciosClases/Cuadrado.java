package EjerciciosClases;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class Cuadrado {
    private Scanner teclado;
    private int lado;
    
    private void Inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado: ");
        lado = teclado.nextInt();
    }
    private void Perimetro(){
        int perimetro = 4 * lado;        
        System.out.print("\nEl perimetro del cuadrado es: "+perimetro);       
    }
    
    private void Superficie(){
        int superficie = lado * lado;
        System.out.println("\nLa superficie del cuadrado es: "+superficie);
    }
    
    public static void main(String[] args) {
        Cuadrado cuadrado1;
        cuadrado1 = new Cuadrado();
        cuadrado1.Inicializar();
        cuadrado1.Perimetro();
        cuadrado1.Superficie();
    }
}
