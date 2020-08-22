package ar.com.ar.online.second.repetitioncycles;

import java.util.Scanner;

public class RepetitionCyclesExerciseOneB {

    public static void main(String[] args) {

        // ejemplo con un solo FOR
        // Se requiere obtener la suma de las cantidades contenidas en un arreglo de 10 elementos.
        int resultSum = 0;
        int[] arrayNumbers = new int[10];

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.printf("Ingrese el valor para la posición %d de arreglo: ", i);
            arrayNumbers[i] = keyboard.nextInt();
            resultSum = resultSum + arrayNumbers[i];
        }

        System.out.printf("La suma de los elementos del arreglo es %d", resultSum);
    }
}
