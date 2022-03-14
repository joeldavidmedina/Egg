package ejercicio12;

import java.util.Scanner;

public class Ejercicio12
{

    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        /*System.out.println("ingrese nota:");
        int nota = leer.nextInt();*/
        int nota;
        System.out.println("ingrese nota:");
        nota = leer.nextInt();
        while(nota<=0||nota>10)
        {
            System.out.println("nota incorrecta, vuelva a ingresar:");
            nota = leer.nextInt();
        }
        System.out.println("la nota " +nota+ " es correcta.");
    }
}
