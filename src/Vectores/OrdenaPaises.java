package Vectores;
import java.util.Scanner;

/*@author Alejandro_xp90*/
public class OrdenaPaises {
    private Scanner teclado;
    private String[] nombrePais;
    
    public void CargarNombrePais(){
        teclado = new Scanner(System.in);
        nombrePais = new String[5];
        
        for(int f=0;f<nombrePais.length;f++){
            System.out.print("Ingrese el nombre del pais: ");
            nombrePais[f] = teclado.next();
        }        
    }
    public void OrdenarPaises(){
        for(int k=0;k<4;k++){
            for(int f=0;f<4-k;f++){
                if(nombrePais[f].compareTo(nombrePais[f+1])>0){
                    String aux;
                    aux = nombrePais[f];
                    nombrePais[f] = nombrePais[f+1];
                    nombrePais[f+1] = aux;
                }
            }
        }
    } 
    
    public void ImprimirPaises(){
        System.out.println("Los paises se encuentran ordenados alfabeticamente.\n");
        for (String nombrePai : nombrePais) {
            System.out.println(nombrePai);
        }
}
    
    
    public static void main(String[] args) {
        OrdenaPaises op1;
        op1 = new OrdenaPaises();
        op1.CargarNombrePais();
        op1.OrdenarPaises();
        op1.ImprimirPaises();
    }
}
