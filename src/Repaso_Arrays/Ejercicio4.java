package Repaso_Arrays;

import utils.MiEntradaSalida;

public class Ejercicio4 {

    /*
    4. Soluciona el siguiente problema del anterior boletín utilizando arrays. Crea un
    programa que cree 6000 números aleatorios de 0 a 100 (usa una constante para fijar
    este número).
    Muestra:
     La media de los números leídos.
     El dígito en el que más números terminan.
     En qué dígitos no ha terminado ningún número.
     Cuántos números terminan en cada uno de los dígitos (0 .. 9).
     Calcula a qué % del total de números creados equivale cada elemento del
     punto anterior.
     */

    static final int CANTIDAD_ALEATORIOS = 6000;

    public static void main(String[] args) {

        int[] array = new int[CANTIDAD_ALEATORIOS];

        for (int i = 0; i < array.length; i++) {
            int numRandom = MiEntradaSalida.generaAleatorio(100);
            array[i] = numRandom;
        }

        System.out.printf("La media de los arrays es %.2f ", media(array));
        System.out.println();
        System.out.println("el digito " + ultimoDigitoMasRepetido(array) + " es el digito con el que  mas numeros terminan");

        int[] arrayContadores = conteoUltimosDigitos(array);


        for (int i = 0; i < arrayContadores.length; i++) {
            if (arrayContadores[i] != 0) {
                double pordentaje = ((double) arrayContadores[i] / CANTIDAD_ALEATORIOS) * 100;
                System.out.printf("Con el numero %d terminan %d numeros, lo que euivale a un %.2f del total %n", i, arrayContadores[i], pordentaje);
            } else {
                System.out.println("con el digito " + i + " no termina ningun numero");
            }
        }
    }

    private static double media(int[] array) {

        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        return (double) suma / CANTIDAD_ALEATORIOS;
    }

    private static int[] conteoUltimosDigitos(int[] array) {

        int[] arrayDeContadores = new int[10];

        for (int i = 0; i < array.length; i++) {
            int ultimoDigito = array[i] % 10;
            arrayDeContadores[ultimoDigito]++;
        }

        return arrayDeContadores;
    }

    private static int ultimoDigitoMasRepetido(int[] array) {

        int[] contadores = conteoUltimosDigitos(array);
        int ultimoDigitoMasRepetido = contadores[0];
        int indice = 0;

        for (int i = 1; i < contadores.length; i++) {
            if (ultimoDigitoMasRepetido < contadores[i]) {
                ultimoDigitoMasRepetido = contadores[i];
                indice = i;
            }
        }

        return indice;
    }
}
