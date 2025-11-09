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
}
