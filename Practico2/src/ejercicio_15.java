/*
15.
Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_15 {

    public static void main(String[]args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int TERMINAR=0;
        int entero=0;
        double promedio=0;
        int suma=0;
        int divisor=0;
        int numeroMayor=0;
        int numeroMenor=0;
        boolean noEsValido=false;
        try{
            //while(!noEsValido){
              //  System.out.println("ingrese numero entero");
                //entero= Integer.valueOf(entrada.readLine());
                //if(entero>0){
                  //  suma+=entero;
                    //divisor++;
                    //if(numeroMayor == 0 && numeroMayor == 0){
                      //  numeroMenor=entero;
                        //numeroMayor=entero;
                    //}else if (entero>numeroMayor) {
                      //   numeroMayor=entero;
                    //}else if(entero<numeroMenor){
                      //       numeroMenor=entero;
                    //}
                //} else if (entero == TERMINAR) {
                  //   noEsValido=true;
                    //System.out.println("hola");
                //}
            //}
            System.out.println("ingrese numero entero distinto de 0");
            entero= Integer.valueOf(entrada.readLine());
            suma+=entero;
            divisor++;
            while(entero!=0){
                System.out.println("ingrese numero entero distinto de 0");
                entero= Integer.valueOf(entrada.readLine());
                if(entero>0){
                      suma+=entero;
                      divisor++;
                    if(numeroMayor == 0 && numeroMayor == 0){
                       numeroMenor=entero;
                       numeroMayor=entero;
                    }else if (entero>numeroMayor) {
                      numeroMayor=entero;
                    }else if(entero<numeroMenor){
                           numeroMenor=entero;
                    }
                }
            }

            promedio = suma/divisor;
            System.out.println("promedio total de los numero ingresados "+ promedio);
            System.out.println("numero mayor ingresado :"+ numeroMayor);
            System.out.println("numero menor ingresado :"+ numeroMenor);

        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}
