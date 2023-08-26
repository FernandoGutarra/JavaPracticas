package practica_luccho;


/*Se tiene un arreglo de tamaño MAX de secuencias de letras minúsculas ordenadas ascendentemente
con separadores espacio en blanco.
Realizar un programa completo en Java haciendo uso de constantes y métodos
que solicite al usuario una vocal minúscula y la inserte
de manera ordenada en las secuencias que no tienen vocales o que tienen al menos dos ‘t’.
Considerar los corrimientos correspondientes.
Finalmente informar cuantas secuencias fueron modificadas.

Observaciones:
_las secuencias están separadas por uno o más espacios en blanco,
el arreglo empieza y termina con uno o más espacios en blanco.
_no usar estructuras auxiliares.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_3 {
    final static int MAXCOLUMNAS = 10;
    final static int MAXFILAS = 4;
    final static int CANTIDADMINT = 2;

        public static void main(String args[]) {
        char[] arreglo_char = {' ', 'f', 'f', 't', 'z', ' ', 't', 't', 'r', ' '};

       // char[][] matriz_char = {{' ', 'f', 'f', 't', 'z', ' ', 't', 't', 'r', ' '},
         //       {' ', 'f', 'f', 't', 'z', ' ', 't', 't', 'r', ' '},
          //      {' ', 'f', 'f', 't', 'z', ' ', 't', 't', 'r', ' '},
            //    {' ', 'f', 'f', 't', 'z', ' ', 't', 't', 'r', ' '}};

       // imprimirMatriz(matriz_char);
        //obtener una vocal minuscula
        char vocalUsuario = obenerVocalMinuscula();
        int cantidadSecuenciasCambiadas = 0;
        System.out.println("Ingreso letra "+vocalUsuario);
        for(int fila = 0; fila<MAXFILAS; fila++) {
            int inicio = 0, fin = 0, pos = 0;
            //recorrer el arreglo y buscar secuencias
            while (inicio < MAXCOLUMNAS) {
                inicio = obtenerInicio(matriz_char[fila], inicio);
                if (inicio < MAXCOLUMNAS) {
                    fin = obtenerFin(matriz_char[fila], inicio);
                    //comprobar si es una secuencia valida o la que nos pide el ejercicio
                    if (secuenciaCandidata(matriz_char[fila], inicio, fin)) {
                        //insertar la vocal de manera ordenada en esa secuencia
                        //contar la cantidad de veces que se modifica una secuencia
                        cantidadSecuenciasCambiadas += insertarVocal(vocalUsuario, matriz_char[fila], inicio, fin);
                        inicio = fin + 2;
                    } else {
                        inicio = fin + 1;
                    }
                }
            }
        }

        //informar cuantas secuencias se modificaron
        if(cantidadSecuenciasCambiadas>0){
            System.out.println("Se modificaron " + cantidadSecuenciasCambiadas + " secuencias");
        }else{
            System.out.println("No se modificaron secuencias");
        }

        imprimirMatriz(matriz_char);

    }

    public static char obenerVocalMinuscula(){
        char letra = ' ';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while(!esVocal(letra)) {
            try {
                System.out.println("Ingrese una vocal minúscula");
                letra = entrada.readLine().charAt(0);
            } catch (Exception error) {
                System.out.println(error);
            }
        }

        return letra;

    }

    public static boolean esVocal(char letra){
        if(letra == 'a' || letra == 'e'|| letra == 'i'|| letra == 'o'|| letra == 'u'){
            return true;
        }else{
            return false;
        }
    }



    public static void imprimirMatriz(char [][] matriz){
        for(int i = 0; i< MAXFILAS; i++){
            for(int j = 0; j<MAXCOLUMNAS; j++){
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }

    public static int obtenerInicio(char [] arreglo, int inicio){
        while (inicio<MAXCOLUMNAS && arreglo[inicio] == ' '){
            inicio++;
        }
        return inicio;
    }

    public static int obtenerFin(char [] arreglo, int inicio){
        while (inicio<MAXCOLUMNAS && arreglo[inicio] != ' ') {
            inicio++;
        }
        return inicio-1;
    }
    public static boolean secuenciaCandidata(char [] arreglo, int inicio, int fin){
        // -- no tienen vocales o que tienen al menos dos ‘t’
        int cantidadT = 0;
        boolean encontroVocal = false;

        while(inicio<=fin) {
            if (arreglo[inicio] == 't') {
                cantidadT++;
            }
            if (!encontroVocal) {
                if (esVocal(arreglo[inicio])) {
                    encontroVocal = true;
                }
            }
            inicio++;
        }
        if(!encontroVocal || cantidadT>=CANTIDADMINT){
            return true;
        }

        return false;
    }
    public static int insertarVocal(char vocal, char []arreglo, int inicio, int fin){
        //obtener el orden o la posicion donde vamos a insertar la letra
        int pos = obtenerPos(arreglo, inicio, fin, vocal);
        if(pos<= fin){
            correrDerecha(arreglo, pos);
            arreglo[pos] = vocal;
            return 1;
        }else{
            System.out.println("No se modifico la secuencia que inicia en " + inicio + " y que termina en " + fin + " dado que deberia ingresarse en la última posición");
            return 0;
        }
    }

    public static void correrDerecha(char [] arreglo, int pos){
        int i = MAXCOLUMNAS -1 ;
        while(i>pos){
            arreglo[i] = arreglo[i-1];
            i--;
        }
    }

    public static int obtenerPos(char [] arreglo, int inicio, int fin, char vocal){
        while(inicio<= fin && arreglo[inicio]<vocal){
            inicio++;
        }
        return inicio;
    }
}
