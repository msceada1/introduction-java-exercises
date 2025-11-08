package Repaso_Arrays;

public class Ejercicio2 {

    //Crea una función que, dado un array de enteros, detecte cuántos números negativos hay.
    // Sin embargo, debes implementar las siguientes restricciones:
    // Doble Condición: Solo debes contar los números negativos cuyo valor absoluto sea mayor o igual a 10
    // (es decir, $-10, -11, -12,$ etc.).

    public static void main(String[] args) {

        int[] array = {10, -5, -12, 0, 8, -9, -20, 15, -3, -11};

        System.out.println(conteoValoresAbsolutosMayorOIgualA10(array));
    }

    private static boolean valorAbsolutoMayorOIgualA10(int valor) {

        return Math.abs(valor) >= 10;
    }

    private static int conteoValoresAbsolutosMayorOIgualA10(int[] array) {

        int contador = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0 && valorAbsolutoMayorOIgualA10(array[i])) {
                contador++;
            }
        }

        return contador;
    }
}
