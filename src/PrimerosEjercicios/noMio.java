/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerosEjercicios;

import java.util.Scanner;

/**
 *
 * @author Alejandro_xp90
 */
public class noMio {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Ingrese primer valor:");
        num1=teclado.nextInt();
        System.out.print("Ingrese segundo valor:");
        num2=teclado.nextInt();
        System.out.print("Ingrese tercer valor:");
        num3=teclado.nextInt();
        System.out.print("Rango de valores:");
        if (num1<num2 && num1<num3) {
            System.out.print(num1);
        } else {
            if (num2<num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
        System.out.print("-");
        if (num1>num2 && num1>num3) {
            System.out.print(num1);
        } else {
            if (num2>num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
    }
}

