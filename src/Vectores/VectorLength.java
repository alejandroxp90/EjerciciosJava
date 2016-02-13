package Vectores;
import java.util.Scanner;

/*@author Alejandro_xp90*/
public class VectorLength {
    private Scanner teclado;
    private int[] sueldos;
    
    public void CargarSueldos(){
        teclado = new Scanner(System.in);
        int cant;
        
        System.out.print("Cuantos sueldos desea ingresar: ");
        cant = teclado.nextInt();
        sueldos = new int[cant];
        for(int f=0;f<cant;f++){
            System.out.print("Ingrese el Sueldo: ");
            sueldos[f] = teclado.nextInt();
        }       
    }

    public void Imprimir(){
        System.out.print("\nLos sueldos que se ingresaron son: \n");
        for(int f=0;f<sueldos.length;f++){
            System.out.print("\n"+sueldos[f]);
        }
    }
    public static void main(String[] args) {
        VectorLength vl1;
        vl1 = new VectorLength();
        vl1.CargarSueldos();
        vl1.Imprimir();
    }
}
