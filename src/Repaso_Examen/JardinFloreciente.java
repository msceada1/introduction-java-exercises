package Repaso_Examen;

public class JardinFloreciente {

    static final int SEMILLA = 1;
    static final int AGUA = 2;
    static final int ABEJA = 5;
    static final int MALA_HIERBA = 3;
    static final int GUSANO = 3;

    public static void main(String[] args) {

        int[][] jardin = {
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
    }

    private static boolean haySemilla(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == SEMILLA) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean contieneElemento(int[][] matriz, int i, int j, int elemento) {

        for (int k = i - 1; k <= matriz.length + i; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k == i && l == j) {
                    continue;
                }
                if (k >= 0 && k < matriz.length && j >= 0 && j < matriz[0].length) {
                    if (matriz[k][j] == elemento) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean hayAgua(int[][] matriz, int i, int j) {

        if (contieneElemento(matriz, i, j, AGUA)) {
            return true;
        }

        return false;
    }

    private static boolean hayAbeja(int[][] matriz, int i, int j) {

        for (int k = i - 3; k <= i + 3; k++) {
            for (int l = j - 3; l <= j + 3; l++) {
                if (k == i && l == j) {
                    continue;
                }
                if (k >= 0 && k < matriz.length && l >= 0 && l < matriz[0].length) {
                    if (matriz[k][l] == ABEJA) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean hayMalaHierba(int[][] matriz, int i, int j, int elemento) {

        if (contieneElemento(matriz, i, j, MALA_HIERBA)) {
            return true;
        }

        return false;
    }

    private static boolean hayGusano(int[][] matriz, int i, int j) {

        if (contieneElemento(matriz, i, j, GUSANO)) {
            return true;
        }

        return false;
    }

}
