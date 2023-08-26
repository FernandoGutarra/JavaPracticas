package POO_2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicasion;
    int division;
    //metodos
    public void leerNumeros() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Digite dos numero");
            numero1 = Integer.parseInt(entrada.readLine());//new Integer crea un int
            numero2 = Integer.parseInt(entrada.readLine());//new Integer crea un int
        }catch(Exception err){
            System.out.println(err);
        }
    }
    public void sumar(){
        suma=numero1+numero2;
    }
    public void restar(){
        resta=numero1-numero2;
    }
    public  void multiplicar(){
        multiplicasion=numero1*numero2;
    }
    public  void dividir(){
        division=numero1/numero2;
    }
    public  void mostrarResultado(){
        System.out.println("la suma es "+suma);
        System.out.println("la resta es "+resta);
        System.out.println("la multiplicasion es "+multiplicasion);
        System.out.println("la division es "+division);
    }
}
