package examanes;
//Realizar un programa que dada una matriz MAT de caracteres de tamaño MAXFxMAXC con filas compuestas de
//secuencias de caracteres distintos del carácter espacio ‘ ’, elimine todas las secuencias que no tienen orden entre sus
//caracteres o tienen longitud impar. Para ello además deberá tener en cuenta que cuando elimina una secuencia
//debe realizar un corrimiento a izquierda y completar con caracteres espacio al final de la fila.
//terminado bien
public class final_regular {
 final static int MAXF=2;
 final static int MAXC=10;
 final static int PAR=2;
 final static int MAXFIL = 10;
 final static int MAXCOL = 10;
 public static void main(String[] args) {
   int [][] matriz = new int [MAXFIL][MAXCOL];
   int [][] resultado = new int [MAXFIL][MAXCOL];
   int [] patron = new int [MAXCOL];
   int n = 0, contadoruno = 0, contadordos = 0;
   
   contadoruno = buscarSecuenciaTotales(matriz, patron, resultado, n);
   n = pedirNumero("Numero de secuencia a invertir: ");
   contadordos = buscarSecuenciaTotales(matriz, patron, resultado, n);
   while(contadoruno != contadordos){
     n = -1;
     contadoruno = buscarSecuenciaTotales(matriz, patron, resultado, n);
   }

 }
 public static int buscarSecuenciaTotales(int [] [] matriz, int [] patron, int [][] resultado, int n){
   int contador = 0;
   for(int i=0;i<MAXFIL;i++){
     contador += buscarSecuenciaPorFila(matriz[i], patron, resultado, i, n, contador); 
   }
   agregarCantidadEncontrada(resultado[1], contador);
   
   return contador;
 }
 
 public static int buscarSecuenciaPorFila(int []matriz, int[] patron,int [][] resultado, int fila, int n){
   int inicio = 0, fin = 0, posfila = 0, espaciosCargados = 0, contador = 0, contadoraux = 0, iniinverso = 0, fininverso = 0;
   boolean verificar = false, cambiarContador = false;
   if(n == -1){
     for(int i=MAXCOL;i<-1;i++){
       correrIzquierdaSec(resultado, i, MAXCOL);
     }
   }
   while(inicio < MAXCOL){
       inicio = buscarInicioSecuencia(matriz[i], fin);
       if(inicio < MAXCOL){
         fin = buscarFinSecuencia(matriz[i], inicio);
         if(fin<MAXCOL){
           contadoraux++;
           if((n == contadoraux)&&(n != 0)){
               if(n != contadoraux - 1){
                 cambiarContador = true;
                 iniinverso = inicio;
                 fininverso = fin;
               }
             	else if(n == contadoraux - 1){
                 for(int i=inicio;i<fin;i++){
                   correrIzquierdaSec(matriz,inicio, fin);
                 }
               }
             	else{
                 cambiarContador = false;
               }
           }
           verificar = buscarSecuencia(matriz[i], inicio, fin, patron);
           if(verificar){
             posfila += espaciosCargados;
             escribirResultado(resultado, inicio, poscolumna, fila);
             espaciosCargados = 3;
             contador++;
             
           }
         }
       }
     }
   if(cambiarContador){
     invertirSecuencia(matriz, iniinverso, fininverso);
     return contador - 1;
   }
   else{
     return contador;
   }
   
 }
 public static void agregarCantidadEncontrada(int []resultado, int contador){
   int pos = 0;
   correrDerecha(resultado, pos, contador);
 }
 public static void correrDerecha(int[] array, int pos, int insercion) { 
		int actual = (MAX-1);
		while (actual > pos) {
			array[actual] = array[actual-1];
			actual--;
		}
		array[pos] = insercion;
	}
 public static void correrIzquierdaSec(int[] array, int pos, int max) { 
		while (pos < max) {
			array[pos] = array[pos+1];
			pos++;
		}
		array[pos] = 0; 
	}
 public static void invertirSecuencia(int [] matriz, int iniinverso, int fininverso){
   int max = fininverso - iniinverso + 1, aux, opuesto;
   for(int i=iniinverso;i<max/2;i++){
     opuesto = matriz[fininverso];
     aux = matriz[i];
     matriz[i] = matriz[opuesto];
     matriz[opuesto] = aux;
   }
 }
 public static void escribirResultado(int [][] resultado, int inicio, int poscolumna, int fila){
   resultado[fila][poscolumna] = columna;
   resultado[fila][poscolumna+1] = inicio;
	resultado[fila][poscolumna+2] = -1;
   
 }
 public static boolean buscarSecuencia(int [] fila, int inicio, int fin, int [] patron){
   boolean verificar = false;
   int pos = inicio, i = 1,max = fin - inicio + 1, contador = 0;

   while(i<max){
     for(int pos=inicio;inicio<fin;inicio++){
     if(fila[pos] == patron[i]){
       contador++;
       if(contador == max){
         verificar = true;
       }
       else{
         verificar = false;
       }
     }
   }
   }
   return verificar;
   
 }
 public static int buscarInicioSecuencia(int []fila, int desde){
   int inicio = desde;
   while(inicio<MAXCOL && fila[inicio] == 0){
     inicio++;
   }
   return inicio;
 }
 public static int buscarFinSecuencia(int []fila, int desde){
   int fin = desde;
   while(fin<MAXCOL && fila[fin] != 0){
     fin++;
   }
   return fin;
 }
 public static int pedirNumero(String texto){
   int n = 0;
   boolean ver = false;
   
   BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
   while(!ver){
     try{
       System.out.println (texto);
       n = new Integer(entrada.readLine());      
       ver = true;
       }
       catch(Exception exc){

       }
    }
   return n;
 }

}
