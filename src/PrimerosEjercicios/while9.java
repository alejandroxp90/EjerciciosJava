package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class while9 {
    public static void main(String[] args) {
        int x = 1, y = 1, list1, list2, contL1 = 0, contL2 = 0;
        Scanner teclado = new Scanner(System.in);
        
        while (x <= 15) {            
            System.out.print("Ingrese los datos de la lista numero UNO: ");
            list1 = teclado.nextInt();
            contL1 = contL1 + list1;
            x++;
            
        }
            while (y <= 15) {                
            System.out.print("Ingrese los datos de la lista numero DOS: ");
            list2 = teclado.nextInt();
            contL2 = contL2 + list2;
            y++;
            
        }
            if(contL1 > contL2){
                System.out.print("Lista UNO mayor");
            }else{
                if(contL2 > contL1){
                    System.out.print("Lista DOS mayor");
                }else{
                    if(contL1 == contL2){
                        System.out.print("Listas iguales");
                    }
                }
            }
        System.out.print("\nLa suma de la lista UNO es: ");
        System.out.println(contL1);
        System.out.print("\nLa suma de la lista DOS es: ");
        System.out.println(contL2);
    }
}
