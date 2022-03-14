package ejercicio5;
import java.util.Scanner;
public class Ejercicio5
{
    public static void main(String[] args)
    {
        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        numero = leer.nextInt();
        System.out.println("El doble de ese numero es: "+producto(numero,2));
        System.out.println("El triple de ese numero es: "+producto(numero,3));
        System.out.println("La raiz cuadrada de ese numero es: "+Math.sqrt(numero));    
    }
    public static int producto(int numero, int dato)
    {
        return (numero*dato);
    }
}
