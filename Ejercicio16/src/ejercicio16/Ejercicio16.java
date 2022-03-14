package ejercicio16;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio16
{

    public static void main(String[] args)
    {
        String cadena;
        int cont1=0, cont2=0;
        Scanner leer = new Scanner(System.in);
        do
        {
            System.out.println("ingrese una cadena de maximo 5 caracteres:");
            cadena = leer.nextLine();
            cadena = toUpperCase(cadena);
            cadena = valida(cadena, 5);
            
            if( (cadena.charAt(0) == 'X') && (cadena.charAt(4) == 'O') )
            {
                cont1++;
                System.out.println("cadena correcta.123");
            }
            else
            {
                if("&&&&&".equals(cadena) == false)
                {
                    cont2++;
                    System.out.println("cadena incorrecta.12");
                }
            }
        }while("&&&&&".equals(cadena)==false);
        System.out.println("la cantidad de cadenas correctas son: "+cont1);
        System.out.println("la cantidad de cadenas incorrectas son: "+cont2);
    }
    
    public static String valida(String cadena, int dato)
    {   
        Scanner leer = new Scanner(System.in);
        while(cadena.length()>5)
        {
            System.out.println("cadena incorrecta, vuelva a ingresar:");
            cadena = leer.nextLine();
            cadena = toUpperCase(cadena);
        }
        return cadena;
    }
}
