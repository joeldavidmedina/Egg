package poo9;

import java.util.Scanner;
import poo9.entidades.Matematica;
import poo9.servicios.ServicioMatematica;

public class POO9 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {

        ServicioMatematica sm = new ServicioMatematica();
        Matematica m = sm.crearMatematica();
        
        System.out.println("los atributos son: "+m.getNumero1()+" y "+m.getNumero2());
        
        int mayor = sm.devolverMayor(m.getNumero1(), m.getNumero2());
        System.out.println("el mayor de los dos es:"+mayor);
        
        int potencia = sm.calcularPotencia(m.getNumero1(), m.getNumero2());
        System.out.println("la potencia del numero mayor, elevado al numero menor es: "+potencia);
        
        double raiz = sm.calcularRaiz(m.getNumero1(), m.getNumero2());
        System.out.println("la raiz del menor de los numeros es: "+raiz);
    }
}
