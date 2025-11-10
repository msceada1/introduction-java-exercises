package Repaso_Matrices;

public class Jardin {

    static final int SEMILA = 1;
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
                if (jardin[i][j] == SEMILA && florece(jardin, i, j)) {
                    System.out.println("La posicion " + i + " , " + j + " florece");
                }
            }
        }
    }

    private static boolean contieneElemento(int[][] matriz, int fila, int columna, int rango, int elemento) {

        for (int i = fila - rango; i <= fila + rango; i++) {
            for (int j = columna - rango; j <= columna + rango; j++) {
                if (i == fila && columna == j) { //salto la posicion en la que estoy, solo se quieren evaluar las colindantes
                    continue;
                }
                if (i >= 0 && i < matriz.length && j >= 0 && j < matriz[0].length) { //manejo de los limites
                    if (matriz[i][j] == elemento) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean hayAgua(int[][] matriz, int fila, int columna) {
        return contieneElemento(matriz, fila, columna, 1, AGUA);
    }

    private static boolean hayAbeja(int[][] matriz, int fila, int columna) {
        return contieneElemento(matriz, fila, columna, 3, ABEJA);
    }

    private static boolean hayMalaHierba(int[][] matriz, int fila, int columna) {
        return contieneElemento(matriz, fila, columna, 1, MALA_HIERBA);
    }

    private static boolean hayGusano(int[][] matriz, int fila, int columna) {
        return contieneElemento(matriz, fila, columna, 1, GUSANO);
    }

    private static boolean florece(int[][] matriz, int fila, int columna) {

        return hayAgua(matriz, fila, columna) && hayAbeja(matriz, fila, columna) && (!hayMalaHierba(matriz, fila, columna) || hayMalaHierba(matriz, fila, columna) && hayGusano(matriz, fila, columna));
    }
}
