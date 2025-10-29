package Mis_Ejercicios;

import utils.MiEntradaSalida;

public class RepasoEjercicio16Matrices {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };

        MiEntradaSalida.imprimirMatriz(matrizAdyadcentesPares(matriz));
    }

    /**
     * Metodo que devuelve una matriz cambiando el numero de una casilla por el numero de casillas adyadcentes pares
     * que tiene
     *
     * @param matriz La matriz con la que se trabaja
     * @return una matriz cuyo valor de cada posicion esta basado en las casillas adyadcentes pares que tiene cierta
     * casilla
     */
    private static int[][] matrizAdyadcentesPares(int[][] matriz) {

        int[][] matrizDePares = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizDePares[i][j] = matrizDeAdyadcencia(matriz, i, j);
            }
        }

        return matrizDePares;
    }

    /**
     * Metodo que accede a las casillas colindantes de la posicion de una matriz y comprueba que sean pares.
     *
     * @param matriz la matriz que se inspecciona
     * @param i      el indice de las filas de la matriz
     * @param j      el indice de las columnas de la matriz
     * @return la cantidad de casillas adyadcentes pares que tiene elrededor una posicion
     */
    private static int matrizDeAdyadcencia(int[][] matriz, int i, int j) {

        int contadorPares = 0;

        for (int k = -1; k <= 1; k++) { //fila de arriba y fila de abajo
            for (int l = -1; l <= 1; l++) { //columna de atras y de delante
                if (k == 0 && l == 0) {
                    continue;
                }
                if (k + i >= 0 && k + i < matriz.length && l + j >= 0 && l + j < matriz[0].length) { //dentro de los bordes
                    if (matriz[i + k][j + l] % 2 == 0) {
                        contadorPares++;
                    }
                }
            }
        }

        return contadorPares;
    }

    /**
     * Metodo que comprueba que una matriz tenga las mismas longitudes en filas y columnas
     *
     * @param matriz la matriz con la que se trabaja
     * @return {@code false} si no cumple los requisitos, {@code true} si cumple los requisitos
     */
    private static boolean esRegular(int[][] matriz) {

        if (matriz.length == 0) {
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[0].length != matriz[i].length) {
                return false;
            }
        }

        return true;
    }
}
