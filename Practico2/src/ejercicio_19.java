import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
19. Construir un programa que solicite desde teclado un número de
        mes válido y posteriormente notifique por pantalla la cantidad de
        días de ese mes. En el caso de que ingrese 2 como número de
        mes (febrero) deberá además solicitar ingresar un número de año
        entre 2000 y 2019 inclusive (no debe seguir si no está en ese
        rango), y dependiendo de si es bisiesto o no imprimir la cantidad
        de días correspondiente.
        */
public class ejercicio_19 {
    public static void main(String[]args){
        final int MAXMES=12;
        final int MINMES=1;
        final int MINANIO=2000;
        final int MAXANIO=2019;
        int mes=0;
        int anio=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      try{
          System.out.println("Ingresar un numero de mes por consola que este entre " + MINMES + " y este entre " + MAXMES);
          mes = Integer.valueOf(entrada.readLine());
          System.out.println("Ingresar un anio por consola");
          anio = Integer.valueOf(entrada.readLine());
          if(mes>=MINMES&&mes<=MAXMES&&anio>0){
              if(mes==2) {
                  if(anio>=MINANIO && anio<=MAXANIO){
                      if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                          System.out.println("El año tiene 29 dias");
                      } else {
                          System.out.println("Febrero tiene 28 dias");
                      }
                  }
              }else if(mes==4&&mes==6&&mes==9&&mes==11){
                  System.out.println("El mes tiene 30 dias");
              } else if (mes==1&&mes==3&&mes==5&&mes==8&&mes==10&&mes==12) {
                  System.out.println("El mes tiene 31 dias");
              }
          }else{
              System.out.println("el numero anio o el mes ingresado no es validos");
          }
      }catch(Exception exc){
          System.out.println(exc);
      }
    }
}
