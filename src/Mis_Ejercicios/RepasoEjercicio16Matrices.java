package Mis_Ejercicios;

public class RepasoEjercicio16Matrices {

    public static void main(String[] args) {

    }
/*
    private static int[][] matrizAdyadcentesPares(int[][] matriz) {

        int[][] matrizDePares = new int[matriz.length][matriz[0].length];
        int contadorPares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

            }
        }
    }

 */
/*
    private static int matrizDeAdyadcencia(int i, int j) {

        for (int k = - 1; k < ; k++) {

        }
    }

 */

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
