/*
    En Carrefive, los días martes y jueves hay “PROMO”. En los días
    martes, si el importe total de la compra supera los $13.000 el
    descuento es del 5%, pero si supera los $20.000 es del 7.5%. Los
    jueves, en cambio, el descuento es para todos los tickets cuyo
    importe supere los $25.000 y será el 10% con un tope de reintegro
    de $3.000 por ticket. Escribir un programa que dado el día de la
    semana que se hace la compra y el importe del ticket, verifique si
    aplica hacer el descuento o no. Puede suponer un dato numérico
    para cada día, ejemplo: 1 para el martes y 2 para el jueves.
  */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BonusTrack2_ejercicio_2 {
    final static int topeReIntegro=3000; // si el descuento supera los 3000
    final static int PRIMERIMPORTEMARTES=13000; //martes importe totel por mas de $13000
    final static int SEGUNDOIMPORTEMARTES=20000; // martes segundo importe por mas de $20000
    final static int IMPORTEJUEVES=25000; // jueves unico importe por mas de 25000
    final static int DESCUENTOPRIMERIMPORTEMARTES=5; //descuento del 5
    final static double DESCUENTOSEGUNDOIMPORTEMARTES=7.5; // descuento del 7.5%
    final static int DESCUENTOIMPORTEJUEVES=10; //decuento del 10%
    final static int MAXDIAFINDESEMANA=7; // ultimo dia de la semana
    final  static int MAXINIDELASEMANA=0; // primer dia de la semana
    final static int MAXMARTES=2; // martes segundo dia de la semana pude haber puesto otro numero para reprensentar el martes como el 1
    final static int MAXJUEVES=4; //jueves cuarto dia de la semana  pude haber puesto otro numero para reprensentar el jueves como el 2
 public static void main(String[]args){
   int dia=0;
   double porcentaje=0;
   double importeTotal=0;
     BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
   try {
       System.out.println("ingresar Importe Total");
       importeTotal= Double.valueOf(entrada.readLine());
       System.out.println("ingresar numero del 1 al 7 que representa cada numero del 1 al 7 representa un dia de la semana");
       dia = Integer.valueOf(entrada.readLine());

       if(dia==MAXMARTES){
             if(importeTotal>PRIMERIMPORTEMARTES&&importeTotal<=SEGUNDOIMPORTEMARTES){ //SI EL IMPORTE SUPERA LOS $13000
                 System.out.println("el importe total supera los "+PRIMERIMPORTEMARTES);
                 porcentaje=DESCUENTOPRIMERIMPORTEMARTES/100;
                 System.out.println("se descontaron "+importeTotal*porcentaje+" a importe total "+ importeTotal);
                 importeTotal -= importeTotal*porcentaje;
                 System.out.println("importeTotal Actualizado = "+importeTotal);
             }else{
                 System.out.println("el importe total supera los "+SEGUNDOIMPORTEMARTES);
                 porcentaje=DESCUENTOSEGUNDOIMPORTEMARTES/100;
                 System.out.println("se descontaron "+importeTotal*porcentaje+" a importe total "+ importeTotal);
                 importeTotal -= importeTotal*porcentaje;
                 System.out.println("importeTotal Actualizado = "+importeTotal);
             }
       } else if (dia==MAXJUEVES) {
           if(importeTotal>IMPORTEJUEVES) {
               System.out.println("el importe total supera los " + IMPORTEJUEVES);
               porcentaje = DESCUENTOIMPORTEJUEVES / 100;
               if(!(porcentaje>=topeReIntegro)){
                   System.out.println("se descontaron " + importeTotal*porcentaje + "a importe total " + importeTotal);
                   importeTotal -= importeTotal*porcentaje;
                   System.out.println("importeTotal Actualizado = " + importeTotal);
               }else{
                   System.out.println("el porcentaje de descuento es mayor al tope de reintegro de " +topeReIntegro);
               }
           }else{
               System.out.println("el importe es menor a "+IMPORTEJUEVES);
           }
       } else if (dia>=MAXINIDELASEMANA&&dia<=MAXDIAFINDESEMANA) {
           System.out.println("el dia de la semana no tiene promocion");
       }else{
           System.out.println("el dia de la semana ingresado no es valido");
       }
   }catch(Exception exc){
       System.out.println(exc);
   }
 }
}
