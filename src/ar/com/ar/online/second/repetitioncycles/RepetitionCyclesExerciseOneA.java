package ar.com.ar.online.second.repetitioncycles;

import java.util.Scanner;

public class RepetitionCyclesExerciseOneA {

    public static void main(String[] args) {

        // definición de variables y sus respectivos tipos.
        // sumTotal igualada a cero para poder usarla, a ella se le suman el resto.

        int sumTotal = 0;

        // el vector es un int, cuyo nombre será "arrayNumbers" y que equivaldrá a un int con 10 elementos.
        int[] arrayNumbers = new int[10];

        // habilitación de entrada por teclado
        Scanner keyboard = new Scanner(System.in);

        // fori -> ya trae toda la estructura. El primero es desde donde comienza a contar i (desde 0)
        // i < nombredelarreglo.lenght para evitar confusiones. Puede ponerse un número pero no se recomienda.
        // i++ equivale a cuánto se va a sumar en cada ciclado. En este caso, +1.

        for (int i = 0; i < arrayNumbers.length; i++) {
            // Al solicitar con printf va a indicar en cada vuelta en qué parte del ciclo está. i siendo usada
            // para la posición en el vector.
            System.out.printf("Ingrese un número para la posición %d en el arreglo: ", i);
            // Indica que en cada vuelta el usuario va a introducir un número por teclado, previamente definido
            // con Scanner keyboard
            arrayNumbers[i] = keyboard.nextInt();
        }

        for (int i = 0; i < arrayNumbers.length; i++) {
            sumTotal += arrayNumbers[i]; // que es lo mismo que resultSum = resultSum + arrayNumber[1];
            // la suma es igual a la suma (que empieza en cero) más lo que valga i en esa vuelta de ciclo
            // se acumulará el valor de suma en cada ciclo.
        }

        System.out.printf("La suma de los elementos del arreglo es %d", sumTotal);
    }
}
