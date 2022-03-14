
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numero enteros:");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        if(numero1==numero2)
        {
            System.out.println("Los numeros son iguales.");
        }
        else
        {
            if(numero1>numero2)
            {
                System.out.println("El numero " +numero1+ " es el mayor.");
            }
            else
            {
                System.out.println("El numero " +numero2+ " es el mayor.");
            }
            
        }
    }
    
}
