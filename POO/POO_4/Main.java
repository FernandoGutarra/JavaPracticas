package POO_4;
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
            int suma = op.sumar(numero1,numero2);
            int resta = op.restar(numero1,numero2);
            int multiplicar = op.multiplicar(numero1,numero2);
            int dividir = op.dividir(numero1,numero2);
            op.mostrarResultado(suma,resta,multiplicar,dividir);
        }catch(Exception err){
            System.out.println(err);
        }
    }
}

