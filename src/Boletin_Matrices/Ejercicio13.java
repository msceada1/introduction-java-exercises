package Boletin_Matrices;

public class Ejercicio13 {

    public static void main(String[] args) {

    }

    private static int[][] transformaDiagonalArribaIzquierdaAbajoDerecha(int[][] matriz) {

        int[][] matrizTransformada = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTransformada[i][j] = matriz[j][matriz.length - 1 - i];
            }
        }

        return matrizTransformada;
    }

    /**
     * Metodo que comprueba que una matriz sea cuadrada, comparando las longitudes de filas y columnas y verificando
     * que la longitud no sea 0
     *
     * @param matriz la matriz con la que se trabaja
     * @return {@code false} si no cumple las propiedades, {@code true} si las cumple
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
