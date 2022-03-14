package poo10;

import java.util.Arrays;
import java.util.Scanner;

public class POO10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        double vector1[] = new double [50];
        double vector2[] = new double [20];

        for(int i=0; i<50;i++)
            vector1[i] = Math.random();

        System.out.println("el vector 1 es:\n"+Arrays.toString(vector1));
        
        Arrays.sort(vector1, 0, 50);//sort ordena de manera ascendente.
        System.out.println("el vector1 ordenado de manera ascendente es:\n"+Arrays.toString(vector1));
        
        vector2 = Arrays.copyOfRange(vector1, 0, 20);//copia en el vector2 desde la posicion 0 inclusive hasta la 20 no inclusive del vector 1.
                                                    //lo que copio de mas, lo piso en la linea siguiente.
        Arrays.fill(vector2, 10, 20, 0.5);//carga el vector con 0.5 desde la posicion 10 inclusive hasta la 20 no inclusive. osea de 10-19
        
        System.out.println("\nel vector 1 final es:"+Arrays.toString(vector1));
        System.out.println("\nel vector 2 final es:"+Arrays.toString(vector2));
        
    }
}
