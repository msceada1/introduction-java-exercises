package Boletin_Matrices;

import utils.MiEntradaSalida;

public class Ejercicio14 {

    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3, 12}, {1, 2, 6, 7}, {3, 4, 5, 6}, {1, 2, 3, 4}};

        System.out.println("la matriz original es : ");
        MiEntradaSalida.imprimirMatriz(matriz);

        System.out.println("la matriz trnasformada es : ");
        MiEntradaSalida.imprimirMatriz(transformaMatriz(matriz));
    }

    private static int[][] transformaMatriz(int[][] matriz) {

        int[][] matrizTransformada = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTransformada[i][j] = matriz[j][i];
            }
        }

        return matrizTransformada;
    }
}
