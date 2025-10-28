package Boletin_Matrices;

import utils.MiEntradaSalida;

public class Ejercicio9 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 5, 6}, {4, 2, 0, 8}, {4, 2, 0, 8}, {1, 3, 5, 6}};

        if (simetriaEjeX(matriz)) {
            System.out.println("la matriz : ");
            MiEntradaSalida.imprimirMatriz(matriz);
            System.out.println("es simetrica");
        } else {
            System.out.println("la matriz : ");
            MiEntradaSalida.imprimirMatriz(matriz);
            System.out.println("no es simetrica");
        }

    }

    /**
     * Metodo que comprobara si una matriz es simetrica en base al eje X.
     *
     * @param matriz la matriz a evaluar
     * @return {@code false} si no es simetrica o {@code true} si es simetrica.
     */
    private static boolean simetriaEjeX(int[][] matriz) {

        if (esRegular(matriz)) {
            for (int i = 0; i < matriz.length / 2; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] != matriz[matriz.length - 1 - i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        return false;
    }

    /**
     * Metodo que comprueba si una matriz es regular. Ayudrara a tratar el error IndexOutBoundsException, comprobando
     * las longitudes.
     *
     * @param matriz la matriz a evaluar
     * @return {@code false} si la matriz está  vacía o si posee de filas con longitudes diferentes y
     * {@code true} si es regular.
     */
    private static boolean esRegular(int[][] matriz) {

        if (matriz.length == 0) { // manejo de una matriz vacía
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length != matriz[0].length) { //manejo de longitudes
                return false;
            }
        }

        return true;
    }
}
