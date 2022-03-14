
package ejercicio18;

import java.util.Scanner;

public class Ejercicio18
{

    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        for(int i=0; i<4; i++)
        {
            System.out.println("");
            System.out.println("ingrese un numero:");
            int nro = leer.nextInt();
            nro = valida(nro, 1, 20);
            System.out.print(nro);
            for(int j=0; j<nro; j++)
                System.out.print("*");
        }
    }
    public static int valida(int dato, int li, int ls)
    {
        Scanner leer = new Scanner(System.in);
        while((dato<li)||(dato>ls))
        {
            System.out.println("valor incorrecto, vuelv a ingresar:");
            dato = leer.nextInt();
        }
        System.out.println("valor correcto.");
        return dato;
    }
}
