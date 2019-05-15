package practice.sort.com;

import java.util.Arrays;

public class insertion_sort
{
    public static void main(String[] args)
    {
        int[] array_to_sort = {5, 10, -10, 55, -100, 6, 66, 60, 1, 900, -1001};
        arrayToPrint(array_to_sort);
        insertionSort(array_to_sort);
        arrayToPrint(array_to_sort);
    }
    public static void arrayToPrint(int[] peram)
    {
        System.out.println(Arrays.toString(peram));
    }
    public static void insertionSort(int[] arry)
    {
        // setting the first sorted index to 0
        int firstSortedIndex = 0;
        int currentElement;
        // will check the UNSORTED portion 🔴🟢🟡
        for (int unsorted_index = firstSortedIndex + 1; unsorted_index < arry.length; unsorted_index++) {
            currentElement = arry[unsorted_index];
            int sorted_index;
            boolean counter = false;
            // will check the SORTED portion 🔴🟢🟡
            for (sorted_index = firstSortedIndex; sorted_index >= 0 && currentElement < arry[sorted_index]; sorted_index--) {
                arry[sorted_index + 1] = arry[sorted_index];
                counter = true;
            }
            if (counter) arry[sorted_index + 1] = currentElement;
            firstSortedIndex++;
        }
    }
}
