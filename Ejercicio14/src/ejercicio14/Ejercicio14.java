package ejercicio14;

import java.util.Scanner;

public class Ejercicio14
{


    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        int i=0, num, acum=0;
        do{
            System.out.println("ingrese un numero:");
            num = leer.nextInt();
            if(num>0)
                acum=acum+num;
            i++;
        }while((i<5)&&(num!=0));
        if(num==0)
            System.out.println("se capturo el numero cero.");
        else
            System.out.println("la suma de los numeros leidos es:"+acum);
    }
    
}
