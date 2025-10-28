package Mis_Ejercicios;

import utils.MiEntradaSalida;

public class CompruebaSimetriaFormaMatematicaClasica {

    public static void main(String[] args) {

        int[][] matrizSimetrica = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        int[][] matrizCuadradaNoSimetrica = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizRectangular = {{11, 12, 13}, {14, 15, 16}};

        System.out.println("comprobación de las matrices");

        System.out.println("=====================================");

        MiEntradaSalida.imprimirMatriz(matrizSimetrica);

        if (compruebaSimetria(matrizSimetrica)) {
            System.out.println("la matriz 1 es simetrica");
        } else {
            System.out.println("la matriz 1 no es simetrica");
        }

        System.out.println("=====================================");

        MiEntradaSalida.imprimirMatriz(matrizCuadradaNoSimetrica);

        if (compruebaSimetria(matrizCuadradaNoSimetrica)) {
            System.out.println("la matriz 2 es simetrica");
        } else {
            System.out.println("la matriz 2 no es simetrica");
        }

        System.out.println("=====================================");

        MiEntradaSalida.imprimirMatriz(matrizRectangular);

        if (compruebaSimetria(matrizRectangular)) {
            System.out.println("la matriz 3 es simetrica");
        } else {
            System.out.println("la matriz 3 no es simetrica");
        }
    }

    /**
     * Metodo que comprueba si la matriz es simétrica, verificando antes que sea cuadrada llamando al metodo
     * esCuadrada.
     *
     * @param matriz la matriz a evaluar
     * @return {@code false} si no es simetrica {@code true} si es simetrica
     */
    private static boolean compruebaSimetria(int[][] matriz) {

        if (esCuadrada(matriz)) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] != matriz[j][i]) {
                        return false;
                    }
                }
            }
            return true;
        }

        return false;
    }

    /**
     * metodo que comprueba si una matriz es cuadrada. Maneja el error IndexOutOfBoundsException
     * comprobando primero si la longitud de la matriz es 0.
     *
     * @param matriz la matriz que se evalua
     * @return {@code true} si es cuadrada {@code false} en caso contrario
     */
    private static boolean esCuadrada(int[][] matriz) {

        if (matriz.length == 0) { //comparacion que maneja el error IndexOutBoundsException
            return false;
        }

        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i].length != matriz[0].length) { //manejo de longitudes
                return false;
            }
        }

        if (matriz.length != matriz[0].length) {
            return false;
        }

        return true;
    }
}
