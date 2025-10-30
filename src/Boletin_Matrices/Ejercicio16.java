package Boletin_Matrices;

import utils.MiEntradaSalida;

public class Ejercicio16 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };

        MiEntradaSalida.imprimirMatriz(devuelveCantidadDeColindantesPares(matriz));
    }

    /**
     * Metodo crea una matriz cuyo valor de cada posicion esta basado en la cantidad de casillas adyadcentes pares que
     * tiene
     *
     * @param matriz la matriz con la que se trabaja
     * @return una matriz representando la cantidad de adyadcentes pares de una posicion
     */
    private static int[][] devuelveCantidadDeColindantesPares(int[][] matriz) {

        int[][] matrizCantidadColindantesPares = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizCantidadColindantesPares[i][j] = adyadcentesPares(matriz, i, j);
            }
        }

        return matrizCantidadColindantesPares;
    }

    /**
     * Metodo que accede a las posiciones adyadcentes de una matriz y comprueba cuales son par.
     *
     * @param matriz  la matriz con la que se trabaja
     * @param fila    el indice de las filas
     * @param columna el indice de las columnas
     * @return el contador de cuantas casillas adyadcentes pares tiene una casilla
     */
    private static int adyadcentesPares(int[][] matriz, int fila, int columna) {

        int contadorPares = 0;

        for (int k = fila - 1; k <= fila + 1; k++) {
            for (int l = columna - 1; l <= columna + 1; l++) {
                if (k == fila && l == columna) { //no se analiza a si misma
                    continue;
                }
                if (k >= 0 && k < matriz.length && l >= 0 && l < matriz[0].length) { //verifico que este dentro del rango
                    if (matriz[k][l] % 2 == 0) {
                        contadorPares++;
                    }
                }
            }
        }

        return contadorPares;
    }

    /**
     * Metodo que verifica si una matriz tiene mismo tamaño de filas y de columnas
     *
     * @param matriz la matriz con la que se trabaja
     * @return {@code true} si cumple los requsitos, {@code false} si no cumple los requisitos
     */
    private static boolean esRegular(int[][] matriz) {

        if (matriz.length == 0) {
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i].length != matriz[0].length) {
                    return false;
                }
            }
        }

        return true;
    }
}
