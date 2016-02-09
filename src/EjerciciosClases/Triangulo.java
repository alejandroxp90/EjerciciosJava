package EjerciciosClases;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class Triangulo {
    private Scanner teclado;
    private int lado1, lado2, lado3;

    private void Inicializador(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado UNO: ");
        lado1 = teclado.nextInt();
        System.out.print("Ingrese el valor del lado DOS: ");
        lado2 = teclado.nextInt();
        System.out.print("Ingrese el valor del lado TRES: ");
        lado3 = teclado.nextInt();
    }
    private void ladoMayor(){
        if(lado1>lado2 && lado1>lado3){
            System.out.println("\nEl lado mayor del triangulo es: "+lado1);
        }else{
            if(lado2>lado1 && lado2>lado3){
                System.out.println("\nEl lado mayor del triangulo es: "+lado2);
            }else{
                System.out.println("\nEl lado mayor del triangulo es: "+lado3);
            }
        }
    }
    private void trianguloEquilatero(){
        if(lado1==lado2 && lado2==lado3){
            System.out.println("\nEl triangulo es equilatero...");
        }else{
            System.out.println("\nEl triangulo no es equilatero... ");
        }
        
    }
    
    public static void main(String[] args) {
        Triangulo triangulo1;
        triangulo1 = new Triangulo();
        triangulo1.Inicializador();
        triangulo1.ladoMayor();
        triangulo1.trianguloEquilatero();
    }
}