package Repaso_Examen;

import utils.MiEntradaSalida;

public class RepasoArraysEjercicio3 {

    public static void main(String[] args) {

        int longitudArray = MiEntradaSalida.leerEnteroPositivoMayorQueCero("cuantos elementos tiene el array?");
        int[] array = new int[longitudArray];
        double media = media(array);
        int numMayor = numeroMayor(array);
        int numMenor = numeroMenor(array);
        int repeticionNumMayor = cuentaVecesRepetidasNumMayor(array);
        int repeticionNumMenor = cuentaVecesRepetidasNumMenor(array);

        for (int i = 0; i < array.length; i++) {
            int numero = MiEntradaSalida.leerEntero("Introduce el numero en la posicion " + (i + 1));
            array[i] = numero;
        }

        System.out.println("La media de los numeros es " + media);
        System.out.println();
        System.out.println("el numero mayor es " + numMayor + " y se repite " + repeticionNumMayor + " veces");
        System.out.println("el numero menor es " + numMenor + " y se repite " + repeticionNumMenor + " veces");
    }

    /**
     * Metodo que comprueba cual es el numero mayor de un array
     *
     * @param array el array con el que se trabaja
     * @return el numero mayor del array
     */
    private static int numeroMayor(int[] array) {

        int numMayor = 0;

        for (int i = 0; i < array.length; i++) {
            if (numMayor < array[i]) {
                numMayor = array[i];
            }
        }

        return numMayor;
    }

    /**
     * Metodo que comprueba cual es el numero menor de un array
     *
     * @param array el array con el que se trabaja
     * @return el numero menor del array
     */
    private static int numeroMenor(int[] array) {

        int numMenor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (numMenor > array[i])
                numMenor = array[i];
        }

        return numMenor;
    }

    /**
     * Metodo que hace la media de todos los elementos de un array
     *
     * @param array el array con el que se trabaja
     * @return la media de los numeros del array
     */
    private static double media(int[] array) {

        int sumaTotalElementos = 0;

        for (int i = 0; i < array.length; i++) {
            sumaTotalElementos += array[i];
        }

        return (double) sumaTotalElementos / array.length;
    }

    /**
     * metodo que comprueba cuantas veces se repite el numero menor
     *
     * @param array el array con el que se trabaja
     * @return las veces que se repite el numero menor
     */
    private static int cuentaVecesRepetidasNumMenor(int[] array) {

        int contador = array[0];
        int numeroMenor = numeroMenor(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroMenor) {
                contador++;
            }
        }

        return contador;
    }

    /**
     * metodo que comprueba cuantas veces se repite el numero mayor
     *
     * @param array el array con el que se trabaja
     * @return las veces que se repite el numero mayor
     */
    private static int cuentaVecesRepetidasNumMayor(int[] array) {

        int contador = 0;
        int numMayor = numeroMayor(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numMayor) {
                contador++;
            }
        }

        return contador;
    }
}
