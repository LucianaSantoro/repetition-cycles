package ar.com.ar.online.second.repetitioncycles;

import java.util.Scanner;

public class RepetitionCycleExerciseTwo {

    public static void main(String[] args) {

        // Se requiere un algoritmo para obtener un vector (C) de N elementos que contenga la
        //suma de los elementos correspondientes de otros dos vectores (A y B).

        // no lo igual a "New int[]" porque el usuario debe ingresar el tamaño del array.
        // Además, debe solicitarse el tamaño y colocarse en una variable. Declaracion != inicialización
        //int arrayNumbersA[] = new int[];
        //int arrayNumbersB[] = new int[];
        // int arrayNumbersC[] = new int[];

        int[] arrayA;
        int[] arrayB;
        int[] arrayC;
        int sizeArray;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de los arreglos: ");
        sizeArray = keyboard.nextInt();

        // inicialización - en este caso los arrays son todos del mismo tamaño.

        arrayA = new int[sizeArray];
        arrayB = new int[sizeArray];
        arrayC = new int[sizeArray];

        // llenado de variables

        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Ingrese el valor para el arreglo A en la posición " + i + ": ");
            arrayA[i] = keyboard.nextInt();
            System.out.print("Ingrese el valor para el arreglo B en la posición " + i + ": ");
            arrayB[i] = keyboard.nextInt();
        }

        //sumado de variables
        for (int i = 0; i < sizeArray; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        // mostrado de valor por ciclo de array
        System.out.println("El resultado de la suma de los elementos de los arreglos A y B es: ");
        for (int i = 0; i < sizeArray; i++) {
            System.out.printf("índice: %d, valor: %d ", i, arrayC[i]);
            arrayC[i] = arrayA[i] + arrayB[i];
        }

    }


}
