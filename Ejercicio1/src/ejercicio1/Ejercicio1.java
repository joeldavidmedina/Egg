package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args)
    {
        int nro1, nro2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros:");
        nro1 = leer.nextInt();
        nro2 = leer.nextInt();
        System.out.println("La suma de los numeros es: "+suma(nro1,nro2));
    }
    public static int suma(int nro1, int nro2)
    {
        return (nro1+nro2);
    }
    
}
