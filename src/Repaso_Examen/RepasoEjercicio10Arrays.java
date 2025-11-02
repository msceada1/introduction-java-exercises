package Repaso_Examen;

import java.util.Arrays;

public class RepasoEjercicio10Arrays {

    //Crea un array que devuelva un nuevo array donde se hayan eliminado los elementos
    //duplicados del primero

    public static void main(String[] args) {

        int[] array = {1, 3, 4, 3, 5, 6, 7, 1, 9, 4, 12, 16, 5, 4, 3, 11, 12, 20, 0, 0, 0};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(eliminaDuplicados(array)));
    }

    private static int[] eliminaDuplicados(int[] array) {

        int[] arraySinDuplicados = new int[array.length];
        int posArraysSinDuplicados = 0;
        boolean heTratadoElCero = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && !heTratadoElCero) {
                posArraysSinDuplicados++;
                heTratadoElCero = true;
                continue;
            }
            if (!contieneElemento(arraySinDuplicados, array[i])) {
                arraySinDuplicados[posArraysSinDuplicados++] = array[i];
            }
        }

        arraySinDuplicados = Arrays.copyOf(arraySinDuplicados, posArraysSinDuplicados);

        return arraySinDuplicados;

    }

    private static boolean contieneElemento(int[] array, int elemento) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return true;
            }
        }

        return false;
    }
}
