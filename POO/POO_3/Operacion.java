package POO_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operacion {
    //Atributos
    int suma;
    int resta;
    int multiplicasion;
    int division;
    //metodos
    public void sumar(int numero1,int numero2){
        suma=numero1+numero2;
    }
    public void restar(int numero1,int numero2){
        resta=numero1-numero2;
    }
    public  void multiplicar(int numero1,int numero2){
        multiplicasion=numero1*numero2;
    }
    public  void dividir(int numero1,int numero2){
        division=numero1/numero2;
    }
    public  void mostrarResultado(){
        System.out.println("la suma es "+suma);
        System.out.println("la resta es "+resta);
        System.out.println("la multiplicasion es "+multiplicasion);
        System.out.println("la division es "+division);
    }
}
