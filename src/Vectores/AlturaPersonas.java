package Vectores;
import java.util.Scanner;

/**@author Alejandro_xp90 */

public class AlturaPersonas {
    private Scanner teclado;
    private float[] altura;
    private float promedio;
    
    public void CargaAlturas(){
        teclado = new Scanner(System.in);
        altura = new float[5];        
        for(int f=0; f<5; f++){
            System.out.print("Ingrese la altura de la persona numero "+f+": ");
            altura[f] = teclado.nextFloat();
        }        
    }
    public void Promedio(){
        float suma = 0;
        for(int f=0; f<5; f++){
        suma = suma + altura[f];       
        }
        promedio = suma/5;
        System.out.print("\nEl promedio de las alturas es "+promedio);
    }
    public void MayorMenor(){
        float contPerAltas = 0, contPerBajas = 0;
        for(int f=0; f<5; f++){
            if(altura[f]<promedio){
                contPerBajas = contPerBajas + 1;
            }else{
                if(altura[f]>promedio){
                    contPerAltas = contPerAltas + 1;
                }
            }
        }
        System.out.print("\nLa cantidad de personas mas altas que el promedio es: "+contPerAltas);
        System.out.print("\nLa cantidad de personas mas bajas que el promedio es: "+ contPerBajas+"\n");
    }
    
    public static void main(String[] args) {
        AlturaPersonas ap1;
        ap1 = new AlturaPersonas();
        ap1.CargaAlturas();
        ap1.Promedio();
        ap1.MayorMenor();
    }
    
}
