
package ejercicio8;
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase:");
        String frase = leer.nextLine();
        if("eureka".equals(frase))
            System.out.println("correcto.");
        else
            System.out.println("incorrecto.");
    }
    
}
