package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] inArray = {3, 5, 2, 1, 4};
        int[] inArray2 = {3, 5, 2, 1, 4, 0};
        System.out.println(Arrays.toString(cycleSortFirstIndex(inArray)));
        System.out.println(Arrays.toString(cycleSortZeroIndex(inArray2)));


    }

    public static int[] cycleSortFirstIndex(int[] inArray) {               // Array does not contains zero.

        for (int i = 0; i < inArray.length - 1; i++) {
            while (inArray[i] != inArray[inArray[i] - 1]) {
                int temp = inArray[i];
                int correctIndex = inArray[i] - 1;
                inArray[i] = inArray[correctIndex];
                inArray[correctIndex] = temp;

            }
        }
        return inArray;

    }







    // value = index + 1;


    public static int[] cycleSortFirstIndex2(int[] inArray) {

        int i = 0;

        while (i < inArray.length) {

            if (inArray[i] != inArray[inArray[i] - 1]) {    // value is not at correct index.

                int temp = inArray[inArray[i] - 1];
                inArray[inArray[i] - 1] = inArray[i];
                inArray[i] = temp;

            } else {
                i++;
            }
        }

        return inArray;
    }

    static int[] cycleSortZeroIndex2(int[] inArray) {

        // Array to sort should have a value 0 at one of its index

        int i = 0;
        while (i < inArray.length) {

            if (inArray[i] != inArray[inArray[i]]) {
                int temp = inArray[inArray[i]];
                inArray[inArray[i]] = inArray[i];
                inArray[i] = temp;

            } else
                i++;
        }
        return inArray;

    }

    
    // Because, if all values are at correct index, thn missing number is
    // inArray.length;




    static int[] cycleSortZeroIndex(int[] inArray) {                 // Array does contain zero.

        for (int i = 0; i < inArray.length - 1; i++) {
            while (inArray[i] != inArray[inArray[i]]) {
                int temp = inArray[i];
                int correctIndex = inArray[i];
                inArray[i] = inArray[correctIndex];
                inArray[correctIndex] = temp;

            }
        }
        return inArray;

    }

}
