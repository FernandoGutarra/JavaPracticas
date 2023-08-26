package Trabajo_4parte3;



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class parte_2 {
	public static void main(String args[]) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	double valor=1;
	double valor2=2;
	double result;
		while(valor!=0){
		try {
		System.out.println("ingresame un numero distinto de cero");
		valor= new Double(entrada.readLine());
		if(valor!=0) {
			System.out.println("ingresa OTRO NUMERO");
			valor=new Double(entrada.readLine());
			System.out.println("ingresa OTRO NUMERO");
			valor2=new Double(entrada.readLine());
			result=valor*valor2;
			System.out.println(result);
			
		}
		}
		catch(Exception err){
			System.out.println(err);
		}
	}
	}
}