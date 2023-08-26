import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_7 {
    /*
    7. Escribir un programa que dado tres números reales ingresados
    por el usuario, divida el primero por el segundo y al resultado
    obtenido le reste el tercero. Muestre por pantalla el resultado
    obtenido. Puede o no usar variables auxiliares para los cálculos.
   Tenga en cuenta posibles errores en las operaciones.
*/
    public static void main(String [] args){
       double numeroReal1;
       double numeroReal2;
       double numeroReal3;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingresar numero real 1");
            numeroReal1= Double.valueOf(entrada.readLine());
            System.out.println("ingresar numero real 2");
            numeroReal2=Double.valueOf(entrada.readLine());
            System.out.println("ingresar numero real 3");
            numeroReal3=Double.valueOf(entrada.readLine());
            System.out.println("numero real 1 dividido numero real 2");
            System.out.println(numeroReal1/=numeroReal2);
            System.out.println("numero real 1 - numero real 3");
            System.out.println(numeroReal1-=numeroReal3);
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}
