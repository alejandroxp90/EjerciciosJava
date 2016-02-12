package Vectores;
import java.util.Scanner;

/*@author Alejandro_xp90*/
public class SumaVector {
    private Scanner teclado;
    private int elementos;
    private int[] vector;
    private int contVec = 0, sumaMay36=0, sumaMay50=0;
    
    public void Vector(){
        teclado = new Scanner(System.in);
        vector = new int[8];
        for(int f=0; f<8; f++){
            System.out.print("Ingrese el vector numero "+f+": ");
            vector[f] = teclado.nextInt();
            contVec = contVec + vector[f];
        if(vector[f]>36 && vector[f]<50){
               sumaMay36 = sumaMay36 + vector[f];
            }else{
                if(vector[f]>50){
                    sumaMay50 = sumaMay50 + vector[f]; 
                }
            }
        }  
    }
    
    public void Imprimir(){
        System.out.print("\nEl valor acumulado de los numeros son: "+contVec);
        System.out.println("\nEl valor acumulado de los numeros mayores a 36 son: "+sumaMay36);
        System.out.print("El valor acumulado de los numeros mayores a 50 son: "+sumaMay50+"\n");
        }
    public static void main(String[] args) {
        SumaVector sv1;
        sv1 = new SumaVector();
        sv1.Vector();
        sv1.Imprimir();
    }
}


