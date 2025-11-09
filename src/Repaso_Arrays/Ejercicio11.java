package Repaso_Arrays;

import java.util.Arrays;

public class Ejercicio11 {

    public static void main(String[] args) {

        int[] array1 = {1, 4, 7, 9, 12, 15, 3, 12, 1, 12, 0};
        int[] array2 = {1, 1, 12, 4, 23, 15, 23, 0, 0};

        System.out.println(Arrays.toString(arrayDeValoresComunes(array1, array2)));
    }

    private static boolean contieneElemento(int[] array, int elemento) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return true;
            }
        }

        return false;
    }

    private static int[] arrayDeValoresComunes(int[] array1, int[] array2) {

        int posArrayDeDuplicados = 0;
        int[] arrayDeValoresComunes = new int[Math.min(array1.length, array2.length)];

        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            if (contieneElemento(array2, array1[i]) && !contieneElemento(arrayDeValoresComunes, array2[i])) {
                arrayDeValoresComunes[posArrayDeDuplicados++] = array1[i];
            }
        }

        return Arrays.copyOf(arrayDeValoresComunes, posArrayDeDuplicados);
    }
}
