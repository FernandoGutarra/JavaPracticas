package POO_2;

import java.net.PortUnreachableException;

public class Main {
    public static void main(String [] args){
       Operacion op = new Operacion();
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultado();
    }
}
