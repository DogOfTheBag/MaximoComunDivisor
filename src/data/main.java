package data;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
      Operador MCD; 
     do{ 
       System.out.println("Introduce el primer numero");
       int num1 =sc.nextInt();
       
       System.out.println("Introduce el segundo numero");
       int num2 =sc.nextInt();
       
       MCD = new Operador (num1,num2);
      }while(MCD.comprobarNumeros()==false);
     
      MCD.cambiarOrden();
                    
        System.out.println("El Maximo comun divisor entre "+ MCD.getNum1() + " y " + MCD.getNum2() + " es: " + MCD.sacarResultado());
    }
    
    
    
}
