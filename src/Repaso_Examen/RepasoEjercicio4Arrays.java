package Repaso_Examen;

import utils.MiEntradaSalida;

public class RepasoEjercicio4Arrays {

    static final int CANTIDAD_ALEATORIOS = 6000;

    public static void main(String[] args) {

        int[] arrayDeAleatorios = new int[CANTIDAD_ALEATORIOS];

        for (int i = 0; i < arrayDeAleatorios.length; i++) {
            arrayDeAleatorios[i] = MiEntradaSalida.generaAleatorioEntre(0, 100, true);
        }

        double media = media(arrayDeAleatorios);
        int digitoMasTerminado = ultimoDigitoMasTerminado(arrayDeAleatorios);

        System.out.printf("La media total del array es %.2f%n ", media);
        System.out.println("El digito en el que mas numeros terminan es " + digitoMasTerminado);
        ultimoDigitoNoTerminado(arrayDeAleatorios);
        vecesQueSeRepiteElUltimoDigito(arrayDeAleatorios);
    }

    private static double media(int[] array) {

        int totalSuma = 0;
        for (int i = 0; i < array.length; i++) {
            totalSuma += array[i];
        }

        return (double) totalSuma / CANTIDAD_ALEATORIOS;
    }

    private static int[] contarUltimosDigitos(int[] array) {

        int[] contadores = new int[10];

        for (int i = 0; i < array.length; i++) {
            int ultimoDigito = array[i] % 10;
            contadores[ultimoDigito]++;
        }

        return contadores;
    }

    private static int ultimoDigitoMasTerminado(int[] array) {

        int[] ultimosDigitos = contarUltimosDigitos(array);

        // 1. Inicialización clara
        int ultimoDigitoMasRepetido = 0;              // Esta variable guardará el resultado (el dígito 0-9)

        // 2. Búsqueda
        for (int i = 1; i < ultimosDigitos.length; i++) {
            // Comparamos siempre FRECUENCIAS
            if (ultimosDigitos[i] > ultimosDigitos[0]) {
                ultimosDigitos[0] = ultimosDigitos[i];  // Si es mayor, actualizamos la FRECUENCIA MÁXIMA
                ultimoDigitoMasRepetido = i;                 // Y guardamos el DÍGITO (el índice i)
            }
        }

        return ultimoDigitoMasRepetido; // Devolvemos el dígito
    }

    private static void ultimoDigitoNoTerminado(int[] array) {

        int[] ultimosDigitos = contarUltimosDigitos(array);

        for (int i = 0; i < ultimosDigitos.length; i++) {
            if (ultimosDigitos[i] == 0) {
                System.out.println("con el digito " + i + " no termina ningun numero");
            }
        }
    }

    private static void vecesQueSeRepiteElUltimoDigito(int[] array) {

        int[] ultimosDigitos = contarUltimosDigitos(array);

        for (int i = 0; i < ultimosDigitos.length; i++) {
            double porcentajeRepeticion = (double) ultimosDigitos[i] * 100 / CANTIDAD_ALEATORIOS;
            System.out.printf("con el digito %d terminan %d numeros, lo que equivale a un %.2f%% del total \n ", i, ultimosDigitos[i], porcentajeRepeticion);
        }
    }
}
