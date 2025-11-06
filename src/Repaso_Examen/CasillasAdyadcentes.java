package Repaso_Examen;

import utils.MiEntradaSalida;

public class CasillasAdyadcentes {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };

        System.out.println("La matriz original es :\n");
        MiEntradaSalida.imprimirMatriz(matriz);
        System.out.println("La matriz cuyos valores se basan en sus posiciones adyacentes pares es : \n");
        MiEntradaSalida.imprimirMatriz(matrizDeAdyadcentes(matriz));
    }

    private static int[][] matrizDeAdyadcentes(int[][] matriz) {

        int[][] matrizDeAdyadcentesPares = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizDeAdyadcentesPares[i][j] = cuentaAdyadcentesPares(matriz, i, j);
            }
        }

        return matrizDeAdyadcentesPares;
    }

    private static int cuentaAdyadcentesPares(int[][] matriz, int i, int j) {

        int contadorAdyadcentesPares = 0;

        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k == i && l == j) {
                    continue;
                }
                if (k >= 0 && k < matriz.length && l >= 0 && l < matriz[0].length) {
                    if (esPar(matriz[k][l])) {
                        contadorAdyadcentesPares++;
                    }
                }
            }
        }

        return contadorAdyadcentesPares;
    }

    private static boolean esPar(int elemento) {

        if (elemento % 2 == 0) {
            return true;
        }

        return false;
    }
}
