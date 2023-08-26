import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
5. Escribir un programa que solicite una hora del día (valor entero de
        la hora solamente) y resuelva en cada caso:
        a. Si la hora está entre las 0 y las 5, pida ingresar la
        temperatura y si la misma es menor a 20 grados imprima
        “Encender la calefacción”. Si es mayor a 25, imprima
        “Apagar calefacción”. Si está en el rango de 20 a 25 imprima
        “Calefacción encendida, no abra las ventanas!!!”.
        b. Si la hora está entre las 6 y las 11, pida un carácter letra
        minúscula y si es vocal imprima por la consola la cantidad de
        vocales que tiene la palabra que corresponde con la hora.
        Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
        cantidad de consonantes que tiene, para el ejemplo 8 (ocho)
        tiene 2 consonantes.
        c. Si la hora está entre las 12 y 17 y es par, imprima el
        promedio entre la hora ingresada y el límite inferior del

        rango. Si la hora es impar debe imprimir el promedio entre la
        hora ingresada y el límite superior del rango.
        d. Si la hora está entre las 18 y 23, pida ingresar una clave
        numérica, si coincide con la clave almacenada previamente
        en una constante, pida ingresar una segunda clave de
        verificación (un valor entre 100 y 999). Para esta segunda
        clave (que solo la conoce el usuario) se debe verificar que el
        el dígito de mayor peso (centena) es múltiplo del dígito de
        mayor peso de la clave almacenada. Si todo esto se cumple
        debería mostrar por la consola el mensaje “Clave correcta”.
        Ejemplo: clave almacenada 364, clave ingresada 364,
        segunda clave ingresada 698.
  */
public class ejercicio_5 {
    public static void main(String[] args) {
        int hora=0;
        int temperatura=0;
        char letra=' ';
        final int MINHORA=0;
        final int MAXHORA=24;

        final int HORAMAX=5;

        final int TEMPERATURAMIN=20;
        final int TEMPERATURAMAX=25;

        final int MAXHORA6=6;
        final int MINHORA11=11;

        final int MINHORA12=12;
        final int MAXHORA17=17;

        final int MULTIPLO=2;
        final int DIVISOR=2;
        int contador=0;

        final int MINHORA18=18;
        final int MAXHORA23=23;

        final int CLAVENUMERICA=231213;
        int claveNumerica=0;
        int claveVerificasion=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
       try{

           hora = Integer.valueOf(entrada.readLine());
           if(hora>=MINHORA&&hora<=MAXHORA){
                   if(hora >= MINHORA &&hora <= HORAMAX){
                       System.out.println("ingresame la temperatura por consola");
                       temperatura = Integer.valueOf(entrada.readLine());
                        if(temperatura < TEMPERATURAMIN){
                            System.out.println("encender la calefacción");
                        } else if (temperatura > TEMPERATURAMAX) {
                            System.out.println("apagar caleffacion");
                        }else if(temperatura>=TEMPERATURAMIN && temperatura <= TEMPERATURAMAX){
                            System.out.println("la calefacción esta encendida habras la ventanas");
                        }
                   } else if (hora >= MAXHORA6 && hora <= MINHORA11) {
                       System.out.println("ingrese una letra minuscula");
                       letra = entrada.readLine().charAt(0);
                       if(letra=='a'||letra=='e'&&letra=='i'||letra=='o'||letra=='u'){
                           System.out.println("la letra minuscula es vocal");
                           switch (hora){
                               case 1 :
                                  for(int i =0; i<"uno".length();i++){
                                      char letraDePalabra = "uno".charAt(i);
                                      if(letraDePalabra=='a'||letraDePalabra=='e'&&letraDePalabra=='i'||letraDePalabra=='o'||letraDePalabra=='u'){
                                          contador++;
                                      }
                                  }
                                   System.out.println("la cantidad de vocales encontradas es "+contador);
                                  break;
                               case 2:
                                       for(int i =0; i<"dos".length();i++){
                                           char letraDePalabra = "dos".charAt(i);
                                           if(letraDePalabra=='a'||letraDePalabra=='e'&&letraDePalabra=='i'||letraDePalabra=='o'||letraDePalabra=='u'){
                                               contador++;
                                           }
                                       }
                                   System.out.println("la cantidad de vocales encontradas es "+contador);
                                   break;

                                   case 3:
                                       for(int i =0; i<"tres".length();i++){
                                           char letraDePalabra = "tres".charAt(i);
                                           if(letraDePalabra=='a'||letraDePalabra=='e'&&letraDePalabra=='i'||letraDePalabra=='o'||letraDePalabra=='u'){
                                               contador++;
                                           }
                                       }
                                       System.out.println("la cantidad de vocales encontradas es "+contador);
                                       break;
                               case 4:
                                   for(int i =0; i<"cuatro".length();i++){
                                       char letraDePalabra = "cuatro".charAt(i);
                                       if(letraDePalabra=='a'||letraDePalabra=='e'&&letraDePalabra=='i'||letraDePalabra=='o'||letraDePalabra=='u'){
                                           contador++;
                                           System.out.println("");
                                       }
                                    }
                                   System.out.println("la cantidad de vocales encontradas es "+contador);
                                   break;
                               case 5:
                                   for(int i =0; i<"cinco".length();i++){
                                       char letraDePalabra = "cinco".charAt(i);
                                       if(letraDePalabra=='a'||letraDePalabra=='e'&&letraDePalabra=='i'||letraDePalabra=='o'||letraDePalabra=='u'){
                                           contador++;
                                       }
                                   }
                                   System.out.println("la cantidad de vocales encontradas es "+contador);
                                   break;
                               case 6:
                                   for(int i =0; i<"seis".length();i++){
                                       char letraDePalabra = "seis".charAt(i);
                                       if(letraDePalabra=='a'||letraDePalabra=='e'&&letraDePalabra=='i'||letraDePalabra=='o'||letraDePalabra=='u'){
                                           contador++;
                                       }
                                   }
                                   System.out.println("la cantidad de vocales encontradas es "+contador);
                                   break;
                               }


                       }else{
                           System.out.println("no es una letra minuscula");
                           switch (hora){
                               case 1 :
                                   for(int i =0; i<"uno".length();i++){
                                       char letraDePalabra = "uno".charAt(i);
                                       if(!(letraDePalabra=='a'||letraDePalabra=='e'&&letraDePalabra=='i'||letraDePalabra=='o'||letraDePalabra=='u')){
                                           contador++;
                                       }
                                   }
                                   System.out.println("la cantidad de consonantes encontradas es "+contador);
                                   break;
                               case 2:
                                   for(int i =0; i<"dos".length();i++){
                                       char letraDePalabra = "dos".charAt(i);
                                       if(!(letraDePalabra=='a'||letraDePalabra=='e'&&letraDePalabra=='i'||letraDePalabra=='o'||letraDePalabra=='u')){
                                           contador++;
                                       }
                                   }
                                   System.out.println("la cantidad de consonanted encontradas es "+contador);
                                   break;

                               case 3:
                                   for(int i =0; i<"tres".length();i++){
                                       char letraDePalabra = "tres".charAt(i);
                                       if(!(letraDePalabra=='a'||letraDePalabra=='e'&&letraDePalabra=='i'||letraDePalabra=='o'||letraDePalabra=='u')){
                                           contador++;
                                       }
                                   }
                                   System.out.println("la cantidad de consonantes encontradas es "+contador);
                                   break;
                               case 4:
                                   for(int i =0; i<"cuatro".length();i++){
                                       char letraDePalabra = "cuatro".charAt(i);
                                       if(!(letraDePalabra=='a'||letraDePalabra=='e'&&letraDePalabra=='i'||letraDePalabra=='o'||letraDePalabra=='u')){
                                           contador++;
                                           System.out.println("");
                                       }
                                   }
                                   System.out.println("la cantidad de consonantes encontradas es "+contador);
                                   break;
                               case 5:
                                   for(int i =0; i<"cinco".length();i++){
                                       char letraDePalabra = "cinco".charAt(i);
                                       if(!(letraDePalabra=='a'||letraDePalabra=='e'&&letraDePalabra=='i'||letraDePalabra=='o'||letraDePalabra=='u')){
                                           contador++;
                                       }
                                   }
                                   System.out.println("la cantidad de consonantes encontradas es "+contador);
                                   break;
                               case 6:
                                   for(int i =0; i<"seis".length();i++){
                                       char letraDePalabra = "seis".charAt(i);
                                       if(!(letraDePalabra=='a'||letraDePalabra=='e'&&letraDePalabra=='i'||letraDePalabra=='o'||letraDePalabra=='u')){
                                           contador++;
                                       }
                                   }
                                   System.out.println("la cantidad de consonantes encontradas es "+contador);
                                   break;
                           }
                       }
                   } else if (hora>=MINHORA12&&hora<=MAXHORA17) {
                       if(hora%MULTIPLO==0){
                          double promedio = (hora+MINHORA12) / DIVISOR;
                           System.out.println("El promedio es: " + promedio);
                       }else{
                           double promedio = (hora+MAXHORA17) / DIVISOR;
                           System.out.println("El promedio es: " + promedio);
                       }
                   } else if (hora>=MINHORA12&&hora<=MAXHORA17) {
                       System.out.println("ingresar clave numerica");
                       claveNumerica = Integer.valueOf(entrada.readLine());
                       if(claveNumerica==CLAVENUMERICA){
                           System.out.println("ingresar clave numerica");
                           claveVerificasion= Integer.valueOf(entrada.readLine());
                           if(claveVerificasion>=100&&claveVerificasion<=900){
                                 int centenaClaveVerificion = claveVerificasion /100;
                                 int centenaClaveNumera = claveNumerica / 100;
                                 if(centenaClaveVerificion%centenaClaveNumera==0){
                                     System.out.println("Clave correta");
                                     System.out.println("");
                                     System.out.println("Primer Clave Ingresada: " + claveNumerica + " Clave Numerica Almacenada: "+ CLAVENUMERICA );
                                     System.out.println("");
                                     System.out.println("Segunda Clave Ingresada Verificasion :" + claveVerificasion );
                                 }else{
                                     System.out.println("Clave ingresada erronea");
                                     System.out.println("Primer Clave Ingresada: " + claveNumerica + " Clave Numerica Almacenada: "+ CLAVENUMERICA );
                                     System.out.println("");
                                     System.out.println("Segunda Clave Ingresada Verificasion :" + claveVerificasion );
                                 }
                           }
                       }
                   }
           }
       }catch(Exception exc){
           System.out.println(exc);
       }
    }
}
