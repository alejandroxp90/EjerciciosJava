package Vectores;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class CursosAB {
    private Scanner teclado;
    private int[] cursoA;
    private int[] cursoB;
    private float promedioA, promedioB;    
    private int contA = 0, contB = 0;
    
    public void CargaNotas(){
        teclado = new Scanner(System.in);
        cursoA = new int[5];
        cursoB = new int [5];
        for(int f=0; f<5; f++){
            System.out.print("Ingrese las notas de los alumnos del curso A: ");
            cursoA[f] = teclado.nextInt();
            contA = contA + cursoA[f];
        }
        for(int f=0; f<5; f++){
            System.out.print("Ingrese las notas de los alumnos del curso B: ");
            cursoB[f] = teclado.nextInt();
            contB = contB + cursoB[f];
        }
    }
    public void ImprimirProm(){
        promedioA = contA / 5;
        promedioB = contB / 5;
        
        if(promedioA>promedioB){
            System.out.println("\nEl curso que tuvo mayor promedio del Curso A con: "+promedioA);
        }else{
            System.out.println("\nEl curso que tuvo mayor promedio del Curso B con: "+promedioB);
        }
        
    }
    public static void main(String[] args) {
        CursosAB cAB;
        cAB = new CursosAB();
        cAB.CargaNotas();
        cAB.ImprimirProm();
    }
}
