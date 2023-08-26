import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Escribir un programa que mientras que el usuario ingrese un
        carácter dígito o carácter letra minúscula, imprima si es carácter
        dígito o carácter letra minúscula, y si es letra minúscula imprimir si
        es vocal o consonante.
*/
public class ejercicio_9 {
     public static void main(String[]args){
          char caracter=' ';
          char MAXCHAR='z';
          char MINCHAR='a';
          char MAXDIGICHAR='9';
          char MINDIGICHAR='0';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
             System.out.println("ingrese un caracter");
             caracter = entrada.readLine().charAt(0);
             if(caracter>=MINDIGICHAR && caracter<=MAXDIGICHAR){
                 System.out.println("el caracter es un digito " + caracter);
             } else if (caracter>=MINCHAR && caracter<=MAXCHAR) {
                 System.out.println("el caracter ingresado es una letra minuscula");
                 if(caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u'){
                     System.out.println("y aparte el caracter es una vocal minucula ="+caracter);
                 }else {
                     System.out.println("y aparte es consonante " + caracter);
                 }
             }
        }catch(Exception exc){
             System.out.println("");
        }
     }
}
