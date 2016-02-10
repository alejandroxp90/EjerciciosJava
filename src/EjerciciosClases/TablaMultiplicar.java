package EjerciciosClases;

import java.util.Scanner;

/*@author Alejandro_xp90*/
public class TablaMultiplicar {
 
    public void CargarValores(){
    
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        do{
            System.out.print("\nIngrese un valor: ");
            valor = teclado.nextInt();
        
                 if(valor!=-1){
                Calcular(valor);
            }
        }while(valor!=-1);        
}
    public void Calcular(int v){
        for(int f=v; f<= v * 10; f = f + v){
            System.out.print(f+" - ");
        }
    }
    
    public static void main(String[] args) {
        TablaMultiplicar tabla;
        tabla = new TablaMultiplicar();
        tabla.CargarValores();        
    }    
}
