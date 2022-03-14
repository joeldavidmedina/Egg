
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9
{
    
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase no mayor a 8 caracteres:");
        String frase = leer.nextLine();
        if(frase.length()<=8)
            System.out.println("correcto.");
        else
            System.out.println("incorrecto.");
        
    }    
}
