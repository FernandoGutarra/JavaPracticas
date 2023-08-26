/*
* 1. La cadena de supermercados Carrefive debe imprimir el
encabezado del ticket de compra de los clientes con cierto formato
para cumplir las exigencias de la Administración Federal de
Ingresos PRIVADOS. En el mismo, debe figurar la fecha y hora,
número de ticket, CUIT, nombre del cajero, número de caja, dni
del cliente y la leyenda “El precio lo pone el cliente”. Un ejemplo
se muestra a continuación:
—-----------------------------------------------------------------
04/04/23 - 18:55 Ticket Nro. 3455674

CUIT: 99-34567833-9

Cajero: Luis Mercado Caja: 8
DNI: 33.333.333 “El precio lo pone el cliente”
—-----------------------------------------------------------------
Escribir un programa con declaración de constantes y variables
que pida al usuario el ingreso de los datos necesarios para
imprimir el encabezado del ticket.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BonusTrack1_ejercicio_1 {
    public static void main(String[]args){
        int dia =0;
        int mes =0;
        int año =0;
        int hora =0;
        int minutos =0;
        int numeroTicket =0;
        int cuitParte1 =0;
        int cuitParte3 =0;
        String nombreDelCajero =" ";
        String apellidoDelCajero =" ";
        int numeroCaja =0;
        int dni =0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingresar numero del dia");
            dia = Integer.valueOf(entrada.readLine());
            System.out.println("ingresar numero del mes");
            mes =  Integer.valueOf(entrada.readLine());
            System.out.println("ingresar numero del año");
            año = Integer.valueOf(entrada.readLine());
            System.out.println("ingresar hora de compra");
            hora = Integer.valueOf(entrada.readLine());
            System.out.println("ingresar minuto de compra");
            minutos = Integer.valueOf(entrada.readLine());
            System.out.println("ingresar numero de ticket");
            numeroTicket = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese el numero del dni");
            dni = Integer.valueOf(entrada.readLine());
            System.out.println("ingresar cuit primeros 2 digitos");
            cuitParte1 = Integer.valueOf(entrada.readLine());
            System.out.println("ingresar ultimo numero del cuit");
            cuitParte3 = Integer.valueOf(entrada.readLine());
            System.out.println("ingresar nombre del cajero");
            nombreDelCajero = entrada.readLine();
            System.out.println("ingresar nombre del cajero");
            apellidoDelCajero = entrada.readLine();
            System.out.println("numero de caja");
            numeroCaja = Integer.valueOf(entrada.readLine());
            System.out.println(
                           "—-----------------------------------------------------------------\n" +
                            dia+"/"+mes+"/"+año+ " - "+hora+":"+minutos+" Ticket Nro. "+ numeroTicket +"\n" +
                            "CUIT: "+cuitParte1+"."+dni+"."+cuitParte3+"\n" +
                            "Cajero: "+ nombreDelCajero+" "+apellidoDelCajero+" Caja: "+numeroCaja+"\n" +
                            "DNI: "+dni+" El precio lo pone el cliente”\n" +
                                   "—-----------------------------------------------------------------"
            );
        }catch (Exception exc){
            System.out.println(exc);
        }
    }
}
