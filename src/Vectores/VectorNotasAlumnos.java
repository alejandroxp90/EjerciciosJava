package Vectores;
import java.util.Scanner;

/*@author Alejandro_xp90*/
public class VectorNotasAlumnos {
    private Scanner teclado;
    private String[] nombreAl;
    private int[] califAl; 
    
    public void CargarAlumno(){
        teclado = new Scanner(System.in);
        int cantA;
        System.out.print("Cuantos alumnos desea ingresar: ");
        cantA = teclado.nextInt();
        
        nombreAl = new String[cantA];
        califAl = new int[cantA];
        
        for(int f = 0; f < nombreAl.length; f++){
            System.out.print("\nIngrese el nombre del alumno: ");
            nombreAl[f] = teclado.next();
            System.out.print("Ingrese la calificacion del alumno: ");
            califAl[f] = teclado.nextInt();
        }        
    }
    
    public void OrdenarCalificaciones(){
        for(int k=0;k<califAl.length;k++){
            for(int f=0;f<califAl.length-1-k;f++){
                if(califAl[f]<califAl[f+1]){
                    int auxCalA;
                    auxCalA = califAl[f];
                    califAl[f] = califAl[f+1];
                    califAl[f+1] = auxCalA;
                    
                    String auxNomA;
                    auxNomA = nombreAl[f];
                    nombreAl[f] = nombreAl[f+1];
                    nombreAl[f+1] = auxNomA;                    
                }
            }
        }
    }
    
    public void ImprimirAlumnos(){
        System.out.println("\nLos Alumnos y Calificaciones se muestran a continuacion: \n");
        for(int f=0;f<califAl.length;f++){
            System.out.println("El alumno: "+nombreAl[f]+" tiene una calificacion de "+califAl[f]);
        }
    }   
    
    public static void main(String[] args) {
        VectorNotasAlumnos vnA1;
        vnA1 = new VectorNotasAlumnos();
        vnA1.CargarAlumno();
        vnA1.OrdenarCalificaciones();
        vnA1.ImprimirAlumnos();
    }
}
