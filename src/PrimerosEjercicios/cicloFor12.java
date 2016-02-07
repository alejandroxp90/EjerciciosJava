package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandroxp90*/
public class cicloFor12 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int x, valTurMa = 0, valTurTar = 0,valTurNoc = 0;
        float sumaMat = 0, sumaVes = 0, sumaNoc = 0, promMat, promVes, promNoc;
        
        for(x=1;x<=10;x++){
            System.out.print("Ingrese las edades del turno MATUTINO: ");
            valTurMa = teclado.nextInt(); 
            sumaMat = sumaMat + valTurMa;
        }
        for(x=1;x<=12;x++){
            System.out.print("Ingrese las edades del turno VESPERTINO: ");
            valTurTar = teclado.nextInt();
            sumaVes =sumaVes + valTurTar;
        }
        for(x=1;x<=14;x++){
            System.out.print("Ingrese las edades del turno NOCTURNO: ");
            valTurNoc = teclado.nextInt();
            sumaNoc = sumaNoc + valTurNoc;
        }
        
        
        promMat = sumaMat / 10;        
        promVes = sumaVes / 12;        
        promNoc = sumaNoc / 14;
        System.out.print("El promedio del turno MATUTINO es: ");
        System.out.println(promMat);
        System.out.print("El promedio del turno VESPERTINO es: ");
        System.out.println(promVes);
        System.out.print("El promedio del turno NOCTURNO es: ");
        System.out.println(promNoc);
        
        if(promMat>promVes && promMat>promNoc){
            System.out.println("El turno MATUTINO tiene un promedio de edades MAYORES...");
        }else{
            if(promVes>promMat && promVes>promNoc){
                System.out.println("El turno VESPERTINO tiene un promedio de edades MAYORES...");
            }else{
                if(promNoc>promMat && promNoc>promVes){
                    System.out.println("El turno NOCTURNO tiene un promedio de edades MAYORES...");
                }
            }
        }
    }   
}
