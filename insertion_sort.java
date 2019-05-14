package sorting.algo.practive;

import java.util.Arrays;

public class insertion_sort
{
    public static void main(String[] args){
        int[] array_to_sort = {5, 10, -10, 55, -100, 6, 66, 60};
        arrayToPrint(array_to_sort);
        insertionSort(array_to_sort);
    }



    public static void arrayToPrint(int[] peram)
    {
        System.out.println(Arrays.toString(peram));
    }

    public static void insertionSort(int[] arry){
        int firstSortedIndex =0;
        int currentElement;

        for(int unsorted_index = firstSortedIndex+1;unsorted_index<arry.length;unsorted_index++){

            currentElement = arry[unsorted_index];
            int sorted_index;
            boolean counter = false;

            for( sorted_index = firstSortedIndex;sorted_index>0 && arry[unsorted_index] < arry[sorted_index];sorted_index--)
            {
                arry[sorted_index+1] = arry[sorted_index];
                counter = true;

            }
            if(counter)arry[sorted_index] = currentElement;
            firstSortedIndex++;
        }
    }
}
