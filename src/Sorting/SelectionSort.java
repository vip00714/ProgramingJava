package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] inArray = { 5, 4, 3, 2, 1, 0 };

        // System.out.println(Arrays.toString(selectionSort(inArray)));
        System.out.println(Arrays.toString(recursiveSelectionSort(inArray, inArray.length, 0, 0)));

    }

    static int[] selectionSort(int[] inArray) {

        for (int i = 0; i < inArray.length; i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;

            for (int j = 0; j < inArray.length - i; j++) {
                if (inArray[j] > max) {
                    max = inArray[j];
                    maxIndex = j;
                }

            }
            BubbleSort.swap(inArray, maxIndex, inArray.length - i - 1);
        }

        return inArray;
    }

    static int[] recursiveSelectionSort(int[] inArray, int i, int j, int maxIndex) {

        // Base condition

        if (i == 0) {
            return inArray;
        }

        if (j < i) {
            if (inArray[j] > inArray[maxIndex]) {

                return recursiveSelectionSort(inArray, i, j + 1, j);

            } else {
                return recursiveSelectionSort(inArray, i, j + 1, maxIndex);

            }

        } else {
            int temp = inArray[maxIndex];
            inArray[maxIndex] = inArray[i-1];
            inArray[i-1] = temp;
            return recursiveSelectionSort(inArray, i - 1, 0, 0);
        }

    }

}