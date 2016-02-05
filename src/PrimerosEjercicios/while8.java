package PrimerosEjercicios;

/**@author Alejandro_xp90*/
public class while8 {
    public static void main(String[] args) {
        int x = 1, mult8 = 8, suma;
        
        while (x <= mult8) {            
           if(mult8 <= 500){               
               System.out.print(mult8);
               System.out.print(" - ");
               mult8 = mult8 + 8;
           } 
           x++;
        }
        
        
    }
}
