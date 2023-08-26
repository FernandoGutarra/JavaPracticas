package examanes;
//Una secuencia esta incluidad dentro de otra secuencia si la primera se encuentra con todos sus elementos y 
//respetando el orden dentro de otra secuencia (no necesariamente al principio, en alguna posicion),
//por ejemplo 
//la siguiente secuencia en el arreglo A
// arrA = {' ',' ','b','b','c',' ',' '};
//esta incluida dentro de una secuencia del arreglo B
// arrB = {' ','a','b','b','c','e',' '};
// dado dos arreglos A y B de secuencias de caracteres separadas por espacios que estan precargados
// _obtener el indice inicial de la secuencia de A que mas veces esta incluidad dentro de las secuencias de B

//Observaciones:
//_Todos los arrglos de secuencias empiezan y terminan con espacios
//_Las Secuencias estan separadas por uno o mas espacios
//_todos los arreglos mencionados tienen tamaño MAX
//_No utilizar estructuras auxilares
public class final_febrero {
 final static int MAX=14;
// final static int MAX=10;
 public static void main (String[]args) {
//	 char[] arrA = { ' ',' ','b','b', 'c', ' ', ' ', ' ', ' ', ' ' };
//	 char[] arrB = { ' ', 'a', 'b', 'b', 'c', 'e', ' ', ' ', ' ', ' ' };
//	 char[] arrA = { ' ', ' ', 'h', 'd', ' ', ' ', 'f', ' ', ' ', ' ' };
//	 char[] arrB = { ' ', 'h', 'y', 'r', 'd', ' ', 'f', 'f', 'f', ' ' };
	 char[] arrA = { ' ', 'b', 'b', 'b', 'c', ' ', 'b', 'b', 'c', ' ', 'b', 'c', ' ', ' '};
	 char[] arrB = { ' ', 'b', 'b', 'b', 'c', 'e', ' ', 'b', 'c', ' ', 'b', 'c',' ', ' '};
	 int indiceInicial=0;
	 int secuMasIncluida=0;
	 int ini=0;
	 int fin=0;
	 while(ini<MAX) {
		 ini=buscarIni(arrA,ini);
		 if(ini<MAX) {
			 fin=buscarFin(arrA,ini);
			 int tamanioSecu=fin-ini+1;
			 int veceSecuIncluida=buscarSecuADentroDeB(arrA,arrB,ini,fin,tamanioSecu);
			 if(veceSecuIncluida>secuMasIncluida) {
				 secuMasIncluida=veceSecuIncluida;
				 indiceInicial=ini;
			 }
			 ini=fin+1;
		 }
	 }
	 System.out.println("la el indice de la secu A que mas veces esta incluida en B es "+ indiceInicial);
 }
public static int buscarSecuADentroDeB(char[] arrA,char[] arrB,int iniA, int finA, int tamanioSecuA) {
	int iniB=0;
	int finB=0;
	int secuIncluida=0;
	while(iniB<MAX){
		iniB=buscarIni(arrB,iniB);
		if(iniB<MAX) {
			finB=buscarFin(arrB,iniB);
			int tamanioSecuB=finB-iniB+1;
			if(tamanioSecuB>=tamanioSecuA) {
			   secuIncluida+=secuAIncluidaEnB(arrA,iniA,finA,arrB,iniB,finB,tamanioSecuA);
			   }
			iniB=finB+1;
			}
		}
	
	return secuIncluida;
}
public static int sumar(int numero1,int numero2) {
	int suma = numero1+numero2;
	return suma;
}
public static int secuAIncluidaEnB(char[] arrA, int iniA, int finA, char[] arrB, int iniB, int finB,int tamanioSecu) {
    int contador=0;
    int iniSecuA=iniA;
    int iniAnterior=iniSecuA;
    int secuVecesIncluida=0;
	while(iniA<=finA && iniB<=finB) {
      if(arrA[iniA]==arrB[iniB]) {
		   contador++;
		   if(contador==tamanioSecu) {
			   secuVecesIncluida++;
			   contador=0;
			   iniAnterior=0;
			   iniA=iniSecuA;
			   iniB++;
		   }else {
			   iniA++;
			   iniB++;
		   }
	   }else if(arrB[iniB]==arrA[iniSecuA]){
		   contador=1;
		   iniB++;
	   }else {
		   contador=0;
		   iniB++;
		   iniA=iniAnterior;
	   }
   }
	return secuVecesIncluida;
}
public static int buscarFin(char[] arr, int ini) {
	   while(ini<MAX && arr[ini]!=' ') {
	    	ini++;
	    }
		return ini-1;
}
public static int buscarIni(char[] arr, int ini) {
    while(ini<MAX && arr[ini]==' ') {
    	ini++;
    }
	return ini;
}
public static void imprimirArr(int[] arr,int MAXIMO) {
	  for(int i=0;i<MAXIMO;i++) {
		  System.out.print(" | " + arr[i]);
	  }
 }
}
