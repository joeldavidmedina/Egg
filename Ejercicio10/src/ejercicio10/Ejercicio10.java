
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una palabra:");
        String palabra = leer.nextLine();
        if("A".equals(palabra.substring(0,1)))
            System.out.println("correcto.");
        else
            System.out.println("incorrecto.");
        
    }
    
    
    
}
