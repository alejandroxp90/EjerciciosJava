package EjerciciosClases;
import java.util.Scanner;

/*@author Alejandro_xp90*/
public class Empleado {
    private Scanner teclado;
    private String nombre;
    private float sueldo;
    
    public void Inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = teclado.next();
        System.out.print("Ingrese el sueldo del empleado: ");
        sueldo = teclado.nextFloat();
    }
    
    public void ImprimirDatos(){
        System.out.print("\nEl empleado de nombre "+nombre);
        System.out.print(" con un sueldo de "+sueldo +"\n");
    }
    
    public void PagarImpuestos(){
        if(sueldo>=3000){
            System.out.print("\nEl empleado debe pagar impuestos...\n");
        }else{
            System.out.print("\nEl empleado NO debe pagar impuestos...\n");
        }
    }
    public static void main(String[] args) {
        Empleado empleado1;
        empleado1 = new Empleado();
        empleado1.Inicializar();
        empleado1.ImprimirDatos();
        empleado1.PagarImpuestos();
    }
}
