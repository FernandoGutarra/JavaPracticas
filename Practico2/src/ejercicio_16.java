import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
16.
Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
‘a’ seguidas que se ingresaron.*/
public class ejercicio_16 {
   public static void main(String[]args){
       char caracter=' ';
       char A='a';
       int cantidadDeA=0;
       int mayorASeguidas=0;
       int MAX=15;
       BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
       try{
           for(int i=0;i<MAX;i++){
             System.out.println("ingresar un caracte por consola");
             caracter = entrada.readLine().charAt(0);
             if(caracter==A){
                    cantidadDeA++;
                    if(cantidadDeA>mayorASeguidas){
                        mayorASeguidas=cantidadDeA;
                    }
             }else{
                 cantidadDeA=0;
             }
           }
           System.out.println("cantidad de mayor de a ingresadas " + mayorASeguidas);

       }catch(Exception exc){
           System.out.println(exc);
       }
   }

}
