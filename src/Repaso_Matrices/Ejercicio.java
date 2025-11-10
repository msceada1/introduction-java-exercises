package Repaso_Matrices;

import utils.MiEntradaSalida;

public class Ejercicio {

    public static void main(String[] args) {

        int[][] matriz1 = {
                {1, 2, 3},
                {4, -5, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = {
                {1, 2, 3},
                {4, -5, 6},
                {7, 8, 9}
        };

        int[][] matriz3 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };

        MiEntradaSalida.imprimirMatriz(matrizDeAdyadcentesPares(matriz3));
/*
        imprimeMatrizPorFilasALaInversa(matriz1);
        System.out.println();
        imprimeMatrizPorColumnasALaInversa(matriz1);
        System.out.println();
        System.out.println(matricesIguales(matriz1, matriz2));

 */

   /*     if (!mismasLongitudes(matriz1, matriz2)) {
            System.out.println("Matrices con dimensiones diferentes no pueden ser sumadas");
        } else {
            MiEntradaSalida.imprimirMatriz(sumaDeMatrices(matriz1, matriz2));
        }

    */


    }

    private static boolean contieneNegativo(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    return true;
                }
            }
        }

        return false;
    }

    private static int sumaPosicionesMatriz(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
    }

    private static void imprimeMatrizPorFilas(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
        }
    }

    private static void imprimeMatrizPorColumnas(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
        }
    }

    private static void imprimeMatrizPorFilasALaInversa(int[][] matriz) {

        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    private static void imprimeMatrizPorColumnasALaInversa(int[][] matriz) {

        for (int j = matriz[0].length - 1; j >= 0; j--) {
            for (int i = matriz.length - 1; i >= 0; i--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    private static boolean matricesIguales(int[][] matriz1, int[][] matriz2) {

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1.length != matriz2.length || matriz1[i].length != matriz2[i].length || matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean mismasLongitudes(int[][] matriz1, int[][] matriz2) {

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

    private static int[][] sumaDeMatrices(int[][] matriz1, int[][] matriz2) {

        int[][] matizSuma = new int[matriz1.length][matriz1[0].length];

        if (mismasLongitudes(matriz1, matriz2)) {
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    matizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
        }

        return matizSuma;
    }

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

    private static int[][] matrizDeAdyadcentesPares(int[][] matriz) {

        int[][] matrizCuentaAdyadcentesPares = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizCuentaAdyadcentesPares[i][j] = cuentaAdyadcentesPares(matriz, i, j);
            }
        }

        return matrizCuentaAdyadcentesPares;
    }

    private static int cuentaAdyadcentesPares(int[][] matriz, int i, int j) {

        int contador = 0;

        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k == i && l == j) {
                    continue;
                }
                if (k >= 0 && k < matriz.length && l >= 0 && l < matriz[0].length) {
                    if (esPar(matriz[k][l])) {
                        contador++;
                    }
                }
            }
        }

        return contador;
    }

    private static boolean esPar(int elemento) {

        if (elemento % 2 == 0) {
            return true;
        }

        return false;
    }
}
