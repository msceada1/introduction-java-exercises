package Boletin_Matrices;

public class Ejercicio16 {

    public static void main(String[] args) {

    }

    private static int[][] devuelveMatrizCasillasAdyadcentesPares(int[][] matriz) {

        int[][] matrizCasillasPares = new int[matriz.length][matriz[0].length];
        int contadorPares;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                contadorPares = 0; //reinicio el contador a 0 por cada posicion
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        if (k == 0 && l == 0) {
                            continue;
                        }
                        if (i + k >= 0 && i + k < matriz.length && j + l >= 0 && j + l < matriz[i].length) {
                            if (matriz[i + k][j + l] % 2 == 0) {
                                contadorPares++;
                            }
                        }
                    }
                }
                matrizCasillasPares[i][j] = contadorPares;
            }
        }

        return matrizCasillasPares;
    }

    /**
     * Metodo que comprueba si una matriz es regular, comprobando que las filas y las columnas tengan las
     * mismas longitudes
     *
     * @param matriz la matriz con las que se trabaja
     * @return {@code false} si la longitud es 0 o si las longitudes de las columnas son diferentes, {@code true} si
     * cumple con las propiedades correspondientes
     */
    private static boolean esRegular(int[][] matriz) {

        if (matriz.length == 0) {
            return false;   //compruebo que la longitud de la matriz no sea 0
        }

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length != matriz[0].length) { //comparo las longitudes de las columnas
                return false;
            }
        }

        return true;
    }
}
