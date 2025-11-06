package Repaso_Examen;

public class SimetriaEjeX {

    public static void main(String[] args) {

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

    private static boolean esSimetricaAlEjeX(int[][] matriz) {

        if (esRegular(matriz)) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] != matriz[matriz.length - 1 - i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        return false;
    }
}
