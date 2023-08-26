import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
2. La cadena de supermercados carrefive desea aplicar descuentos
        según el día que se realiza la compra:
        a. Los días martes, si el dia total de la compra supera los
        $13.000 el descuento es del 5%, pero si supera los $20.000
        es del 7.5%.
        b. Los jueves, en cambio, el descuento es para todos los
        tickets cuyo dia supere los $25.000 y será el 10% con
        un tope de reintegro de $3.000 por ticket.
        c. Si es viernes o sábado, si el número de ticket es par y el
importe es a lo sumo de $15.000 se le aplicará un descuento
del 8% si el DNI es par.
Escribir un programa que dado el día, solicite al usuario los

restantes datos para calcular los descuentos en cada caso y lo
aplique sobre el valor final a pagar. Debe informar el importe final
a pagar en cada caso.
*/
public class BonusTrack1_Parte_2 {
    public static void main(String[] args) {
        int dia = 0;
        int importe = 0;
        final int DESCUENTOMIN = 5;
        final double DESCUENTOMAX = 7.5;
        final int MAXMARTES = 20000;
        final int MINMARTES = 13000;

        final int MAXJUEVES = 25000;
        final int TOPEREINTEGRO = 3000;
        final int DESCUENTOJUEVES = 10;

        final int MAXVIERNESSABADO = 15000;
        final int DESCUENTOSABADOSVIERNES = 8;
        int nTicket=0;
        int dni=0;
        final int PAR=2;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("por favor introdusca el dia de su compra por consola si imgrasa 0 sale del programa");
            dia = Integer.valueOf(entrada.readLine());
            while (dia != 0) {
                System.out.println("por favor introdusca el dia de su compra por consola si imgrasa 0 sale del programa");
                dia = Integer.valueOf(entrada.readLine());
                if (dia > 0) {
                    System.out.println("ingresar importe de la compra ");
                    importe = Integer.valueOf(entrada.readLine());
                    switch (dia){
                    case 2:
                        if (importe > MINMARTES) {
                            System.out.println("el importe:" + importe + " del dia martes supera los " + MINMARTES + " se aplica un descuento del" + DESCUENTOMIN + "%");
                            importe -= importe * DESCUENTOMIN / 100;
                            System.out.println("");
                            System.out.println("el importe con el descuento aplicado es de " + importe);

                        } else if (importe > MAXMARTES) {
                            System.out.println("el importe:" + importe + " del dia martes supera los " + MAXMARTES + " se aplica un descuento del" + DESCUENTOMIN + "%");
                            importe -= importe * DESCUENTOMAX / 100;
                            System.out.println("");
                            System.out.println("el importe con el descuento aplicado es de " + importe);
                        } else {
                            System.out.println("no se aplica descuento por que el monto de dinero no supera los " + MINMARTES + "$");
                        }
                    break;
                        case:{

                        if (importe > MAXJUEVES) {
                            if ((importe * DESCUENTOJUEVES / 100) > TOPEREINTEGRO) {
                                System.out.println("el reintegro supera el tope de " + TOPEREINTEGRO + " solo le podemos aplicar el decuento del topo");
                                importe -= TOPEREINTEGRO;
                                System.out.println("");
                                System.out.println("el importe total con el reintegro es de " + importe);

                            } else {
                                System.out.println("el importe:" + importe + " del dia jueves supera los " + MAXJUEVES + "se aplicara un descuento de " + DESCUENTOJUEVES);
                                importe -= importe * DESCUENTOJUEVES / 100;
                                System.out.println("");
                                System.out.println("el importe total con el reintegro es de " + importe);
                            }
                        }
                    } else if (dia == 5 || dia == 6) {
                        System.out.println("ingresar numero de ticket");
                        nTicket = Integer.valueOf(entrada.readLine());
                        System.out.println("por favor ingresar numero de dni");
                        dni = Integer.valueOf(entrada.readLine());
                        if(importe <= MAXVIERNESSABADO && nTicket % PAR== 0 && dni % PAR == 0){
                            System.out.println("el importe:" + importe + " del dia viernes o sabado es a lo sumo " + MAXVIERNESSABADO + "se aplicara un descuento de " + DESCUENTOSABADOSVIERNES);
                            importe-= importe * DESCUENTOSABADOSVIERNES /100;
                            System.out.println("");
                            System.out.println("el importe total con el reintegro es de "+ importe);
                        }else if(nTicket<=0){
                            System.out.println("numero de ticket no valido");
                        } else if (dni<=0) {
                            System.out.println("numero de dni no valido");
                        } else if ( nTicket % PAR!= 0) {
                            System.out.println("el numero del ticket no es par nose a plicara el descuento");
                        } else if (dni % PAR != 0) {
                            System.out.println("el numero del dni no es par nose aplicara el descuento");
                        }
                    }
                }
                } else if (dia == 0) {
                    System.out.println("el programa termina por que el usuario ingreso 0");
                } else {
                    System.out.println("por favor ingrese un dia valido ");
                }

            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
