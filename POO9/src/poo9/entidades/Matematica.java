package poo9.entidades;

import java.util.Scanner;

public class Matematica {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int numero1;
    private int numero2;

    public Matematica() {
    }

    public Matematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
    
}
