package ejercicio4;

import java.util.Scanner;

public class Ejercicio4
{
    public static void main(String[] args)
    {
        int celsius;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en celsius:");
        celsius = leer.nextInt();
        System.out.println("La temperatura en fanreheit es: "+conversion(celsius));
    }
    public static int conversion(int celsius)
    {
        return(32+((9*celsius)/5));
    }
}
