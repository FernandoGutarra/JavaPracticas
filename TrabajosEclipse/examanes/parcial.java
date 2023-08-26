package examanes;
import java.io.BufferedReader; 
import java.io.InputStreamReader;
public class parcial {
	final static int MAX=10;
	final static int CANTIDADMINIMAT=2;
	public static void main(String[] args) {
		char[] arreglo={' ','f','g',' ',' ','p','t','t','t',' '};
		imprimirArreglo(arreglo); // no pedido es solo para ver como está el arreglo
		int secuenciasModificadas=0;
		char vocalIngresada=obtenerVocalMinuscula();
		int inicio=0,fin=0;
		while (inicio<MAX){
			inicio=obtenerInicioSec(arreglo,inicio);
			if (inicio<MAX){
				fin=obtenerFinSec(arreglo,inicio);
				if (secuenciaCandidata(arreglo,inicio,fin)){
					secuenciasModificadas+=insertarVocal(vocalIngresada,arreglo,inicio,fin);
					inicio=fin+2;
				}
				else{
					inicio=fin+1;
				}
			}
		}
		imprimirArreglo(arreglo);// no pedido es solo para ver como quedó el arreglo
		if (secuenciasModificadas>0){
			System.out.println("Las secuencias modificadas fueron: " + secuenciasModificadas);  
		}
		else{
			System.out.println("No se ha modificado ninguna secuencia");
		}
	}
	public static boolean secuenciaCandidata(char[] arreglo, int ini, int fin){
		int cantidadTs=0;
		while (ini<=fin && !esVocal(arreglo[ini]) && cantidadTs<CANTIDADMINIMAT) {
			if (arreglo[ini]=='t'){
				cantidadTs++;
			}
			ini++;
		}
		if ((ini>fin && ini<MAX) || cantidadTs>=CANTIDADMINIMAT){
			return true;
		}
		else{
			return false;
		}
	}
	public static int insertarVocal(char vocal, char[] arreglo, int ini,int fin){
		int pos=obtenerPosOrden(arreglo, ini, fin, vocal);
		if (pos<=fin){
			correrDerecha(arreglo,pos);
			arreglo[pos]=vocal;
			return 1;
		}
		else{
			System.out.println("No se puede insertar en la secuencia que inicia en: "+ ini + " y finaliza en: " + fin + " porque estaría al final");
			return 0;
		}
	}
	public static int obtenerPosOrden(char [] arreglo, int ini, int fin, char vocal){
		while (ini<=fin && arreglo[ini]<vocal){
			ini++;
		}
		return ini;   
	}
	public static void correrDerecha(char[] arreglo, int pos){
		int indice=MAX-1;
		while(indice>pos){
			arreglo[indice]=arreglo[indice-1];
			indice--;
		}
	}
	public static int obtenerInicioSec(char[] arreglo, int inicio){
		while (inicio<MAX && arreglo[inicio]==' '){
			inicio++;
		}
		return inicio;
	}
	public static int obtenerFinSec(char[] arreglo, int inicio){
		while (inicio<MAX && arreglo[inicio]!=' '){
			inicio++;
		}
		return inicio-1;
	}
	public static char obtenerVocalMinuscula(){
		char caracterIngresado=' ';  
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		while (!esVocal(caracterIngresado)){  
			try{
				System.out.println("Ingrese una vocal minuscula:");
				caracterIngresado=entrada.readLine().charAt(0);
			}
			catch(Exception exc){
				System.out.println("No ha ingresado una vocal minuscula");
			}
		}
		return caracterIngresado;
	}
	public static boolean esVocal(char caracter){
		if (caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u'){
			return true;
		}
		else
			return false;
	}
	// metodo no pedido solo es para ver como queda el arreglo
	public static void imprimirArreglo(char[] arreglo) {
		for (int i=0;i<MAX;i++) {
			System.out.print("|" + arreglo[i]);
		}
		System.out.println("|");
	}
}
