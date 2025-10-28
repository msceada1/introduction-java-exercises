package Boletin_Matrices;

import utils.MiEntradaSalida;

public class Ejercicio10 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 0, 3, 1}, {4, 2, 7, 2, 4}, {
                6, 1, 9, 1, 6}, {0, 8, 8, 8, 0}};

        System.out.println("la matriz : ");
        MiEntradaSalida.imprimirMatriz(matriz);

        System.out.println(esSiMetricaAlEjeY(matriz));
    }

    private static boolean esSiMetricaAlEjeY(int[][] matriz) {

        if (esRegular(matriz)) {
            for (int j = 0; j < matriz[0].length; j++) {
                for (int i = 0; i < matriz.length; i++) {
                    if (matriz[i][j] != matriz[i][matriz[0].length - 1 - j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        return false;
    }

    private static boolean esRegular(int[][] matriz) {

        if (matriz.length == 0) {
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length != matriz[0].length) {
                return false;
            }
        }

        return true;
    }
}
