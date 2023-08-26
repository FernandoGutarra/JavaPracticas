import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
20.
Pedir números enteros positivos por teclado. En cada iteración
 el usuario puede ingresar 0 para salir del programa. Si ingresa un
 número distinto de 0 se debe pedir el ingreso de un carácter.
 a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e
 imprimirlo por pantalla.
 b. Si es ‘b’ se deben pedir 5 números positivos e informar si
 fueron ingresados en orden ascendente.
 c. Si es ‘c’ se deben pedir dos números enteros negativos e
 imprimir la raíz cuadrada de su multiplicación. La raíz
 cuadrada de un número se calcula con la sentencia:
 Math.sqrt(numero).
 d. Ante cualquier otro carácter ingresado se debe informar un
 error y pedir nuevamente el carácter.*/
public class ejercicio_20 {
    public static void main(String[]args){
        final int TERMINAR=0;
        final int NUMEROSPOSIVOS=5;
        int contadorNumerosIngresados=0;
        int contador=0;
        int numeroEntero=1;
        int enteroAnterior=0;
        char caracter=' ';
        String textoLibre=" ";
        int enteroNegativo=0;
        int enteroNegativo2=0;
        double raizCuadrada=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
             while (numeroEntero!=0){
              System.out.println("ingresar un numero entero positivo");
              numeroEntero = Integer.valueOf(entrada.readLine());
              while(numeroEntero>0 ){
                  System.out.println("");
                  System.out.println("ingresa un caracter");
                  caracter =  entrada.readLine().charAt(0);
                    if(caracter == 'a'){
                        System.out.println("escribi un texto libre");
                        textoLibre= entrada.readLine();
                        System.out.println("el texto libre ingrsado fue: "+textoLibre);
                    } else if (caracter == 'b') {
                            while(numeroEntero>=0 && contadorNumerosIngresados<NUMEROSPOSIVOS){
                                System.out.println("ingrese un numero entero positivo");
                                numeroEntero = Integer.valueOf(entrada.readLine());
                                if(numeroEntero>0){
                                    contadorNumerosIngresados++;
                                     if(enteroAnterior==0){
                                         enteroAnterior=numeroEntero;
                                         contador++;
                                     }else if(numeroEntero>enteroAnterior){
                                          enteroAnterior=numeroEntero;
                                          contador++;
                                     }else if (numeroEntero<=enteroAnterior && numeroEntero>0) {
                                         contador=0;
                                     }
                                }else if(numeroEntero<0) {
                                    System.err.println("se ingreso un numero negativo por favor vuelva a ingresar un numero positivo");
                                    numeroEntero=0;
                                }
                            }
                            if(contador==NUMEROSPOSIVOS){
                                System.out.println("los numeros ingresados estan en orden acendente");
                             }else if(contador!=0){
                               System.out.println("los numeros ingresados no tienen orden");
                            }
                    }

                    else if (caracter == 'c') {
                        while (enteroNegativo<=0&&enteroNegativo2<=0) {
                            System.out.println("por favor ingresa un numero entero negativo");
                            enteroNegativo = Integer.valueOf(entrada.readLine());
                            if(enteroNegativo<=0) {
                                System.out.println("ingresar otro numero entero negativo");
                                enteroNegativo2 = Integer.valueOf(entrada.readLine());
                                if(enteroNegativo2<=0){
                                    enteroNegativo*=enteroNegativo2;
                                    raizCuadrada=  Math.sqrt(enteroNegativo);
                                    System.out.println("raiz cuadra de la multiplicasion de los enteros negativos ="+raizCuadrada);

                                }else {
                                    System.out.println("incorrecto no se ingreso un numero entero negativo");
                                    System.out.println("");
                                    enteroNegativo2=0;
                                }
                            }else{
                                System.out.println("incorrecto no se ingreso un numero entero negativo");
                                System.out.println("");
                            }
                        }
                    }else{
                        System.out.println(" a ocurrido un error por favor ingresar cualquier otro caracter");
                        enteroNegativo=0;
                    }
              }
             }
              System.out.println("se ingreso 0 se termina el programa");
        }catch (Exception exc){
            System.out.println(exc);
        }
    }
}
