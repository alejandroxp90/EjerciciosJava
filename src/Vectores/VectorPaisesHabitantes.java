package Vectores;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class VectorPaisesHabitantes {
    private Scanner teclado;
    private String[] nombrePais;
    private int[] cantHabit;
    
    public void CargarPaises(){
        teclado = new Scanner(System.in);
        int cantPais;
        System.out.print("Cuantos registros desea ingresar: ");
        cantPais = teclado.nextInt();
        
        nombrePais = new String[cantPais];
        cantHabit = new int[cantPais];
        
        for(int f=0;f<nombrePais.length;f++){
            System.out.print("\nIngrese el nombre del pais: ");
            nombrePais[f] = teclado.next();
            System.out.print("Ingrese el numero de Habitantes: ");
            cantHabit[f] = teclado.nextInt();
        }        
    }
    
    public void OrdenarPaises(){
        for(int k=0; k<nombrePais.length;k++){
            for(int f=0;f<nombrePais.length-1-k;f++){
                if(nombrePais[f].compareTo(nombrePais[f+1])>0){
                    String auxNomP;
                    auxNomP = nombrePais[f];
                    nombrePais[f] = nombrePais[f+1];
                    nombrePais[f+1] = auxNomP;
                    
                    int auxCantH;
                    auxCantH = cantHabit[f];
                    cantHabit[f] = cantHabit[f+1];
                    cantHabit[f+1] = auxCantH;
                }
            }
        }
    }
    public void OrdenarCantHabi(){
        for(int k=0; k<nombrePais.length;k++){
            for(int f=0;f<nombrePais.length-1-k;f++){
                if(cantHabit[f]<cantHabit[f+1]){
                    String auxNomP;
                    auxNomP = nombrePais[f];
                    nombrePais[f] = nombrePais[f+1];
                    nombrePais[f+1] = auxNomP;
                    
                    int auxCantH;
                    auxCantH = cantHabit[f];
                    cantHabit[f] = cantHabit[f+1];
                    cantHabit[f+1] = auxCantH;
                }
            }
        }
    }
    
    public void Imprimir(){
        System.out.println("Los paises ordenados alfabeticamente son: \n");
        for(int f=0;f<nombrePais.length;f++){
            System.out.println(nombrePais[f]+" - "+cantHabit[f]);
        }
        System.err.println("\n");
        System.out.println("Los paises ordenados por cantidad de habitantes de Mayor a Menor son: \n");
        for(int f=0; f<cantHabit.length;f++){
            System.out.println(cantHabit[f]+" - "+nombrePais[f]);
        }
    }
    
    
    public static void main(String[] args) {
        VectorPaisesHabitantes vph1;
        vph1 = new VectorPaisesHabitantes();
        vph1.CargarPaises();
        vph1.OrdenarPaises();
        vph1.OrdenarCantHabi();
        vph1.Imprimir();
    }
}
