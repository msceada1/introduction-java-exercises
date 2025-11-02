package Repaso_Examen;

import utils.MiEntradaSalida;

public class PracticaAleatoriosArray {

    public static void main(String[] args) {

        int[] arrayAleatrios = {5, 10, 15, 20};

        System.out.println(tirarDado(arrayAleatrios));
    }

    /**
     * metodo que devuelve un numero aleatorio de un array
     *
     * @param posiblesResultados los resultados que puede devolver el numero aleatorio
     * @return un numero cualquiera del array de aleatorios
     */
    private static int tirarDado(int[] posiblesResultados) {

        int numAleatorio = MiEntradaSalida.generaAleatorioEntre(0, posiblesResultados.length - 1, true);
        return posiblesResultados[numAleatorio];
    }
}
