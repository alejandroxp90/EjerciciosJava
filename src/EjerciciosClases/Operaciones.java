package EjerciciosClases;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class Operaciones {
    private Scanner teclado;
    private int valor1, valor2;   
    
    public void Iniciar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        valor1 = teclado.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        valor2 = teclado.nextInt();
        }

    public void Suma(){
        int suma = valor1 + valor2;
        System.out.print("\nLa suma de los dos valores ingresados es "+suma);
    }
    
    public void Resta(){
        int resta = valor1 - valor2;
        System.out.print("\nLa resta de los dos valores ingresados es "+resta+"\n");
    }
    
    public void Multi(){
        int multi = valor1 * valor2;
        System.out.print("La multiplicacion de los dos valores ingresados es "+multi+"\n");
    }
    
    public void Divi(){
        int division = valor1 / valor2;
        System.out.print("La division de los dos valores ingresados es "+division+"\n\n");
    }
    
    public static void main(String[] args) {
        Operaciones operaciones1;
        operaciones1 = new Operaciones();
        operaciones1.Iniciar();
        operaciones1.Suma();
        operaciones1.Resta();
        operaciones1.Multi();
        operaciones1.Divi();
    }    
}
