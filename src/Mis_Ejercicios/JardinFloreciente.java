package Mis_Ejercicios;

public class JardinFloreciente {

    static final int[][] JARDIN = {
            {1, 0, 0, 0, 1, 0, 0, 0, 2, 1, 1, 0, 0, 5, 0},
            {0, 2, 0, 5, 0, 0, 3, 0, 1, 0, 0, 0, 1, 0, 0},
            {3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 4},
            {0, 0, 2, 0, 0, 0, 0, 0, 2, 1, 3, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 3},
            {4, 3, 0, 0, 0, 2, 1, 0, 0, 0, 0, 5, 0, 0, 0},
            {1, 2, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
            {3, 0, 0, 0, 0, 0, 2, 1, 4, 0, 0, 0, 1, 0, 0},
            {2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0},
            {0, 0, 5, 1, 0, 0, 0, 5, 0, 3, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 2, 4, 0},
            {0, 0, 1, 3, 0, 0, 1, 0, 0, 1, 0, 0, 1, 3, 0},
            {0, 1, 2, 1, 0, 0, 0, 0, 0, 2, 3, 1, 0, 0, 1},
            {1, 3, 4, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 4, 2}
    };

    public static void main(String[] args) {

        for (int i = 0; i < JARDIN.length; i++) {
            for (int j = 0; j < JARDIN[i].length; j++) {
                if (hayFlor(i, j) && hayAgua(i, j) && hayAbeja(i, j) && (!hayMalaHierba(i, j) || hayGusano(i, j))) {
                    System.out.println("la flor de la posicion " + i + "," + j + " florecerá");
                }
            }
        }
    }

    private static boolean hayFlor(int fila, int columna) {
        if (JARDIN[fila][columna] == 1) {
            return true;
        }

        return false;
    }

    private static boolean hayAgua(int fila, int columna) {

        for (int k = fila - 1; k <= fila + 1; k++) {
            for (int l = columna - 1; l <= columna + 1; l++) {
                if (k == fila && l == columna) {
                    continue;
                }
                if (k >= 0 && k < JARDIN.length && l >= 0 && l < JARDIN[0].length) {
                    if (JARDIN[k][l] == 2) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean hayAbeja(int fila, int columna) {

        for (int k = fila - 3; k <= fila + 3; k++) {
            for (int l = columna - 3; l <= columna + 3; l++) {
                if (k == fila && l == columna) {
                    continue;
                }
                if (k >= 0 && k < JARDIN.length && l >= 0 && l < JARDIN[0].length) {
                    if (JARDIN[k][l] == 5) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean hayGusano(int fila, int columna) {

        for (int k = fila - 1; k <= fila + 1; k++) {
            for (int l = columna - 1; l <= columna + 1; l++) {
                if (k == fila && l == columna) {
                    continue;
                }
                if (k >= 0 && k < JARDIN.length && l >= 0 && l < JARDIN[0].length) {
                    if (JARDIN[k][l] == 4) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean hayMalaHierba(int fila, int columna) {

        for (int k = fila - 1; k <= fila + 1; k++) {
            for (int l = columna - 1; l <= columna + 1; l++) {
                if (k == fila && l == columna) {
                    continue;
                }
                if (k >= 0 && k < JARDIN.length && l >= 0 && l < JARDIN[0].length) {
                    if (JARDIN[k][l] == 3) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
