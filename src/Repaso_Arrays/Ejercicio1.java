package Repaso_Arrays;

public class Ejercicio1 {

    //🚀 Ejercicio de Programación Avanzado
    //Crea una función recursiva en tu lenguaje de programación preferido que, dado un array (o lista) de enteros, calcule la suma de todos los elementos que cumplan dos condiciones simultáneamente:
    //
    //Su valor es un número par.
    //
    //Su índice (posición) en el array es un número impar (asumiendo que el índice comienza en 0).

    public static void main(String[] args) {

        int[] array = {1, 6, 3, 8, 4, 10, 5};

        System.out.println(sumaIndicesImparesYValoresPares(array));
    }

    private static boolean indiceImpar(int elemento) {

        return elemento % 2 == 0;
    }

    private static boolean valorPar(int elemento) {

        return elemento % 2 == 0;
    }

    private static int sumaIndicesImparesYValoresPares(int[] array) {

        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            if (!indiceImpar(i) && valorPar(array[i])) {
                suma += array[i];
            }
        }

        return suma;
    }
}
