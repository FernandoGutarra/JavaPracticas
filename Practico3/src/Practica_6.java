import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.FormattableFlags;

public class Practica_6 {
    /*
      6. Escribir un programa que mientras el usuario cargue desde
      teclado un carácter letra minúscula, llame a un método que
      imprime por pantalla la tabla de multiplicar del 9.
    */
    final static int TABLA=9;
    final static int MAX=10;
    public static void main(String[]args){
        char caracter = ' ';
        caracter = pedirCaracter(caracter);
        while(esMinuscula(caracter)){
            tablaDeMultiplicar();
            caracter = pedirCaracter(caracter);
        }
    }

    private static void tablaDeMultiplicar() {
        System.out.println("tabla de mutiplicar del 9");
       for(int i=1;i<=10;i++){
           System.out.println(TABLA+"*"+i+"="+(TABLA*i));
       }
    }
    private static char pedirCaracter(char caracter) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingresame un caracter");
            caracter = entrada.readLine().charAt(0);
        }catch (Exception exc){
            System.out.println(exc);
        }
        return caracter;
    }

    private static boolean esMinuscula(char caracter) {
        if(caracter >= 'a' && caracter <= 'z'){
           return true;
        }
        return false;
    }
}
