package sorting.algo.practive;

import java.util.Arrays;

public class selectionSort
{
    public static void main(String[] args)
    {
        int[] array_to_sort = {5, 10, -10, 55, -100, 6, 66, 60};
        arrayToPrint(array_to_sort);
        selectionSort(array_to_sort);
        arrayToPrint(array_to_sort);

    }

    //Doing selection sort
    public static void selectionSort(int[] arry)
    {
        for (int last_array_index = arry.length - 1; last_array_index > 0; last_array_index--)
        {
            int largest_index = 0;

            for (int i = 1; i <= last_array_index; i++)
            {
                if (arry[i] > arry[largest_index]) {
                    largest_index = i;

                }
            }
            swap(arry, largest_index, last_array_index);
        }

    }

    //swaping the value
    public static void swap(int[] peram, int i, int j)
    {
        if (peram[i] == peram[j]) return;
        if (peram[i] > peram[j]) {
            int temp = peram[j];
            peram[j] = peram[i];
            peram[i] = temp;
        }
    }

    // printing the Array
    public static void arrayToPrint(int[] peram)
    {
        System.out.println(Arrays.toString(peram));
    }
}
