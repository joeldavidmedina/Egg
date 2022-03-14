package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero:");
        int nro = leer.nextInt();
        for(int i=0; i<nro; i++)//primera linea
            System.out.print("*");
        System.out.println("");
        for(int i=0; i<nro-2; i++)//lineas del medio
        {
            for(int j=0; j<nro; j++)
            {
                if((j==0)||(j==nro-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i=0; i<nro; i++)//ultima linea
            System.out.print("*");
        System.out.println("");
    }
    
}
