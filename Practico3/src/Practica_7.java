import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica_7 {
    /*
        7. Escribir un programa que mientras el usuario cargue desde
        teclado un número entero distinto de 0, imprima por pantalla la
        suma que se obtiene de invocar un método que calcula la
        sumatoria de los primeros 200 números naturales (son números
        enteros entre 1 y 200).
    */
    final static int MAX=200;
    final static int MIN=1;
    public static void main(String[]args){
        int numero = 0;
        int sumatoria=0;
        numero = pedirNumero(numero);
        while(numero!=0){
            sumatoria = sumatoriaNumerosNatu(sumatoria);
            System.out.println("sumatoria de los numeros naturales hasta el "+MAX+"es igual = "+sumatoria);
            numero = pedirNumero(numero);
        }
    }

    private static int sumatoriaNumerosNatu(int sumatoria) {
        int entero=1;
        while(entero<=200){
            sumatoria+=entero;
            entero++;
        }
        return sumatoria;
    }

    private static int pedirNumero(int numero) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingresar numero entero");
            numero = Integer.valueOf(entrada.readLine());
        }catch (Exception exc){
            System.out.println(exc);
        }
        return numero;
    }
}
