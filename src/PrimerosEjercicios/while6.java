package PrimerosEjercicios;

import java.util.Scanner;

/**@author Alejandro_xp90*/
public class while6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 1, nEmpleados, contm = 0, contM = 0;
        float sueldoEmpl, sumaSueldo = 0;
        
        System.out.print("Cuantos empleados tiene en su empresa: ");
        nEmpleados = teclado.nextInt();
        
        while (x <= nEmpleados) {            
            System.out.print("Ingrese el sueldo del empleado: ");
            sueldoEmpl = teclado.nextFloat();
            sumaSueldo = sumaSueldo + sueldoEmpl;
            if(sueldoEmpl >= 100 && sueldoEmpl <= 300){
                contm = contm + 1;
            }else{
                if(sueldoEmpl > 300){
                    contM = contM + 1;
                }
            }
            x++;
        }
        
        System.out.print("Los empleados que cobran entre 100 y 300 pesos son: ");
        System.out.println(contm);
        System.out.print("Los empleados que cobran mas de 500 pesos son: ");
        System.out.println(contM);
        System.out.print("El importe que gasta la empresa en los empleados es: ");
        System.out.print(sumaSueldo);
    }
}
