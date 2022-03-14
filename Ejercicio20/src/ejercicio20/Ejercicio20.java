/*
    crear un programa que permita la carga de un vector de 100 elementos
    y luego los muestre en orden descendente
*/
package ejercicio20;

import java.util.Scanner;

public class Ejercicio20
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        int n=5;
        int vector[] = new int[n];
        int aux;
        for(int i=0; i<n; i++)
        {
            System.out.println("ingrese el elemento "+(i+1)+" del vector: ");
            vector[i] = leer.nextInt();
        }
        //funcion de ordenar en forma descendente.
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-1; j++)
            {
                if(vector[i]<vector[i+1])
                {
                    aux=vector[i+1];
                    vector[i+1]=vector[i];
                    vector[i]=aux;
                }
            }
        }
        System.out.println("vector en forma descendente:");
        for(int i=0; i<n; i++)
        {
            System.out.println(vector[i]);
        }
    }

}
