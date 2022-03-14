
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15
{

    public static void main(String[] args)
    {
        int nro1, nro2, opcion;
        char salir=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numero positivos:");
        nro1 = leer.nextInt();
        nro1 = validar(nro1, 0);
        nro2 = leer.nextInt();
        nro2 = validar(nro2, 0);
        do
        {
            System.out.println("Menu:");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opcion:");
            opcion = leer.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("La suma de los numeros es:" +(nro1+nro2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es:" +(nro1-nro2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es:" +(nro1*nro2));
                    break;
                case 4:
                    System.out.println("La division de los numeros es:" +(nro1/nro2));
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa (S/N): ?");
                    salir = leer.next().charAt(0);//Se obtiene el primer carcter del String introducido por teclado.
                    break;
                default:
                    System.out.println("opcion incorrecta.");
                    salir = 'n';
                    break;
            }
        }while(salir == 'n');
    }
    
    public static int validar(int nro, int li)
    {
        while(nro<=li)
        {
            Scanner leer = new Scanner(System.in);
            System.out.println("valor incorrecto, vuelva a ingresar:");
            nro = leer.nextInt();
        }
        System.out.println("valor correcto.");
        return nro;
    }
}
