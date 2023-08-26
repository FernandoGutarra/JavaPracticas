import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
1. La clínica “Dolores” tiene un sistema de historias clínicas para
todos sus pacientes. El gerente de administración solicita emitir
algunos informes y elige en un menú de opciones:
a. Si la opción es ‘1’ se debe pedir ingrese la cantidad de
pacientes (no mayor a 15) y por cada uno solicitar la edad.
 Informar cuántos pacientes son mayores de 78 años.
 b. Si la opción es ‘2’ se debe ingresar una cantidad de
prestadores de servicios que tiene la clínica (no mayor a 10).
 Por cada prestador solicitar la cantidad de pacientes que ha
 atendido en los últimos 2 días. Finalmente, informar cuántos
 prestadores han atendido a más de 10 pacientes en los últimos 2 días.
c. Si la opción es ‘3’ se desea saber la cantidad de pacientes
 de cada sexo y el promedio de edades de cada grupo. Para
 ello deberá solicitar primero que ingrese qué cantidad son
femeninos (no mayor a 10) y qué cantidad son masculinos
 (no mayor a 10). Por cada grupo solicitar el ingreso de las
edades para luego informar los promedios correspondientes.
 d. Por último, si la opción es ‘4’ se desea conocer cuántos
 pacientes no tienen obra social. Para ello se debe solicitar la
cantidad de pacientes (no mayor a 15) y por cada uno
  solicitar si tiene o no obra social. Puede suponer un valor
 numérico para verdadero y otro para falso.
 e. Cualquier otra opción se debe informar que “No es una
  opción válida” y debe volver a pedirla. Con ‘0’ termina.
  Escribir un programa que permita obtener al gerente de
 administración los informes que necesita.*/
public class BonusTrack1_Parte_1 {
    public static void main(String[] args) {
        int opcion = 1;
        final int MAX = 4;
        int contador = 0;

        int numeroPacientes = 0;
        final int MAXPACIENTES = 15;
        int edadPaciente = 0;

        int cantPacienteMayor = 0;

        int cantPrestadores = 0;
        final int MAXPACIENTESATENDI = 10;
        int cantPacienteAtendido = 0;
        int cantPacienteAtenMayorAMAX = 0;

        int cantPacienteFemenino = 0;
        int cantPacienteMasculino = 0;
        int MAXPACIENTESGENERO = 10;
        int edad = 0;
        double sumaEdadesMujer = 0;
        double sumaEdadesHombre = 0;

        int cantPacienteObraS=0;
        int obraSocial=0;
        final int VERDADERO=1;
        final int FALSO=2;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(opcion!=0) {
                System.out.println("ingresa un numero del 1 entre 4");
                opcion = Integer.valueOf(entrada.readLine());
                switch (opcion) {
                    case 1:
                        System.out.println("ingresame el numero de pacientes no tiene que ser mayor a 15 por que no tenemos mas camas");
                        numeroPacientes = Integer.valueOf(entrada.readLine());
                        if (numeroPacientes > 0 && numeroPacientes <= MAXPACIENTES) {
                            while (contador < numeroPacientes) {
                                System.out.println("por favor ingresar los años del paciente numero:" + (contador + 1));
                                edadPaciente = Integer.valueOf(entrada.readLine());
                                if (edadPaciente > 78) {
                                    cantPacienteMayor++;
                                    contador++;
                                } else if (edadPaciente > 0) {
                                    contador++;

                                } else if (edadPaciente < 0) {
                                    System.out.println("por favor ingresar una edad del pasiente valida un pasiente no puede tener años negativos");
                                }
                            }
                        }
                        System.out.println("la cantidad de pacientes con una edad mayor a 78 años es " + cantPacienteMayor);
                        break;
                    case 2:
                        System.out.println("ingresar la cantidad de prestadores no mayor a 10");
                        cantPrestadores = Integer.valueOf(entrada.readLine());
                        if (cantPrestadores > 0) {
                            while (contador < cantPrestadores) {
                                System.out.println("cantidad de pacientes ingresados en los ultimos 2 dias por cada prestador" + (contador + 1));
                                cantPacienteAtendido = Integer.valueOf(entrada.readLine());
                                if (cantPacienteAtendido > MAXPACIENTESATENDI) {
                                    contador++;
                                    cantPacienteAtenMayorAMAX++;
                                } else if (cantPacienteAtendido > 0) {
                                    contador++;
                                } else if (cantPacienteAtendido < 0) {
                                    System.out.println("por favor ingrese una cantidad validad de pacientes atendidoss");
                                }
                            }
                        }
                        System.out.println("la cantidad de pretadores que atendieron a mas de 10 pacientes en los ultimos 2 dias es de =" + cantPacienteAtenMayorAMAX);
                        break;
                    case 3:
                        while (cantPacienteFemenino == 0) {
                            System.out.println("ingresar la cantidad de pacientes del genero Femenino menor a 10");
                            cantPacienteFemenino = Integer.valueOf(entrada.readLine());
                            if (cantPacienteFemenino > 0 && cantPacienteFemenino <= MAXPACIENTESGENERO) {
                                while (contador < cantPacienteFemenino) {
                                    System.out.println("ingresar edad del paciente mujer numero:" + (contador + 1));
                                    edad = Integer.valueOf(entrada.readLine());
                                    if (edad > 0) {
                                        sumaEdadesMujer += edad;
                                        contador++;
                                    } else {
                                        System.out.println("por favor ingrese una edad valida");
                                    }
                                }
                                contador = 0;
                                while (cantPacienteMasculino == 0) {
                                    System.out.println("ingresar la cantidad de pacientes del genero Masculino menor a 10");
                                    cantPacienteMasculino = Integer.valueOf(entrada.readLine());
                                    if (cantPacienteMasculino > 0 && cantPacienteMasculino <= MAXPACIENTESATENDI) {
                                        while (contador < cantPacienteMasculino) {
                                            System.out.println("ingresar edad del paciente masculino numero:" + (contador + 1));
                                            edad = Integer.valueOf(entrada.readLine());
                                            if (edad > 0) {
                                                sumaEdadesHombre += edad;
                                                contador++;
                                            } else {
                                                System.out.println("por favor ingrese una edad valida");
                                            }
                                        }
                                    } else {
                                        System.out.println("ingresa un cantidad de pacientes valida");
                                        System.out.println("");
                                        cantPacienteMasculino = 0;
                                    }
                                }
                                System.out.println("el promedio de la edad de las pacientes femeninas es de:" + (sumaEdadesMujer / cantPacienteFemenino));
                                System.out.println("el primedio de la edad de los pacientes masculinos es de:" + (sumaEdadesHombre / cantPacienteMasculino));
                            } else {
                                System.out.println("ingresa un cantidad de pacientes invalida");
                                System.out.println("");
                                cantPacienteFemenino = 0;
                            }
                        }
                        break;
                    case 4:
                        while (numeroPacientes == 0) {
                            System.out.println("ingrese la cantidad de pacientes entre 1 y 15");
                            numeroPacientes = Integer.valueOf(entrada.readLine());
                            if (numeroPacientes > 0 && numeroPacientes <= MAXPACIENTES) {
                                while (contador < numeroPacientes) {
                                    System.out.println("el paciente numero:" + (contador + 1));
                                    System.out.println("ingresar 1 si tiene obra social o ingrese 2 si no tiene obra social");
                                    obraSocial = Integer.valueOf(entrada.readLine());
                                    if (obraSocial == VERDADERO) {
                                        cantPacienteObraS++;
                                        contador++;
                                    } else if (obraSocial == FALSO) {
                                        contador++;
                                    } else {
                                        System.out.println("");
                                        System.out.println("por favor ingrese una opcion valida");
                                    }
                                }
                            } else {
                                System.out.println("ingresar un numero de pacientes validos");
                                numeroPacientes = 0;
                            }
                        }
                        System.out.println("la cantidad de pacientes que tiene obra social es :" + cantPacienteObraS);
                        break;
                    default:
                        System.out.println("numero invalido");
                        break;
                }
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
