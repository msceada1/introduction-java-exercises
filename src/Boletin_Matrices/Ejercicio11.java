package Boletin_Matrices;

public class Ejercicio11 {

    public static void main(String[] args) {

        int[][] matriz1 = {{5, 8, 9, 0}, {4, 7, 5, 2}, {1, 7, 3, 2}};
        int[][] matriz2 = {{2, 3, 7, 1}, {2, 5, 7, 4}, {0, 9, 8, 5}};

        if (esInversa(matriz1, matriz2)) {
            System.out.println("las matrices son inversas");
        } else {
            System.out.println("las matrices no son inversas");
        }
    }

    /**
     * metodo que verifica si la primera matriz e igual que la segunda pero a la inversa.
     *
     * @param matriz1 la primera matriz que se compara con la segunda.
     * @param matriz2 la segunda matriz que se compara con la primera.
     * @return {@code false} si no cumple el metodo mismas dimensiones o si los elementos de las dos matrices
     * no son iguales de la forma transpuesta, {@code true} si las matrices son iguales de forma transpuesta
     */
    private static boolean esInversa(int[][] matriz1, int[][] matriz2) {

        if (tieneMismasDimensiones(matriz1, matriz2)) {
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    if (matriz1[i][j] != matriz2[matriz1.length - 1 - i][matriz2[i].length - 1 - j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        return false;
    }

    /**
     * Metodo que compruba que las simensiones de las matrices sean correctas, averiguando que sean iguales
     * o que la longitud no sea 0
     *
     * @param matriz1 la matriz que se se compara y analiza con la segunda matriz
     * @param matriz2 la matriz que se compara y analiza con la primera matriz
     * @return {@code false} si las longitudes son 0 o diferentes entre las dos matrices, {@code true} en caso contrario
     */
    private static boolean tieneMismasDimensiones(int[][] matriz1, int[][] matriz2) {

        if (matriz1.length == 0 || matriz2.length == 0) { //compruebo que las longitudes no sean 0
            return false;
        }

        //compruebo que el numero de filas sea iguales
        if (matriz1.length != matriz2.length) {
            return false;
        }

        //itero sobre cada columna para ver si alguna es diferente
        for (int i = 0; i < matriz1.length; i++) {
            if (matriz1[i].length != matriz2[i].length) {
                return false;
            }
        }

        return true;
        
    }
}
