package Vectores;
import java.util.Scanner;

/*@author Alejandro_xp90*/
public class SueldoEmpleados {
     private Scanner teclado;
     private float sueldoM[];
     private float sueldoT[];
     private float gastosSueldosM = 0;
     private float gastosSueldosT = 0;
     
     public void SueldosManana(){
         teclado = new Scanner(System.in);
         sueldoM = new float[4];
         for(int f=0; f<4; f++){
             System.out.print("Ingrese el sueldo del empleado del Turno Manana numero "+f+": ");
             sueldoM[f] = teclado.nextFloat();
             gastosSueldosM = gastosSueldosM + sueldoM[f];
         }
     }
     
     public void SueldosTarde(){
         teclado = new Scanner(System.in);
         sueldoT= new float[4];
         for(int f=0; f<4; f++){
             System.out.print("Ingrese el sueldo del empleado del Turno Tarde numero "+f+": ");
             sueldoT[f] = teclado.nextFloat();
             gastosSueldosT = gastosSueldosT + sueldoT[f];
         }
     }
     
     public void Imprimir(){
         System.out.print("\nEl gasto de los sueldos del turno Matutino es: "+gastosSueldosM);
         System.out.print("\nEl gasto de los sueldos del turno Matutino es: "+gastosSueldosT);
     }
     
     public static void main(String[] args) {
        SueldoEmpleados sueldoEm;
        sueldoEm = new SueldoEmpleados();
        sueldoEm.SueldosManana();
        sueldoEm.SueldosTarde();
        sueldoEm.Imprimir();
        
    }
}
