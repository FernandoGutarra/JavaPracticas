import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practico_9 {
    /*
    9. Escribir un programa que mientras el usuario ingrese un número
    entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
    ingresado imprima:
    a. “letra minúscula” si el carácter es una letra del abecedario en
            minúscula;
    b. “letra mayúscula” si el carácter es una letra del abecedario

    en mayúscula;
    c. “dígito” si el caracter corresponde a un número;
    d. “otro” para los restantes casos de caracteres.*/
    public static void main(String[]args){
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                int numero;
                char caracter;

                System.out.println("Ingrese un número entero entre 1 y 10:");
                numero = obtenerNumero();

                while (numero >= 1 && numero <= 10) {
                    System.out.println("Ingrese un caracter:");
                    caracter = obtenerCaracter();

                    if (esLetraMinuscula(caracter)) {
                        System.out.println("letra minúscula");
                    } else if (esLetraMayuscula(caracter)) {
                        System.out.println("letra mayúscula");
                    } else if (esDigito(caracter)) {
                        System.out.println("dígito");
                    } else {
                        System.out.println("otro");
                    }

                    System.out.println("Ingrese un número entero entre 1 y 10:");
                    numero = obtenerNumero();
                }
            }

            private static int obtenerNumero() {
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                int numero = 0;
                try {
                    numero = Integer.parseInt(entrada.readLine());
                } catch (Exception exc) {
                    System.out.println(exc);
                }
                return numero;
            }

            private static char obtenerCaracter() {
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                char caracter = ' ';
                try {
                    caracter = entrada.readLine().charAt(0);
                } catch (Exception exc) {
                    System.out.println(exc);
                }
                return caracter;
            }

            private static boolean esLetraMinuscula(char caracter) {
                return caracter >= 'a' && caracter <= 'z';
            }

            private static boolean esLetraMayuscula(char caracter) {
                return caracter >= 'A' && caracter <= 'Z';
            }

            private static boolean esDigito(char caracter) {
                return caracter >= '0' && caracter <= '9';
            }

        }


