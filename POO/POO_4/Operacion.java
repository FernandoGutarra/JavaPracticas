package POO_4;

public class Operacion {
        //Atributos
        int suma;
        int resta;
        int multiplicasion;
        int division;
        
        //metodos
        public int sumar(int numero1,int numero2){
            suma=numero1+numero2;
            return suma;
        }
        public int restar(int numero1,int numero2){
            resta=numero1-numero2;
            return resta;
        }
        public  int multiplicar(int numero1,int numero2){
            multiplicasion=numero1*numero2;
            return multiplicasion;
        }
        public  int dividir(int numero1,int numero2){
            division=numero1/numero2;
            return division;
        }
        public  void mostrarResultado(int suma,int resta,int multiplicasion,int division){
            System.out.println("la suma es "+suma);
            System.out.println("la resta es "+resta);
            System.out.println("la multiplicasion es "+multiplicasion);
            System.out.println("la division es "+division);
        }
    }

