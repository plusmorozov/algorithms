package algorithms;

public class BinarySearch {
    public static int runBinarySearch(int[] sortedArray, int key) {
        int low = 0;
        int hight = sortedArray.length - 1;
        while (low <= hight) {
            int middle = (hight + low) / 2;
            if (sortedArray[middle] == key) {
                return middle;
            }
            if (sortedArray[middle] < key) {
                low = middle + 1;
            } else {
                hight = middle - 1;
            }
        }
        return -1;
    }
}
