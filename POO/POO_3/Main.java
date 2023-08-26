package POO_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args){
           try{
               BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("ingresar dos digitos");
               int numero1 = Integer.parseInt(entrada.readLine());
               int numero2 = Integer.parseInt(entrada.readLine());
               Operacion op = new Operacion();
               op.sumar(numero1,numero2);
               op.restar(numero1,numero2);
               op.multiplicar(numero1,numero2);
               op.dividir(numero1,numero2);
               op.mostrarResultado();
           }catch(Exception err){
               System.out.println(err);
           }
    }
}
