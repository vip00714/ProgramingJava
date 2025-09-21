package BinarySearch;

public class CeilingFloorAndBoundConditions {
    public static void main(String[] args) {

        int[] inArray = new int[] {7, 12, 15, 18, 20, 21 };
        int[] inArrayDesc = new int[] { 24, 21, 17, 15, 10, 9 };

        System.out.println(floorOfNumber(inArray, 6 ));
        System.out.println(floorOfNumber(inArrayDesc, 26 ));
        
    }

    /*
     * 1. Ceiling of a number is the smallest number greater or equal to the target
     * number.
     * 2. Floor of a number is the greatest number smaller or equal to the target
     * element.
     */

    static int ceilingOfNumber(int[] inArray, int number) {

        int left = 0;
        int right = inArray.length - 1;
        boolean ascending = inArray[0] < inArray[inArray.length - 1];

        while (left <= right) {                // '=' ensures index goes out of the bonds when target number is greater than the 
                                               // greatest element of array or smaller than the smallest element of the array

            int mid = left + (right - left) / 2;

            if (number == inArray[mid]) {
                return inArray[mid];
            }

            if (ascending) {
                if (number < inArray[mid]) {
                    right = mid - 1;
                }
                if (number > inArray[mid]) {
                    left = mid + 1;
                }
            } else { 

                if (number < inArray[mid]) {
                    left = mid + 1;
                }
                if (number > inArray[mid]) {
                    right = mid - 1;
                }

            }

        }
        if (ascending) {
            if (left > inArray.length-1) {
            return inArray[0];
        }
            return inArray[left];
        } else {
            if (right == -1) {
            return inArray[inArray.length-1];
        }
            return inArray[right];
        }
        

    }

    static int floorOfNumber(int[] inArray, int number) {

        int left = 0;
        int right = inArray.length - 1;
        boolean ascending = inArray[0] < inArray[inArray.length - 1];

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (number == inArray[mid]) {
                return inArray[mid];
            }

            if (ascending) {
                if (number < inArray[mid]) {
                    right = mid - 1;
                }
                if (number > inArray[mid]) {
                    left = mid + 1;
                }
            } else {

                if (number < inArray[mid]) {
                    left = mid + 1;
                }
                if (number > inArray[mid]) {
                    right = mid - 1;
                }

            }

        }
        if (ascending) {
            return inArray[right];
        } else
            return inArray[left];
    }
    
}
