package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] inArray = { 8, 3, 4, 12, 5, 6 };
        int [] inArray2 = {5,4,3,2,1};

        System.out.println(Arrays.toString(mergeSort(inArray)));
        mergeSortInPlace(inArray2, 0, inArray2.length);
        System.out.println(Arrays.toString(inArray2));


    }

    static int[] mergeSort(int inArray[]) {

        if (inArray.length == 1) {
            return inArray;
        }

        int mid = inArray.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(inArray, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(inArray, mid, inArray.length));
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {

        int[] newArray = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                newArray[k] = left[i];
                i++;
            } else {
                newArray[k] = right[j];
                j++;
            }
            k++;
        }

        // It is possible that one of the arrays is not complete, then copy the
        // remaining elements.

        while (i < left.length) {
            newArray[k] = left[i];
            i++;
        }

        while (j < right.length) {
            newArray[k] = right[j];
            j++;
        }

        return newArray;
    }

// No copy of orignal array, modify the orignal array only.

    static void mergeSortInPlace(int inArray[], int left, int right) {   // void because no array is returned, orignal array is only
                                                                         // being modified.

        if ((right - left) == 1) {
             return;
        }
        int mid = left + (right - left)/2;

        mergeSortInPlace(inArray, left, mid);
        mergeSortInPlace(inArray, mid, right);
       
        mergeInPlace(inArray, left, mid, right);
    }

    static void mergeInPlace(int[] inArray, int left, int mid, int right) {

        int[] newArray = new int[right - left];
        int i = left, j = mid, k = 0;


        while (i < mid && j < right) {
            if(inArray[i] < inArray[j]) {
                newArray[k] = inArray[i];
                i++;
            } else {
                newArray[k] = inArray[j];
                j++;
            }
            k++;

        }

        while (i < mid) {
            newArray[k] = inArray[i];
            i++;
            k++;
        }

        while (j < right) {
            newArray[k] = inArray[j];
            j++;
            k++;
        }

        for (int l = 0; l < newArray.length; l++) {
            inArray[left + l] = newArray[l];               // can use Arrays.copyOf to optimize. 
        }
       

        
    }














}
