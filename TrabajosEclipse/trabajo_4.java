import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trabajo_4 {
	public static void main(String args[]) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		final int DIVISOR = 2;
		final int MIN = 0;
		int numero_positivo = 0;
		int contador = 0;
		for (int i = 1; i <= 10; i++) {
			
			boolean noValido=true;
			while (noValido) {
				try {
					System.out.println("ingrese un numero natural 10 veses " + i);
					numero_positivo = new Integer(entrada.readLine());
					if (numero_positivo > MIN) {
						noValido=false;
					}
					
					{
						
					}

				} catch (Exception err) {
					System.out.println(err);
				}
				if (numero_positivo % DIVISOR == 0) {
					contador++;
				}
			}
		}
		System.out.println("cantidad de numeros pares "+ contador);
	}
}