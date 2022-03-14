
package ejercicio22;

import java.util.Scanner;

public class Ejercicio22
{
    
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int [4][4];
        
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
                matriz[i][j] = (int)(Math.random()*10);
        }
        
    }
    
}
