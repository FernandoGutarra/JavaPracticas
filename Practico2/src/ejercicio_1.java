import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
1. Escribir un programa completo (declaración de constantes y
        variables, carga de datos, procesamiento e impresión de
        resultados) para cada caso o ítem que:
        a. solicite un número e indique si es positivo o negativo.
        b. solicite un número e imprima “grande” si es mayor a 100 y
        “chico “ si es menor.
        c. solicite un número del 1 al 7 e imprima el día de la semana.
        d. solicite una letra e imprima si es vocal o consonante.
        e. solicite 3 números e imprima “creciente” si los tres números
        están en orden creciente, “decreciente” si están en orden
        decreciente o “error” si no cumplen ningún orden*/
public class ejercicio_1 {
     public static void main(String[] args){
         boolean esPositivo=false;
         final int MAYOR=100;
         final int MAXINGRESO=3;
         int numero2=0;
         int numero3=0;
         int numero=0;
         char letra=' ';
                try {
                    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("ingresame un numero");
                    numero = Integer.valueOf(entrada.readLine());
                         if ( numero > 0) {
                            esPositivo=true;
                         }
                    System.out.println("ingresa un numero");
                    numero = Integer.valueOf(entrada.readLine());
                         if (numero<MAYOR) {
                             System.out.println("el numero ingresado "+numero+" es menor a " + MAYOR);
                         }else{
                             System.out.println("el numero ingresado "+numero+" es mayor a" + MAYOR);
                         }
                    numero = Integer.valueOf(entrada.readLine());
                         switch(numero){
                             case 1:
                                 System.out.println("el numero ingresado es lunes");
                                 break;
                             case 2:
                                 System.out.println("el numero ingresado es martes");
                                 break;
                             case 3:
                                 System.out.println("el numero ingresado es miércoles");
                                 break;
                             case 4:
                                 System.out.println("el numero ingresado es jueves");
                                 break;
                             case 5:
                                 System.out.println("el numero ingresado es viernes");
                                 break;
                             case 6:
                                 System.out.println("el numero ingresado es sabado");
                                 break;
                             case 7:
                                 System.out.println("el numero ingresado es domingo");
                                 break;

                         }
                         letra = entrada.readLine().charAt(0);
                         if(letra=='a'||letra=='e'&&letra=='i'||letra=='o'||letra=='u'){
                             System.out.println("la letra ingresada es vocal");
                         }else{
                             System.out.println("letra ingresada es consonante");
                         }

                            System.out.println("ingresame un numero 1");
                            numero = Integer.valueOf(entrada.readLine());
                            System.out.println("ingresame un numero 2");
                            numero2 = Integer.valueOf(entrada.readLine());
                            System.out.println("ingresame un numero 3");
                            numero3 = Integer.valueOf(entrada.readLine());
                            if(numero<numero2&&numero2<numero3){
                                System.out.println("el orden de los 3 numeros ingresados es cresiente");
                            }else if(numero>numero2&&numero2>numero3){
                                System.out.println("el orden de los 3 numeros ingresados es decresiente");
                            }
                            else{
                                System.out.println("error no tiene ningun orden los numeros ingresados");
                            }
                }
                catch(Exception exc){
                    System.out.println(exc);
                }


     }

}
