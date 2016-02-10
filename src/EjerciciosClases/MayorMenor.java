package EjerciciosClases;
import java.util.Scanner;

/*@author Alejandro_xp90*/
public class MayorMenor {
    private int num1, num2, num3;
    private Scanner teclado;
    
    public void CargarNum(){
    teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese un numero: ");
        num2 = teclado.nextInt();
        System.out.print("Ingrese un numero: ");
        num3 = teclado.nextInt();
        
        OperarMay(num1,num2,num3); 
        OperarMen(num1,num2,num3);
    }
    
    public int OperarMay(int n1, int n2, int n3){
        int m=0;
        
        if(n1>n2 && n1>n3){
            m = n1;
            System.out.println("\nEl numero mayor es: "+m);
        }else{
            if(n2>n1 && n2>n3){
                m = n2;
                System.out.println("\nEl numero mayor es: "+m);
            }else{
                if(n3>n1 && n3>n2){
                    m = n3;
                    System.out.println("\nEl numero mayor es: "+m);
                }
            }
        }        
        return m;
    }
    
    public int OperarMen(int n1, int n2, int n3){
        int m = 0;
        if(n1<n2 && n1<n3){
            m = n1;
            System.out.println("El numero menor es: "+m);
        }else{
            if(n2<n1 && n2<n3){
                m = n2;
            System.out.println("El numero menor es: "+m);
            }else{
                if(n3<n1 && n3<n2){
                    m = n3;
            System.out.println("El numero menor es: "+m);
                }
            }
        }        
       return m; 
    }
    public static void main(String[] args) {
        MayorMenor maymen1;
        maymen1 = new MayorMenor();
        maymen1.CargarNum();
    }
}
