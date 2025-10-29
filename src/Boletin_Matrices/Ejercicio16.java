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

        MiEntradaSalida.imprimirMatriz(matrizCuentaAdyadcentesPares(matriz));
    }

    private static int[][] matrizCuentaAdyadcentesPares(int[][] matriz) {

        int[][] matrizCuentaAdyadcentesPares = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizCuentaAdyadcentesPares[i][j] = adyadcenciaPares(matriz, i, j);
            }
        }

        return matrizCuentaAdyadcentesPares;
    }

    /**
     * Metodo que recorre las casillas adyadcentes a la posicion de una matriz y comprueba si es par
     *
     * @param matriz la matriz con la que se trabaja
     * @param i      el indice de las filas de la matriz
     * @param j      el indice que representa las columnas de la matriz
     * @return cuantas posiciones adyadcentes pares tiene una casilla
     */
    private static int adyadcenciaPares(int[][] matriz, int i, int j) {

        int contadorPares = 0;

        for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
                if (k == 0 && l == 0) {
                    continue; //salto la casilla para que no se compare consigo misma
                }
                if (k + i >= 0 && k + i < matriz.length && l + j >= 0 && l + j < matriz[0].length) { //verifico que esté dentro del tablero
                    if (matriz[k + i][l + j] % 2 == 0) {
                        contadorPares++;
                    }
                }
            }
        }

        return contadorPares;
    }


    /**
     * Metodo que verifica que una matriz sea regular, es decir, las filas tengan la misma longitud, y las columnas
     * tambien.
     *
     * @param matriz la matriz con la que se trabaja
     * @return {@code true} si cumple los requisitos, {@code false} si las longitudes no son iguales
     * o la longitud de las filas es 0
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
