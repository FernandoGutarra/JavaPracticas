package practica_luccho;
//solicite un número del 1 al 7 e imprima el día de la semana.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pracitca_2 {
    public static void main(String[] args){
        BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
      
        int pedirnumero=0;
        boolean valido=false;
           while(!valido) {
               try {
                   System.out.println("Ingresar un numero entre 1 y 7");
                   pedirnumero = Integer.valueOf(entrada.readLine());
                   if(pedirnumero>=1 && pedirnumero<=7) {
                       valido=true;
                   }
                  
                   else {
                	   System.out.println("ingresate un numero incorrecto");
                   }
               } catch (Exception exc) {
                   System.out.println(exc);
               }
           }
           System.out.println("El numero que ingresaste es "+pedirnumero);
          switch(pedirnumero) {
           case 1:System.out.println("dia lunes");break;
           case 2:System.out.println("dia martes");break;
           case 3:System.out.println("dia miercoles");break;
           case 4:System.out.println("dia jueves");break;
           case 5:System.out.println("dia viernes");break;
           case 6:System.out.println("dia sabado");break;
           case 7:System.out.println("dia domingo");break;
           default:System.out.println("no es un dia");
           }
    }
    

}