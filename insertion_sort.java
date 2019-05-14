package practice.sort.com;

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

          for(int i = firstSortedIndex+1;i<arry.length;i++){     // unsorted part
              currentElement = arry[i];
              for(int j = firstSortedIndex;j>=0 && arry[i] > arry[j];j--) // sorted Part
              {
                    arry[j] = arry[j+1];

              }
              firstSortedIndex++;
          }
    }

}
