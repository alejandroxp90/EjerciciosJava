package Vectores;
import java.util.Scanner;

/*@author Alejandro_xp90*/
public class SueldosOperarios {
    private Scanner teclado;
    private int[] Sueldos;
    
    public void CargarSueldos(){
        teclado = new Scanner(System.in);
        Sueldos = new int [5];
        
        for(int f=0; f<5; f++){
            System.out.print("Ingrese un sueldo: ");
            Sueldos[f] = teclado.nextInt();
        }        
    }
    
    public void Imprimir(){
        for(int f=0;f<5;f++){
            System.out.println("El sueldo del operario numero "+ f + " es: " + Sueldos[f] );
        }
    }
    
    public static void main(String[] args) {
        SueldosOperarios sp;
        sp = new SueldosOperarios();
        sp.CargarSueldos();
        sp.Imprimir();
    }
}
