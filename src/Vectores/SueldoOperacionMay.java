package Vectores;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class SueldoOperacionMay {
    private Scanner teclado;
    private String[] nombresOp;
    private float[] sueldosOp;
    
    public void CargarDatos(){
        teclado = new Scanner(System.in);
        nombresOp = new String[5];
        sueldosOp = new float[5];
        
        for(int f=0;f<5;f++){
            System.out.print("Ingrese el nombre del Operario numero "+f+": ");
            nombresOp[f] = teclado.next();
            System.out.print("Ingrese el sueldo del operario numero "+f+": ");
            sueldosOp[f] = teclado.nextFloat();
        }       
    }
    
    public void SueldoMayor(){
        float mayor;
        int pos = 0;
        mayor = sueldosOp[0];
        
        for(int f=1; f<nombresOp.length;f++){
            if(sueldosOp[f]>mayor){
                mayor = sueldosOp[f];
                pos = f;
            }
        }
        System.out.print("El empleado con el sueldo mayor es: "+nombresOp[pos]);
        System.out.print(" con un sueldo de: "+mayor+"\n");
    }
    
    public static void main(String[] args) {
        SueldoOperacionMay sOMay;
        sOMay = new SueldoOperacionMay();
        sOMay.CargarDatos();
        sOMay.SueldoMayor();
    }
    
}
