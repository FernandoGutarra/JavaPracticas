package examanes;
//Se tiene una matriz de MAXFILxMAXCOL de enteros que tiene secuencias separadas por -1. 
//Por otro lado se tienen dos arreglos uno llamado RESULTADO de tamaño máximo MAXFILxMAXCOL 
//y otro de tamaño MAXCOL que se llama PATRON
//Se pide buscar el PATRON que tiene el arreglo en la matriz y
//por cada coincidencia se debe agregar en el arreglo RESULTADO, a partir de la 
//segunda posición, la fila y el inicio de donde se encontró en la matriz y por cada vez 
//que se encuentra, separar con -1 y poner a continuación los nuevos valores. 
//La primera posición del arreglo RESULTADO está reservada para la cantidad de veces que se encontró la 
//secuencia patrón en la matriz.
//Luego pedir al usuario un número N y se debe invertir 
//la secuencia N de la matriz y se debe actualizar el arreglo 
//RESULTADO para eliminar los datos si esa fuera una secuencia igual al PATRON. 
//Además, actualizar el contador de secuencias que cumplen.
import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class final_regular_2{
  final static int MAXFIL = 2;
  final static int MAXCOL = 10;
  public static void main(String[] args) {
      int[][]matriz= {
    		  {-1,2,4,6,8,8,-1,6,4,-1},
    		  {-1,2,4,8,8,-1,6,4,-1,-1},
      };
      int [] patron = {-1,-1,6,4,-1,-1,-1,-1,-1,-1};
      int [] resultado= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
      imprimrMatriz(matriz);
      System.out.println("");
      imprimirArr(patron);
      System.out.println("");
      System.out.println("");
      imprimirArr(resultado);
      System.out.println("");
      int posIniPatron=1;
      int posIniReservada=0;
      int cantidadSecu=0;
	  for(int fila=0;fila<MAXFIL;fila++) {
		  int ini=0;
	  int fin=0;
		  while(ini<MAXCOL) {
			  ini=buscarIni(matriz[fila],ini);
			  if(ini<MAXCOL) {
				  fin=buscarFin(matriz[fila],ini);
				  int tamanioSecu=fin-ini+1;
				  if(buscarSecuIgualPatron(matriz[fila],ini,fin,patron,tamanioSecu)) {
					  int filaPatron=fila;
					  int iniPatron=ini;
					  int separador=-1;
					  if(posIniPatron<MAXCOL) {
					     aniadirResultado(resultado,ini,fila,separador,posIniPatron);
					     posIniPatron+=3;
					     cantidadSecu++;
					     
					  }
				  }
				  ini=fin+1;
			  }
		  }
	  }
	 if(cantidadSecu>0) {
		resultado[posIniReservada]=cantidadSecu;
	 }
	 System.out.println("");
	 imprimrMatriz(matriz);
     System.out.println("");
     imprimirArr(patron);
     System.out.println("");
     System.out.println("");
     imprimirArr(resultado);
     System.out.println("");
     int numeroN=pedirNumero();
	 buscarSecuNYEliminarActualizarResul(resultado,numeroN,matriz,cantidadSecu,posIniReservada);
	 System.out.println("");
	 imprimrMatriz(matriz);
     System.out.println("");
     imprimirArr(patron);
     System.out.println("");
     System.out.println("");
     imprimirArr(resultado);
     System.out.println("");
  }
public static void buscarSecuNYEliminarActualizarResul(int[] resultado, int numeroN,int[][]mat,int cantidadSecu,int posIniReservada) {
	int ini=1;
	int fin=0;
	int SecuNumero=0;
	int filaSecu=0;
	int iniSecu=0;
	int finSecu=0;
	while(ini<MAXCOL) {
		ini=buscarIni(resultado,ini);
		if(ini<MAXCOL) {
			fin=buscarFin(resultado,ini);
			SecuNumero++;
			int tamanioSecu=fin-ini+1;
			if(SecuNumero==numeroN) {
				filaSecu=resultado[fin];
				iniSecu=resultado[ini];
				finSecu=buscarFin(mat[filaSecu],iniSecu);
				invertirSecu(mat[filaSecu],iniSecu,finSecu);
				for(int i=0;i<tamanioSecu;i++) {
				   corrimientoIzq(resultado,ini);
				}
				cantidadSecu--;
				resultado[posIniReservada]=cantidadSecu;
			}
			ini=fin+1;
		}
	}
}
public static void invertirSecu(int[] arr, int iniSecu, int finSecu) {
	int temp=0;
	while(iniSecu<finSecu) {
		temp=arr[iniSecu];
		arr[iniSecu]=arr[finSecu];
		arr[finSecu]=temp;
		iniSecu++;
		finSecu--;
	}
}
public static void corrimientoIzq(int[] arr, int ini) {
	while(ini<MAXCOL-1) {
  		arr[ini]=arr[ini+1];
  		ini++;
  	}
  arr[ini]=-1;
}
public static void aniadirResultado(int[] resultado, int iniSecu, int filaSecu,int separador,int posIniPatron) {
		corrimientoDer(resultado,posIniPatron,iniSecu);
		posIniPatron++;
		corrimientoDer(resultado,posIniPatron,filaSecu);
		posIniPatron++;
		corrimientoDer(resultado,posIniPatron,separador);
}
public static void corrimientoDer(int[] resultado, int pos, int insertar) {
	int index=MAXCOL-1;
	while(pos<index) {
		resultado[index]=resultado[index-1];
		index--;
	}
	resultado[pos]=insertar;
}
public static int pedirNumero() {
	int numero=0;
	boolean esValido=false;
	while(!esValido) {
		try {
			System.out.println("ingresar Numero Entero");
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			numero= new Integer(entrada.readLine());
			if(numero>0) {
				esValido=true;
			}
		}catch(Exception err) {
			System.out.println(err);
		}
	}
	return numero;
}
public static boolean buscarSecuIgualPatron(int[] arr, int iniSecu, int finSecu, int[] patron,int tamanioSecu) {
	int ini=0;
	int fin=0;
	while(ini<MAXCOL) {
		ini=buscarIni(patron,ini);
		if(ini<MAXCOL) {
		  fin=buscarFin(patron,ini);
		  int tamanioSecuPatron=fin-ini+1;
		  if(tamanioSecu==tamanioSecuPatron) {
              if(sonIgualesSecuYPatron(arr,iniSecu,finSecu,patron,ini,fin)) {
            	  return true;
              }
		  }else {
			  return false;
		  }
		  ini=fin+1;
		}
	}
	return false;
}
public static boolean sonIgualesSecuYPatron(int[] arr, int iniS, int finS, int[] patron, int iniP, int finP) {
	while(iniS<=finS&&iniP<=finP) {
		if(arr[iniS]!=patron[iniP]) {
			return false;
		}
		iniP++;
		iniS++;
	}
	return true;
}
public static int buscarFin(int[] arr, int ini) {
	while(ini<MAXCOL && arr[ini]!=-1) {
		ini++;
	}
	return ini-1;
}
public static int buscarIni(int[] arr, int ini) {
	while(ini<MAXCOL && arr[ini]==-1) {
		ini++;
	}
	return ini;
};
public static void imprimirArr(int[] arr) {
	  for(int i=0;i<MAXCOL;i++) {
		  System.out.print(" | " + arr[i]);
	  }
		
}
public static void imprimrMatriz(int[][] matriz) {
	for(int fila=0;fila<MAXFIL;fila++) {
		recorrerColum(matriz[fila]);
	}
}
public static void recorrerColum(int[] arr) {
	for(int colum=0;colum<MAXCOL;colum++) {
		   System.out.print(" | " + arr[colum]);
	    }
	System.out.println("");
}

}



