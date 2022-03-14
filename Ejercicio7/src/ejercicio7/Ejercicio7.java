
package ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {

    
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero:");
        int numero1 = leer.nextInt();
        if(numero1%2==0)
            System.out.println("el numero es par.");
        else
            System.out.println("el numero es impar.");
    }
    
}
