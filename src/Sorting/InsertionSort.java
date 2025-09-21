package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {5,4,3,2,1,0};

        System.out.println(Arrays.toString(inSertionSort(array)));
        
    }

    static int [] inSertionSort (int[] inArray) {

        for (int i = 0; i < inArray.length - 1; i++) {
            for (int j = i+1; j>0; j--) {
                if (inArray[j] < inArray[j-1]) {

                    BubbleSort.swap(inArray, j, j-1);

                }
            }
        }
        return inArray;
        }
    
}

//  optumize this algo with the help of break to avoid unnecessary checks for swaps