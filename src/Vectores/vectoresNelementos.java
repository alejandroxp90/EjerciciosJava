package Vectores;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class vectoresNelementos {
    private Scanner teclado;
    private int[] elementos;
    private int nValor;
    
    public void CargarElementos(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero de valores que desee operar: ");
        nValor = teclado.nextInt();
        elementos = new int[nValor];
        for(int f=0;f<elementos.length;f++){
            System.out.print("Ingrese un valor: ");
            elementos[f] = teclado.nextInt();
        }        
    }
    
    public void OrdenarElementos(){
        for(int k=0;k<elementos.length;k++){
            for(int f=0;f<elementos.length-1-k;f++){
                if(elementos[f]>elementos[f+1]){
                    int aux;
                    aux = elementos[f];
                    elementos[f] = elementos[f+1];
                    elementos[f+1] = aux;
                }
            }
        }
    }
    
    public void ImprimirElementos(){
        System.out.println("Los elementos ordenados se muestran a continuacion: ");
        for(int f=0; f<elementos.length;f++){
            System.out.println(elementos[f]);
        }
    }
    
    
    public static void main(String[] args) {
        vectoresNelementos vne1;
        vne1 = new vectoresNelementos();
        vne1.CargarElementos();
        vne1.OrdenarElementos();
        vne1.ImprimirElementos();
    }
}
