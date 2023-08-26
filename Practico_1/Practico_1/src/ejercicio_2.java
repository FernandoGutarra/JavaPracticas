
/*
2.
 Escribir un programa que declare una variable de tipo double y una
        constante de tipo double con valor 1.0. Luego, deberá asignar el
        doble del valor de la constante a la variable y mostrar ambos por
        pantalla.
        */
public class ejercicio_2 {
    final static double CONTSDOUBLE=1.0;
     public  static void main( String []args){
         double doubleV=CONTSDOUBLE*2;
         System.out.println(doubleV);
         System.out.println("el doble de la constante es "+ doubleV);
         System.out.println("la constante vale "+ CONTSDOUBLE);
    }
}
