package arregloenorden;

public class OrdenarArreglo {

    public static void main(String[] args) {

        int[] arreglo = {11, 4, 15, 8, 0, 22, 3};

        // Método burbuja
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        System.out.println("Arreglo ordenado:");

        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}