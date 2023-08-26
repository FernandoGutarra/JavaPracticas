/*
14.
Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla.
        */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_14 {
    public static void main(String[]args){
        final int MAXENTEROS=10;
        int numeroEntero=0;
        int contadorPares=0;
        int enterosPositivos=0;
        int PAR=2;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(enterosPositivos<MAXENTEROS){
                System.out.println("ingresame un numero entero");
                numeroEntero = Integer.valueOf(entrada.readLine());
                if(numeroEntero>0){
                    if(numeroEntero%PAR==0){
                         contadorPares++;
                    }
                    enterosPositivos++;
                }
            }
            System.out.println("cantidad de numeros paraes ingresados ="+contadorPares);
        }catch (Exception exc){
            System.out.println(exc);
        }
    }
}
