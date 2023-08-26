package protecto3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class trabajo_3{
	public static void main(String[] args) {
		int numero_entero;
		int numero_semana=0;
		char letra;
		final byte MIN_NUMERO=1;
		final byte MAX_NUMERO=7;
		double numero_real;
		double numero_1;
		double numero_2;
		double numero_3;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
	   try { /*
             System.out.println("ingresar numero entero");
             numero_entero= new Integer(entrada.readLine());
             
             if (numero_entero < 0) {
            	 System.out.println("el numero ingresado es menor");
             }
             else if (numero_entero > 0 ) {
            	 System.out.println("el numero ingresado es positivo");
             }
             else {
            	 System.out.println("esto es un 0 capo");
             }
             System.out.println("ingresa un numero real");
             numero_real= new Double (entrada.readLine());
             if (numero_real > 100) {
            	 System.out.println("esto es un numero grande");
             }
             else if (numero_real < 100) {
            	 System.out.println("esto es un numero chico");
             }
             else {
            	 System.out.println("es igual a 100");
             }
             
           
             while(!(numero_semana >= MIN_NUMERO && numero_semana<=MAX_NUMERO)) {
             System.out.println("ingrese un numero del 1 al 7");
             numero_semana= new Integer (entrada.readLine());
             switch(numero_semana){
             case 1:System.out.println("Lunes");break;
             case 2:System.out.println("Martes");break;
             case 3:System.out.println("Miercoles");break;
             case 4:System.out.println("jueves");break;
             case 5:System.out.println("viernes");break;
             case 6:System.out.println("sabado");break;
             case 7:System.out.println("domingo");break;
             }
             }
             System.out.println("ingresa una letra");
             letra= letra=(char) (entrada.readLine().charAt(0));
             switch(letra) {
             case 'a': case 'e':case 'i':case 'o':case 'u': case 'A': case 'E':case 'I':case 'O':case 'U': System.out.println("es una vocal"); break;
             default:System.out.println("Es una consonante"); 
             }*/
             System.out.println("ingresa un numero real");
             numero_1 = new Double (entrada.readLine());
             System.out.println("ingresa segundo numero real");
             numero_2 = new Double (entrada.readLine());
             System.out.println("ingresa ingresa un tercer numero real");
             numero_3 = new Double (entrada.readLine());
             if(numero_1<numero_2 && numero_2<numero_3) {
            	 System.out.println("orden creciente ");
             }
             else if(numero_1>numero_2 && numero_2>numero_3){
            	 System.out.println("orden decreciente");
           
            	 
             }
             else {
            	 System.out.println("sistem 32");
             }
             
        }
	    catch(Exception exc){
	    	System.out.println(exc);
	    	
	    }
	  
    }
}