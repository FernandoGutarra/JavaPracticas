/*
8. Escribir un programa que imprima por pantalla la tabla de verdad
        para los operadores lógicos or y and (por separado) para dos
        valores booleanos. Utilizar los operadores para calcular el
        resultado. Por ejemplo, imprimir el siguiente caso para el operador
        or:
        false or true es: true
        y se genera con:
        System.out.println(“ false or true es: ” + (false || true));
*/
public class ejercicio_8 {
     public static void main(String[]args) {
                    boolean v = true;
                    boolean f = false;
          // Tabla de verdad para el operador OR
          System.out.println("Tabla de verdad para OR:");
          System.out.println(v + " OR " + f + " es: " + (v || f));
          System.out.println(f + " OR " + v + " es: " + (f || v));
          System.out.println(v + " OR " + v + " es: " + (v || v));
          System.out.println(f + " OR " + f + " es: " + (f || f));

          // Tabla de verdad para el operador AND
          System.out.println("Tabla de verdad para AND:");
          System.out.println(v + " AND " + f + " es: " + (v && f));
          System.out.println(f + " AND " + v + " es: " + (f && v));
          System.out.println(v + " AND " + v + " es: " + (v && v));
          System.out.println(f + " AND " + f + " es: " + (f && f));
       }
}

