package Repaso_Examen;

public class JardinFloreciente {

    static final int SEMILLA = 1;
    static final int AGUA = 2;
    static final int ABEJA = 5;
    static final int MALA_HIERBA = 3;
    static final int GUSANO = 4;

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

        for (int i = 0; i < jardin.length; i++) {
            for (int j = 0; j < jardin[i].length; j++) {
                if (florecera(jardin, i, j)) {
                    System.out.println("la poscion " + i + " " + j + " florecera");
                }
            }
        }
    }

    private static boolean haySemilla(int[][] jardin, int i, int j) {

        if (jardin[i][j] != SEMILLA) {
            return false;

        }

        return true;
    }

    private static boolean contieneElemento(int[][] jardin, int i, int j, int elemento) {

        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k == i && l == j) {
                    continue;
                }
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == elemento) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean hayAgua(int[][] jardin, int i, int j) {

        return contieneElemento(jardin, i, j, AGUA);
    }

    private static boolean hayAbeja(int[][] jardin, int i, int j) {

        for (int k = i - 3; k <= i + 3; k++) {
            for (int l = j - 3; l <= j + 3; l++) {
                if (k == i && l == j) {
                    continue;
                }
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == ABEJA) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean hayGusano(int[][] jardin, int i, int j) {

        return contieneElemento(jardin, i, j, GUSANO);
    }

    private static boolean hayMalaHierba(int[][] jardin, int i, int j) {

        return contieneElemento(jardin, i, j, MALA_HIERBA);
    }

    private static boolean florecera(int[][] jardin, int i, int j) {

        return haySemilla(jardin, i, j) && hayAgua(jardin, i, j) && hayAbeja(jardin, i, j) && (!hayMalaHierba(jardin, i, j) || hayMalaHierba(jardin, i, j) && hayGusano(jardin, i, j));
    }
}
