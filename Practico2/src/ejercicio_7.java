import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_7 {
    /*7. Escribir un programa que mientras el usuario ingresa un caracter
    distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
    si es carácter vocal minúscula.*/
    public static void main(String[] args) {
      char caracter=' ';
      char DISTINTOCHAR='*';
      char MAXCHAR='z';
      char MINCHAR='a';
      char MAXDIGICHAR='9';
      char MINDIGICHAR='0';
      boolean esValido=false;
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      try{
         while(!esValido){
             System.out.println("ingresar caracter");
             caracter = entrada.readLine().charAt(0);
             if(caracter!=DISTINTOCHAR){
                if(caracter>=MINCHAR&&caracter<=MAXCHAR){
                    if(caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u'){
                      System.out.println("El Caracter Ingresado Es Una Letra Minuscula Vocal= " + caracter);
                       esValido=true;
                    }else {
                        System.out.println("El Caracter No Es Una Vocal");
                    }
                }else if(caracter>=MINDIGICHAR && caracter <= MAXDIGICHAR){
                       System.out.println("El Caracter Ingresado Es Un Digito = " +  caracter);
                       esValido=true;
                }
             }
         }
      }catch(Exception exc){
          System.out.println(exc);
      }
    }
}
