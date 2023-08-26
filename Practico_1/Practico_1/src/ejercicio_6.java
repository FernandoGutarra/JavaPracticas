/*
6. Escribir un programa que pida se ingresen datos necesarios para
        emitir una factura por la compra de dos artículos de librería (tipo
        factura, número, nombre cliente, producto 1, importe 1, producto 2,
        importe 2, importe total). Como salida debe imprimir por pantalla la
        factura en un formato similar al del siguiente ejemplo:
        Factura C N 249
        Nombre: Juan Perez
        Producto Importe
        Lápiz 15.5
        Papel 20.6
        Importe total 36.1
        */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_6 {
     public static void main(String [] args){
        String nombre;
        String factura;
        String producto1;
        String producto2;
        double importe1;
        double importe2;
        double importe_total;
         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         try {
             System.out.println("ingresar nombre del cliente");
             nombre = entrada.readLine();
             System.out.println("numero de factura");
             factura = entrada.readLine();
             System.out.println("ingresar nombre del producto1");
             producto1 = entrada.readLine();
             System.out.println("ingresar nombre del producto2");
             producto2 = entrada.readLine();
             System.out.println("ingresar importe del producto1");
             importe1= Double.valueOf(entrada.readLine());
             System.out.println("ingresar importe del producto2");
             importe2= Double.valueOf(entrada.readLine());
             importe_total=importe1+importe2;
             System.out.println("Factura "+factura+" Nombre "+nombre+ " Producto importe "+producto1+" "+importe1+" "+producto2+" "+importe2+ " Importe Total " +importe_total);
         }catch (Exception exc){
             System.out.println(exc);
         }
     }
}
