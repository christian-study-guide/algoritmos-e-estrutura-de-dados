package algorithms.sort;

/**
 * Característica: O(n^2)
 */
public class BubbleSort {

    public int[] sort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public void printArray(int array[]) {
        for (final int object : array) {
            System.out.print(object + " ");
        }
    }
}