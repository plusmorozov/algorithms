package algorithms;

import java.util.Arrays;

import static algorithms.SelectionSort.selectionSort;

public class MainAlgorithms {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] notSortedArray = {4, 2, 1, 33, 45, 3, 9, 98, 1, 2};
        printArray(notSortedArray);
        printArray(selectionSort(notSortedArray));
    }

    private static void printArray(int[] array) {
        for (int arrayElement : array) {
            System.out.print(arrayElement + " ");
        }
        System.out.println();
    }
}
