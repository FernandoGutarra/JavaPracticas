import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
*1. Escribir un programa que declare variables para los tipos int, double,
char y boolean, luego asigne un valor, a cada una, correspondiente
al tipo que tiene la variable, e imprima por pantalla cada una de las
variables.
* */
public class ejercicio_1 {
    public static void main(String[]args){
        int entero;
        double decimal;
        char caracter;
        boolean verderoOfalso;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingresa un valor entero");
            entero = Integer.valueOf(entrada.readLine());
            System.out.println("Entero ingresado ="+entero);

            System.out.println("ingresa un decimal"); //
            decimal = Double.valueOf(entrada.readLine());
            System.out.println("Decimal ingresado ="+ decimal);

            System.out.println("ingresa caracter");
            caracter = entrada.readLine().charAt(0);
            System.out.println("Caracter ingresado= "+caracter);

            verderoOfalso=false;
            System.out.println("el valor del boolean es "+ verderoOfalso);

        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}
