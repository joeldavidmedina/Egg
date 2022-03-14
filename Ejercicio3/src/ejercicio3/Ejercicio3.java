package ejercicio3;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
public class Ejercicio3
{
    public static void main(String[] args)
    {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase:");
        frase = leer.nextLine();
        System.out.println("La frase en mayusculas es: "+mayuscula(frase));
        System.out.println("La frase en mayusculas es: "+minuscula(frase));
    }
    public static String mayuscula(String frase)
    {
        return(toUpperCase(frase));
    }
    public static String minuscula(String frase)
    {
        return(toLowerCase(frase));
    }
}
