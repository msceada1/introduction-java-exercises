package Repaso_Examen;

import java.util.Arrays;

public class SumaDosArrays {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {4, 3, 2};

        System.out.println(Arrays.toString(sumaArrays(array1, array2)));

    }

    private static int[] sumaArrays(int[] array1, int[] array2) {

        int[] arraySuma;

        if (mismasLongitudes(array1, array2)) {
            arraySuma = new int[array1.length];
        } else {
            arraySuma = new int[longitudMayor(array1, array2)];
        }

        for (int i = 0; i < arraySuma.length; i++) {
            if (i < longitudMenor(array1, array2)) {
                arraySuma[i] = array1[i] + array2[i];
            } else {
                arraySuma[i] = obtenerArrayMasLargo(array1, array2)[i];
            }
        }

        return arraySuma;
    }


    /**
     * Metodo que comprueba que los arrays sumados tengan la misma longitud
     *
     * @param array1 el primer array que se suma con el segundo
     * @param array2 el segundo array que se suma con el primero
     * @return {@code true} si tienen las mismas ongitudes, {@code false} en caso contrario
     */
    private static boolean mismasLongitudes(int[] array1, int[] array2) {
        return array1.length == array2.length;
    }

    /**
     * Metodo que comprueba que array tiene mayor longitud, devolviendo la longitud del mayor, o si son iguales,
     * la longitud de cualquiera de los dos
     *
     * @param array1 el primer array con el que se trabaja
     * @param array2 el segundo array con el que se trabaja
     * @return la longitud del array mas largo
     */
    private static int longitudMayor(int[] array1, int[] array2) {

        return Math.max(array1.length, array2.length);

    }

    /**
     * Metodo que comprueba que array tiene menor longitud, devolviendo la longitud del menor, o si son iguales,
     * la longitud de cualquiera de los dos
     *
     * @param array1 el primer array con el que se trabaja
     * @param array2 el segundo array con el que se trabaja
     * @return la longitud del array mas chico
     */
    private static int longitudMenor(int[] array1, int[] array2) {

        return Math.min(array1.length, array2.length);

    }

    /**
     * Metodo que me devuelve el array que tiene mayor longitud
     *
     * @param array1 el primer array con el que se trabaja
     * @param array2 el segundo array con el que se trabaja
     * @return el array que sea de mayor tamaño
     */
    private static int[] obtenerArrayMasLargo(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            return array1;
        }
        return array2;
    }
}
