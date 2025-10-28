package Boletin_Matrices;

import utils.MiEntradaSalida;

public class Ejercicio12 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {3, 2, 1, 4, 5}, {9, 8, 5, 6, 7}, {0, 8, 9, 5, 4}};

        System.out.println("La matriz original es : ");
        MiEntradaSalida.imprimirMatriz(matriz);

        System.out.println("La matriz en diagonal es : ");
        MiEntradaSalida.imprimirMatriz(transformaMatrizDiagonal(matriz));
    }

    /**
     * Metodo que convierte una matriz a otra en diagonal, es decir, cambiando el orden de su fila[i], columna[i]
     *
     * @param matriz la matriz con la que se trabaja
     * @return la matriz transpuesta en diagonal
     */
    private static int[][] transformaMatrizDiagonal(int[][] matriz) {

        int[][] matrizDiagonal = new int[matriz.length][matriz[0].length];

        if (esCuadrada(matriz)) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matrizDiagonal[i][j] = matriz[j][i];
                }
            }
        }

        return matrizDiagonal;
    }

    /**
     * Metodo que verifica que una matriz sea cuadrada, manejando y comparando las longitudes de filas y columnas
     *
     * @param matriz la matriz a evaluar
     * @return {@code false} si la longitud es 0 o el numero de filas no es igual al de columnas, {@code true}, si
     * cumple con las propiedades
     */
    private static boolean esCuadrada(int[][] matriz) {

        if (matriz.length == 0) {
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length != matriz[0].length) {
                return false;
            }
        }

        if (matriz.length != matriz[0].length) {
            return false;
        }

        return true;
    }
}
