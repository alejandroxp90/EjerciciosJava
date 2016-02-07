package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class cicloFor10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, contPP = 0, contSP = 0, contTP = 0, contCP = 0, numPuntos;
        float coorX, coorY;
        
        System.out.print("Cuantos puntos en el plano desea ingresar: ");
        numPuntos = teclado.nextInt();
        
        for(x=1; x<=numPuntos; x++){
            System.out.print("Ingrese el valor de la coordenada X: ");
            coorX = teclado.nextFloat();
            System.out.print("Ingrese el valor de la coordenada Y: ");
            coorY = teclado.nextFloat();
            
            if(coorX > 0 && coorY > 0){
                contPP = contPP + 1;
            }else{
                if(coorX < 0 && coorY > 0){
                    contSP = contSP + 1;
                }else{
                    if(coorX < 0 && coorY < 0){
                        contTP = contTP + 1;
                    }else{
                        if(coorX > 0 && coorY < 0){
                            contCP = contCP + 1;
                        }
                    }
                }
            }           
        }  
            System.out.print("La cantidad de puntos en el primer cuadrante son: ");
            System.out.println(contPP);
            System.out.print("La cantidad de puntos en el segundo cuadrante son: ");
            System.out.println(contSP);
            System.out.print("La cantidad de puntos en el tercer cuadrante son: ");
            System.out.println(contTP);
            System.out.print("La cantidad de puntos en el cuarto cuadrante son: ");
            System.out.println(contCP);
    }
}
