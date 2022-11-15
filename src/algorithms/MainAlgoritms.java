package algorithms;

import static algorithms.BinarySearch.runBinarySearch;

public class MainAlgoritms {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(runBinarySearch(sortedArray, 12));
    }
}
