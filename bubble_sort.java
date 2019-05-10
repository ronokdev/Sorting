package sorting.algo.practive;

import com.sun.istack.internal.XMLStreamReaderToContentHandler;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array_to_sort = {5, 10, -10, 55, -100, 6, 66, 60};
        sortingbubble(array_to_sort);
        arrayToPrint(array_to_sort);
    }

    public static void sortingbubble(int[] peram) {
        /*
         * Normal System
         * Not so efficient
         * */
        //firstSystem(peram);


        /*
         * Efficient than first System.
         * */
        secondSystem(peram);

    }

    public static void secondSystem(int[] peram) {
        for (int i = peram.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                swap(peram, j, j + 1);
            }
        }
    }

    public static void firstSystem(int[] peram) {
        for (int i = 0; i < peram.length; i++) {
            for (int j = 0; j < peram.length - 1; j++) {
                swap(peram, j, j + 1);
            }
        }
    }

    //swaping the value
    public static void swap(int[] peram, int i, int j) {
        if (peram[i] == peram[j]) return;
        if (peram[i] > peram[j]) {
            int temp = peram[j];
            peram[j] = peram[i];
            peram[i] = temp;
        }
    }

    // printing the Array
    public static void arrayToPrint(int[] peram) {
        System.out.println(Arrays.toString(peram));
    }
}
