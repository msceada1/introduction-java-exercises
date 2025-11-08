package Repaso_Arrays;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 12, 3, 14, 2, 1, 2, 10, 34, 14, 14, 0, 7, 2, 0, 0, 0, 12};

        System.out.println(Arrays.toString(eliminaDuplicados(array)));
    }

    private static boolean contieneElemento(int[] array, int elemento) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return true;
            }
        }

        return false;
    }

    private static int[] eliminaDuplicados(int[] array) {

        boolean heTratadoElCero = false;
        int posArraySinDuplicados = 0;
        int[] arraySinDuplicados = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && !heTratadoElCero) {
                posArraySinDuplicados++;
                heTratadoElCero = true;
                continue;
            }
            if (!contieneElemento(arraySinDuplicados, array[i])) {
                arraySinDuplicados[posArraySinDuplicados++] = array[i];
            }
        }

        return Arrays.copyOf(arraySinDuplicados, posArraySinDuplicados);
    }
}
