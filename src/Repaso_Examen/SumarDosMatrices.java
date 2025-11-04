package Repaso_Examen;

import utils.MiEntradaSalida;

public class SumarDosMatrices {

    public static void main(String[] args) {

        int[][] matriz1 = {
                {1, 2, 3},
                {3, 4, 5},
                {2, 3, 7}
        };
        int[][] mariz2 = {
                {4, 5, 6},
                {1, 1, 1},
                {9, 8, 4}
        };

        if (!matricesConMismasDimensiones(matriz1, mariz2)) {
            System.out.println("las matrices no tienen las mismas dimensiones, no se pueden sumar");
        } else {
            MiEntradaSalida.imprimirMatriz(sumaMatrices(matriz1, mariz2));
        }

    }

    private static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {

        int[][] matrizSumada = new int[matriz1.length][matriz1[0].length];

        if (matricesConMismasDimensiones(matriz1, matriz2)) {
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz2.length; j++) {
                    matrizSumada[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
        }

        return matrizSumada;
    }

    private static boolean matricesConMismasDimensiones(int[][] matriz1, int[][] matriz2) {

        if (matriz1.length != matriz2.length) {
            return false;
        }

        for (int i = 0; i < matriz1.length; i++) {
            if (matriz1[i].length != matriz2[i].length) {
                return false;
            }
        }

        return true;

    }
}
