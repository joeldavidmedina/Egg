
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13
{

    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero limite:");
        int numlim = leer.nextInt();
        int acum = 0;
        do
        {
            System.out.println("ingrese numero:");
            int numero2 = leer.nextInt();
            acum = acum+numero2;
        }while(acum<=numlim);
        System.out.println("ya se ha superado el limite.");
    }
    
}
