package Examen_2025_Arrays;

import utils.MiEntradaSalida;

import java.util.Arrays;

public class EncontrarParejas {

    public static void main(String[] args) {

        int[][] tablero = {

                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}

        };

        String[][] tableroOculto = {
                {"?", "?", "?", "?"},
                {"?", "?", "?", "?"},
                {"?", "?", "?", "?"},
                {"?", "?", "?", "?"}

        };

        int intentos = 6;

        int coordenadaX1 = MiEntradaSalida.leerEnteroEnRango("Introduce la coordenada X del primer valor ", 0, tablero.length - 1); // resto 1 a la longitud para que no se salga del limite, pues el indice es de 0 a 3

        int coordenadaY1 = MiEntradaSalida.leerEnteroEnRango("Introduce la coordenada Y del primer valor ", 0, tablero[0].length - 1);

        int coordenadaX2 = MiEntradaSalida.leerEnteroEnRango("Introduce la coordenada X del segundo valor ", 0, tablero.length - 1);

        int coordenadaY2 = MiEntradaSalida.leerEnteroEnRango("Introduce la coordenada Y del segundo valor ", 0, tablero[0].length - 1);

        while (coordenadaX1 == coordenadaX2 && coordenadaY1 == coordenadaY2) {
            System.out.println("no puedes introducir coordenadas iguales, hazlo de nuevo");
            coordenadaX2 = MiEntradaSalida.leerEnteroEnRango("Introduce la coordenada X del segundo valor ", 0, tablero.length - 1);
            coordenadaY2 = MiEntradaSalida.leerEnteroEnRango("Introduce la coordenada Y del segundo valor ", 0, tablero[0].length - 1);
        }

        while (intentos != 0) {
            if (casillaYaAcertada(tablero, coordenadaX1, coordenadaY1, coordenadaX2, coordenadaY2)) {
                System.out.println("estas casillas ya estan acertadas");
            } else if (!haAcertado(tablero, coordenadaX1, coordenadaY1, coordenadaX2, coordenadaY2)) {
                System.out.println("Los valores introducidos no son iguales");
                intentos--;
            } else {
                System.out.println("has acertado");
            }
        }
    }

    /**
     * Metodo que devuelve el valor de la primera casilla en base a las coordenadas que ha introducido el usuario
     *
     * @param tablero     el tablero con los valores
     * @param coordenadaX la coordenada de las filas que dicta el usuario
     * @param coordenadaY la coordenada de las columnas qie dicta el usuario
     * @return el valor de la casilla en base a las coordenadas
     */
    private static int valorPrimeraCasilla(int[][] tablero, int coordenadaX, int coordenadaY) {

        return tablero[0].length * coordenadaX + coordenadaY + 1;
    }

    /**
     * Metodo que devuelve el valor de la segunda casilla en base a las coordenadas que ha introducido el usuario
     *
     * @param tablero     el tablero con los valores
     * @param coordenadaX la coordenada de las filas que dicta el usuario
     * @param coordenadaY la coordenada de las columnas qie dicta el usuario
     * @return el valor de la casilla en base a las coordenadas
     */
    private static int valorSegundaCasilla(int[][] tablero, int coordenadaX, int coordenadaY) {

        return tablero[0].length * coordenadaX + coordenadaY + 1;
    }

    /**
     * Metodo que indica si el usuario ha acertado
     *
     * @param tablero      el tablero del juego
     * @param coordenadaX  la primera coordenada de la primera casilla
     * @param coordenadaY  la segunda coordenada de la primera casilla
     * @param coordenadaX2 la primera coordenada de la segunda casilla
     * @param coordenadaY2 la segunda coordenada de la segunda casilla
     * @return true si son igaules, false en caso contrario
     */
    private static boolean haAcertado(int[][] tablero, int coordenadaX, int coordenadaY, int coordenadaX2, int coordenadaY2) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (valorPrimeraCasilla(tablero, coordenadaX, coordenadaY) == valorSegundaCasilla(tablero, coordenadaX2, coordenadaY2)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Metodo que indica si las casillas que dicto el usuario estaban acertada anteriormente
     *
     * @param tablero      el tablero del juego
     * @param coordenadaX1 la primera coordenada de la primera casilla
     * @param coordenadaY1 la segunda coordenada de la primera casilla
     * @param coordenadaX2 la primera coordenada de la segunda casilla
     * @param coordenadaY2 la segunda coordenada de la segunda casilla
     * @return true si ya estaba acertada, false en caso contrario
     */
    private static boolean casillaYaAcertada(int[][] tablero, int coordenadaX1, int coordenadaY1, int coordenadaX2, int coordenadaY2) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (coordenadaX1 == coordenadaX2 && coordenadaY1 == coordenadaY2) {
                    return true;
                }
            }
        }

        return false;
    }

}
