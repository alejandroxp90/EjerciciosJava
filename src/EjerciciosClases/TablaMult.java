package EjerciciosClases;

import java.util.Scanner;

/* @author Alejandro_xp90 */
public class TablaMult {
    
    public void Cargar(){
        Scanner teclado = new Scanner(System.in);
        int valor;
             do{    
                System.out.print("Ingrese un numero: ");
                valor = teclado.nextInt(); 
                if(valor!=-1){
                    Ejecutar(valor);
                }
}while(valor!=-1);
    }
    public void Ejecutar(int v){
        int f=1,num;        
        for(f=1;f<=10;f++){
            num = v * f;
            System.out.println(v + " x " + f + " = " + num);
        }        
    }
    public static void main(String[] args) {
        TablaMult tabla1;
        tabla1 = new TablaMult();
        tabla1.Cargar();
    }
}
