package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] inArray = {5,4,3,2,1};
        quickSort(inArray, 0, inArray.length-1);
        System.out.println(Arrays.toString(inArray));

    }

    static void quickSort(int[] inArray, int low, int high) { // void because orignal array is being modified.

        // find pivot such that left side of pivot is less than pivot & right side of
        // pivot
        // is greater than the pivot.

        // Base Condition
        if (low >= high) {
            return;
        }

        int left = low;
        int right = high;

        int mid = left + (right - left) / 2;
        int pivot = inArray[mid];

        while (left <= right) {

            while (inArray[left] < pivot) {
                left++;
            }
            while (inArray[right] > pivot) {
                right--;
            }

            while (left <= right) {    // This is the reason, if array is sorted, it will not swap, unlike merge sort.
                // swap
                int temp = inArray[left];
                inArray[left] = inArray[right];
                inArray[right] = temp;
                left++;
                right--;
            }

        }
        // now pivot is at correct index, perform quick sort. 
        quickSort(inArray, low, right);         // why not low - left & right - high ??
        quickSort(inArray, left, high);

    }
}
