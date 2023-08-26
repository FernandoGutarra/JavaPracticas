/*
3. Viendo el éxito de las promociones implementadas por la
competencia, el supermercado Soberano decidió aplicar la misma
idea. En Soberano, hay un descuento del 8% si se cumplen las
siguientes condiciones: es viernes o sábado, el número de ticket
es par, el importe es a lo sumo de $15.000 y el DNI del cliente
termina en un número impar. Escribir un programa que dado el
día, el número de ticket, el importe y el DNI verifique si debe
aplicar el descuento o no. Puede suponer un dato numérico para
el día como en el inciso anterior.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BonusTrack3_ejercicio_3 {
    final static int PAR=2;
    final static int VIERNES=5;
    final static int SABADO=6;
    final static int IMPORTEMAX=15000;
     public static void main (String [] args){
         int dia=0;
         int numeroTicket=0;
         double importe=0;
         int dni=0;
         int ultimoDigitoDni=0;
         boolean esValido;
         BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
         try{
             System.out.println("ingresame el dia tomando en cuenta que los dias son 7 elegi un numero que represente a tu dia");
             dia = Integer.valueOf(input.readLine());
             System.out.println("ingresame el numero de ticket");
             numeroTicket =  Integer.valueOf(input.readLine());
             System.out.println("ingresar importe total");
             importe = Double.valueOf(input.readLine());
             System.out.println("ingresar DNI del cliente");
             dni = Integer.valueOf(input.readLine());
             ultimoDigitoDni=dni%10;
             System.out.println("ultimo digito del dni es igual = "+ultimoDigitoDni);
             esValido=dia==VIERNES||dia==SABADO&&numeroTicket%PAR==0&&importe<=IMPORTEMAX&&ultimoDigitoDni%PAR!=0;
             System.out.println("el descuento se aplica? true se aplica false no se aplica :"+esValido);
         }catch(Exception exc){
             System.out.println("ingresate algun dato invalido "+ exc);
         }
     }
}
