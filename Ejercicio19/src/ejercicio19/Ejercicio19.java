
package ejercicio19;

import java.util.Scanner;

public class Ejercicio19
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros:");
        double euros = leer.nextDouble();
        System.out.println("ingrese moneda a convertir:");
        String moneda = leer.nextLine();
        moneda.toLowerCase();
        moneda = valida(moneda);
        System.out.println(euros+" euros a "+moneda+" son: "+(conversion(euros, moneda)));
    }
    
    public static String valida(String dato)
    {
        Scanner leer = new Scanner(System.in);
        while( "libras".equals(dato)==false && "dolares".equals(dato)==false
                && "yenes".equals(dato)==false )
        {
            System.out.println("valor incorrecto, vuelva a ingresar:");
            dato = leer.nextLine();
            dato.toLowerCase();
        }
        System.out.println("valor correcto.");
        return dato;
    }
    
    public static double conversion(double dato, String dato2)
    {
        double resultado=0;
        switch(dato2)
        {
            case "libras":
                resultado=dato * 0.86 ;
                break;
            case "dolares":
                resultado=dato * 1.28611;
                break;
            case "yenes":
                resultado=dato * 129.852;
            break;
        }
        return resultado;
    }
}
