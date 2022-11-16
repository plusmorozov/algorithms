package algorithms;

public class SelectionSort {
    public static int[] selectionSort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    indexMin = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[indexMin] = temp;
        }
        return array;
    }
}
