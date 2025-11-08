package Repaso_Arrays;

import utils.MiEntradaSalida;

public class Ejercicio3 {

    /*
     Crea un programa que pregunte cuántos elementos tendremos en un array de
    enteros. Posteriormente se preguntarán tantos números como haya indicado el
    usuario. Posteriormente, mostraremos por pantalla el mayor, el menor y la media. Si
    el número mayor o menor están repetidos, deberá indicarse cuántas veces se repite.
    Por ejemplo:
    Introduzca las posiciones que tendrá el array: 5
    Introduzca el número 1: 4
    Introduzca el número 2: -1
    Introduzca el número 3: 9
    Introduzca el número 4: 5
    Introduzca el número 5: 9
    El mayor número introducido es 9 (se repite 2 veces)
    El menor número introducido es -1
    La media de los números introducidos es: 5.2
     */

    public static void main(String[] args) {

        int cantidadElementos = MiEntradaSalida.leerEnteroPositivoMayorQueCero("Introduce la longitud del array");
        int[] array = new int[cantidadElementos];

        for (int i = 0; i < array.length; i++) {
            int valor = MiEntradaSalida.leerEntero("Introduce el valor de la posicion " + (i + 1));
            array[i] = valor;
        }

        System.out.printf("la media de los arrays es %.2f", media(array, cantidadElementos));
    }

    private static double media(int[] array, int cantidad) {

        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        return (double) suma / cantidad;
    }

    private static int numeroMayor(int[] array) {

        int numeroMayor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > numeroMayor) {
                numeroMayor = array[i];
            }
        }

        return numeroMayor;
    }

    private static int numeroMenor(int[] array) {

        int numeroMenor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < numeroMenor) {
                numeroMenor = array[i];
            }
        }

        return numeroMenor;
    }

    private static int cuentaRepeticionesNumeroMayor(int[] array) {

        int numeroMayor = numeroMayor(array);
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroMayor) {
                contador++;
            }
        }

        return contador;
    }

    private static int cuentaVecesRepetidasNumeroMenor(int[] array) {

        int numeroMenor = numeroMenor(array);
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroMenor) {
                contador++;
            }
        }

        return contador;
    }
}
