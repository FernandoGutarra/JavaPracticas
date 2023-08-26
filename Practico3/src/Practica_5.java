public class Practica_5 {
    /*
    5. Hacer un método que dado un número entero con valor inicial 1,
    haga una iteración incrementando el número de a uno hasta un
    valor MAX = 4 (constante). Mientras itera deberá imprimir el
    número. Luego invocarlo desde el programa
    */
    final static int MAX=4;
    public static void main(String[]args){
        iterarNumeros();
    }
    public static void iterarNumeros(){
      int numeroEntero=1;
      while(numeroEntero<=MAX){
          System.out.println("numero entero ="+numeroEntero);
          numeroEntero++;
      }
    }
}
