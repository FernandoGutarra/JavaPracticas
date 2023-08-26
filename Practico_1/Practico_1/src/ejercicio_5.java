/*
5. Escribir un programa que solicite nombre, edad, altura y ocupación, y
los imprima por pantalla.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
5. Escribir un programa que solicite nombre, edad, altura y ocupación, y
        los imprima por pantalla.
*/
public class ejercicio_5 {
    public static void main(String [] args) {
        String nombre;
        int edad;
        double altura;
        String ocupacion;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingresar nombre");
            nombre = entrada.readLine();
            System.out.println("ingresar edad");
            edad = Integer.valueOf(entrada.readLine());
            System.out.println("ingresar altura");
            altura = Double.valueOf(entrada.readLine());
            System.out.println("ingresar ocupacion");
            ocupacion = entrada.readLine();
            System.out.println("el nombre es ="+nombre +" la edad es ="+edad+" la altura es="+altura+" la ocupacion es="+ocupacion );
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
