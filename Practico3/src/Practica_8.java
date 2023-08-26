import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica_8 {
    /*
     8. Realizar un programa que dado dos números enteros y un
     carácter, todos ingresados por el usuario, muestre por pantalla el
     resultado de la operación matemática básica considerando el valor
     del carácter. Si ingreso el carácter: ‘a’ la suma, ‘b’ la resta, ‘c’ la
     multiplicación y ‘d’ la división entre ambos números.
    */
    public static void main(String[]args){
         int numeroEntero1=0;
         int numeroEntero2=0;
         char caracter=' ';
         numeroEntero1=pedirNumero(numeroEntero1);
         numeroEntero2=pedirNumero(numeroEntero2);
         caracter = pedirCaracter(caracter);
         switch (caracter){
             case 'a':
                 System.out.println("suma de los numeros ingresados es ="+ (numeroEntero1+=numeroEntero2));
                 break;
             case 'b':
                 System.out.println("la resta de los numeros ingresamos es ="+(numeroEntero1-=numeroEntero2));
                 break;
             case 'c':
                 System.out.println("la multiplicasion de los numeros ingresados es = "+(numeroEntero1*=numeroEntero2));
                 break;
             case 'd':
                 System.out.println("la division entre ambos numeros ingresados es igual = "+(numeroEntero1/=numeroEntero2));
                 break;
             default:
                 System.out.println("el caracter ingresado no sirve");
                 break;
         }
    }
    public static int pedirNumero(int numero){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingresar numero entero");
            numero= Integer.valueOf(entrada.readLine());
            while(numero==0){
                System.out.println("ingresar numero entero");
                numero= Integer.valueOf(entrada.readLine());
            }
        }catch (Exception exc){
            System.out.println(exc);
        }
        return numero;
    }
    public static char pedirCaracter(char caracter){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingresar caracter");
            caracter = entrada.readLine().charAt(0);
            while(caracter=='0'){
                System.out.println("ingresar caracter");
                caracter = entrada.readLine().charAt(0);
            }
        }catch(Exception exc){
            System.out.println(exc);
        }
        return caracter;
    }
}
