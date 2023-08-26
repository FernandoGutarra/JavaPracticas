public class ejemplo {
    public class ejercicio16 {
        final static int MAX = 20, SEP = 0;
        public static void main(String[] args) {
            int[] arrInt = { 0, 1, 2, 3, 0, 4, 5, 0, 0, 8, 0, 5, 9, 3, 0, 1, 5, 0, 0, 0 };
            int inicio = 0, fin = -1, iniMax = 0, finMax = 0;
            while (inicio < MAX && fin < MAX) {
                inicio = buscarInicio(arrInt, fin + 1);
                if (inicio < MAX) {
                    fin = buscarFin(arrInt, inicio);
                    if (fin < MAX) {
                        iniMax = recorrerArr(arrInt, inicio, fin);
                        finMax = buscarFin(arrInt, iniMax);
                    }
                    fin = fin + 1;
                }

            }
            imprimir_arreglo_secuencias_int(arrInt);
            System.out.println("Inicio: " + iniMax + "\nFin: " + finMax);

        }

        public static void imprimir_arreglo_secuencias_int(int[] arr) {
            System.out.print("Arreglo de secuencias int\n|");
            for (int pos = 0; pos < MAX; pos++) {
                System.out.print(arr[pos] + "|");
            }
            System.out.print("\n");
        }

        public static int buscarInicio(int[] arr, int pos) {
            while (pos < MAX && arr[pos] == SEP) {
                pos++;
            }
            return pos;
        }

        public static int buscarFin(int[] arr, int pos) {
            while (pos < MAX && arr[pos] != SEP) {
                pos++;
            }
            return pos-1;
        }

        public static int recorrerArr(int[] arr, int inicio, int fin) {
            int suma = 0, sumaMax = 0, iniMax = 0;
            for (int i = inicio; i <= fin; i++) {
                suma += arr[i];
                if (suma > sumaMax) {
                    sumaMax = suma;
                    iniMax = inicio;
                }
            }
            return iniMax;

        }
    }
// Hacer un programa que devuelva la posición de inicio y fin de la
// secuencia de números distintos de ceros cuya suma del contenido
// sea mayor.
}
