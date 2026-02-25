package arregloenorden;

public class OrdenarArreglo {

    public static void main(String[] args) {

        int[] arreglo = {11, 4, 15, 8, 0, 22, 3};

        // Repite el proceso n-1 veces
        for (int i = 0; i < arreglo.length - 1; i++) {
            
            // Recorre el arreglo comparando posiciones consecutivas
            for (int j = 0; j < arreglo.length - 1; j++) {

                // Si el actual es mayor que el siguiente, los intercambia
                if (arreglo[j] > arreglo[j + 1]) {

                    int aux = arreglo[j];      // Guarda el valor actual
                    arreglo[j] = arreglo[j + 1]; // Pasa el siguiente a la izquierda
                    arreglo[j + 1] = aux;      // Coloca el guardado a la derecha
                }
            }
        }

        // Imprime el arreglo ya ordenado
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}