package sorting.algo.practise;

import java.util.Arrays;

/*
* Task Breakdown for Quick sort
* select the pivot element
* Partition the array with the pivot element.
* Element Grater than pivot element | Pivot Element | Element Less than pivot element.
* */
public class quick_sort
{
    public static void main(String[] args)
    {
        System.out.println("Quick Sort is in action");
        int[] array_to_sort = {5, 10, -10, 55, -100, 6, 66, 60};
        sortingQuick(array_to_sort,0,array_to_sort.length);
        arrayToPrint(array_to_sort);


    }

    public static void sortingQuick(int[] arry,int start,int end)
    {
        // if we get One element array than we do not need to do anything
        if(end-start<2)
        {
            return;
        }
        // if we get more than one element array , we have to determine the index of the pivot
        int pivot_index = partition(arry,start,end);
        sortingQuick(arry,start,pivot_index);
        sortingQuick(arry,pivot_index+1,end);



    }

    //{5, 10, -10, 55, -100, 6, 66, 60}
    public static int partition(int[] arry,int start,int end)
    {
        // using the first element as the pivot
        int pivot = arry[start]; // it is the first element of the array or the sub array. NOT necessary index ZERO of a array or sub array
        int i = start;
        int j = end;

        /*
        * Then we are going to Traverse.
        * j traverse from Right to left
        * i traverse from left to Right
        * */

        while(i<j)
        {
            //j will look for element , smaller than tha pivot
            // i will look for element, Grater than the pivot

            /*
            * Empty LOOP. we want the loop to fall out(Make the 'pivot <= arry[--j]' condition false) when array element will be less than the pivot
            * if we find  5 <= 66 → Then the loop will continue.
            * if we find  5 <= -100 → Then the loop will Break.
            *
            * */

            // given array →  {5, 10, -10, 55, -100, 6, 66, 60}
            while (i<j && pivot <= arry[--j] )
            {
                System.out.println("Decrementing j");
            }
            if(i<j)
            {
                arry[i] = arry[j];
            }


            while(i<j && pivot >= arry[++i])
            {
                System.out.println("Incrementing i");
            }
            if(i<j){
                arry[j] = arry[i];
            }


        }

        arry[j] = pivot;
        return j;

    }

    // printing the Array
    public static void arrayToPrint(int[] peram) {
        System.out.println(Arrays.toString(peram));
    }
}
