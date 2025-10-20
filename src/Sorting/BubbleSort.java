package Sorting;

import java.util.Arrays;

public class BubbleSort {

    static int[] bubbleSort( int[] inArray) {

        for (int i = 0; i < inArray.length; i++) {
            for (int j = 1; j < inArray.length-i; j++) {
                if (inArray[j] < inArray[j-1]) {
                    Resources.HelperMethods.swap(inArray, j, j-1 );
                }

            }
        }

        return inArray;
    }

    static void recursiveBubbleSort(int[] inArray, int i, int j) {
        if (i == 0) {
            return;
        }
        if (j < i ) {
            if (inArray[j] < inArray[j - 1]) {
                int temp = inArray[j];
                inArray[j] = inArray[j-1];
                inArray[j-1] = temp;
                recursiveBubbleSort(inArray, i, j+1);

            }

        } else {
            recursiveBubbleSort(inArray, i-1, 1);
        }

    }

    public static void main(String[] args) {

           int[] inArray = {5, 4, 3, 2, 1, 0};
           System.out.println(Arrays.toString(bubbleSort(inArray)));
//           recursiveBubbleSort(inArray, inArray.length, 1);
//           System.out.println(Arrays.toString(inArray));

    }

}
