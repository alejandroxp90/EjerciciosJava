package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class cicloFor09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numTr, x, contEqu = 0, contIso = 0, contEsca = 0;
        float lado1, lado2, lado3;
        
        System.out.print("Ingrese cuantos triangulos desea operar: ");
        numTr = teclado.nextInt();
        
        for(x=1;x<=numTr;x++){
            System.out.print("Ingrese el valor del lado UNO: ");
            lado1 = teclado.nextFloat();
            System.out.print("Ingrese el valor del lado DOS: ");
            lado2 = teclado.nextFloat();
            System.out.print("Ingrese el valor del lado TRES: ");
            lado3 = teclado.nextFloat();
            
            if(lado1 == lado2 && lado2 == lado3){
                System.out.print("\nEl triangulo que ingreso es EQUILATERO...\n\n");
                contEqu = contEqu + 1;
            }else{
                if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                    System.out.print("\nEl triangulo que ingreso es ISOSCELES...\n\n"); 
                    contIso = contIso + 1;
                }else{
                    if(lado1!=lado2 && lado2!=lado3){
                        System.out.print("\nEl triangulo que ingreso es ESCALENO...\n\n");
                        contEsca = contEsca + 1;
                    }
                }
            }           
        }
        
        System.out.print("La cantidad de triangulos EQUILATEROS es: ");
        System.out.println(contEqu);
        System.out.print("La cantidad de triangulos ISOSCELES es: ");
        System.out.println(contIso);
        System.out.print("La cantidad de triangulos ESCALENO es: ");
        System.out.println(contEsca);
        
        if(contEqu < contIso && contEqu < contEsca){
            System.out.print("\nEl tipo de triangulo con menos cantidad es: TRIANGULO EQUILATERO\n");            
        }else{
            if(contEsca < contEqu && contEsca < contIso){
                System.out.print("\nEl tipo de triangulo con menos cantidad es: TRIANGULO ESCALENO\n");                
            }else{
                if(contIso < contEqu && contIso < contEsca){
                    System.out.print("\nEl tipo de triangulo con menos cantidad es: TRIANGULO ISOSCELES\n ");                    
                }else{
                    if(contEqu == contEsca && contEqu == contIso){
                        System.out.println("\nSe ingresaron la misma cantidad de triangulos... \n");            
                    }
                }
            }
        }
            
    }
}
