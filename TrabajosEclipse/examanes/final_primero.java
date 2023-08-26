package examanes;

public class final_primero {
	 final static int MAXC=10;
	 final static int MAXF=2;
	 public static void main(String[]args) {
		 char[][]matrizA= {
				 {' ','e','f',' ','i','p',' ','m','3',' '},
				 {' ','e','h','3',' ','h','k',' ','3',' '}
		 };
		 int [][]matrizB= {
				 {0,1,2,1,0,1,0,6,7,0},
				 {0,1,2,0,4,5,0,2,0,0}
		 };
		 imprimirMatriz(matrizA);
		 System.out.println(" ");
		 int tamanioSecu=0;
		 int promedioSecuMenor=0;
		 for(int fila=0;fila<MAXF;fila++){
			 int ini=0;
			 int fin=0;
			  while(ini<MAXC) {
				  ini=buscarIni(matrizA[fila],ini);
				 if(ini<MAXC) {
					 fin=buscarFin(matrizA[fila],ini);
				     tamanioSecu=fin-ini+1;
				     promedioSecuMenor=buscarPromedioM(matrizB[fila]);
				       if(tamanioSecu==promedioSecuMenor){
				    	  corrimientoIzq(matrizA[fila],ini,tamanioSecu); 
				          ini=fin-tamanioSecu+1; 
				       }
				       else {
				    	   ini=fin+1;
				       }
				     }
			  }
		 }
		 imprimirMatriz(matrizA);
	 }
	 public static void corrimientoIzq(char[] arrA, int ini,int tamanioSecu) {
		for(int i=0;i<=tamanioSecu;i++) {
			int iniTemp=ini;
			 while(iniTemp<MAXC-1) {
				arrA[iniTemp]=arrA[iniTemp+1];
			     iniTemp++;
			}
		}
	}
	private static int buscarPromedioM(int[] arrB) {
		int promedioMenor=0;
		int tamanioSecu=0;
		int secuMenor=0;
		int ini=0;
		int fin=0;
		int iniM=0;
		int finM=0;
		while(ini<MAXC) {
			 ini=buscarIniB(arrB,ini);
			 if(ini<MAXC) {
				 fin=buscarFinB(arrB,ini);
				 tamanioSecu=fin-ini+1;
				 if(secuMenor==0) {
					 secuMenor=tamanioSecu;
					 iniM=ini;
					 finM=fin;
				 }else if(secuMenor>tamanioSecu){
					 secuMenor=tamanioSecu;
					 iniM=ini;
					 finM=fin;
				 }
				 ini=fin+1;
			 }
		}
		promedioMenor=obtenerPromedioM(arrB,iniM,finM);
		return promedioMenor;
	}
	public static int buscarFinB(int[] arrB, int ini) {
		while(ini<MAXC&&arrB[ini]!=0) {
			ini++;
		}
		return ini-1;
	}
	public static int buscarIniB(int[] arrB, int ini) {
		while(ini<MAXC&&arrB[ini]==0) {
			ini++;
		}
		return ini;
	}
	public static int obtenerPromedioM(int[] arrB, int iniM, int finM) {
	    int suma=0;
	    for(int i=iniM;i<=finM;i++) {
	    	suma=arrB[i];
	    }
		return suma/(finM-iniM+1);
	}
	public static int buscarIni(char[] arrA, int ini) {
	  while(ini<MAXC&&arrA[ini]==' ') {
		  ini++;
	  }
		return ini;
	 }
	 
	  public static int buscarFin(char[] arrA,int ini ){
		while(ini<MAXC&&arrA[ini]!=' ') {
			ini++;
		}
		return ini-1; 
	  }
	  public static void imprimirMatriz(char[][]matrizA) {
		  for(int fila=0;fila<MAXF;fila++){
			  recorrerColum(matrizA[fila]);
		  }
	  }
	  public static void recorrerColum(char[]arrB) {
		  for(int colum=0;colum<MAXC;colum++) {
			  System.out.print("| "+ arrB[colum]);
		  }
		  System.out.println(" ");
	  }
	};
