
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21
{
  public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        int n=5;
        int posi=0, cont=0;
        boolean band1=false;
        int vector[] = new int[n];
        for(int i=0; i<n; i++)
        {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.println("ingrese un numero para buscar en el vector:");
        int nro = leer.nextInt();
        for(int i=0; i<n; i++)
        {
            if(vector[i]==nro)
            {
                posi=i;
                band1=true;//para indicar que se encontro.
                cont++;
            }
        }
        if(band1=true)
            System.out.println("el numero "+nro+" se encontro en el vector, en la posicion "
            +posi);
        else
            System.out.println("el numero "+nro+" no se encontro en el vector."); 
        if(cont!=0)
            System.out.println("el numero se encontro repetido: "+cont+"veces.");
    }
    
}
