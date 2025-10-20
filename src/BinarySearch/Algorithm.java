package BinarySearch;

import static Resources.HelperMethods.binarySearch;              //  Ways to import.

public class Algorithm {

    public static void main(String[] args) {
        int[] inArray = new int[]{7, 12, 15, 18, 20, 21};
        int[] inArrayDesc = new int[]{24, 21, 17, 15, 10, 9};

        System.out.println(binarySearch(inArray, 11, 0, inArray.length - 1));
        System.out.println(binarySearch(inArrayDesc, 21, 0, inArray.length - 1));

        System.out.println(recursiveBinarySearch(inArray, 20, 0, inArray.length - 1));

    }


    static int multipleIndexesBinarySearch(int[] inArray, int number, boolean isLeft) {

        int left = 0;
        int right = inArray.length - 1;
        int index = -1;
        boolean ascending = inArray[0] < inArray[inArray.length - 1];

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (number == inArray[mid]) {

                if (isLeft) {
                    index = mid;
                    right = mid - 1;
                } else {
                    index = mid;
                    left = mid + 1;
                }

            } else {

                if (ascending) {

                    if (number < inArray[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    if (number < inArray[mid]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }

            }

        }
        return index;
    }

    static int recursiveBinarySearch(int[] inArray, int target, int left, int right) {

        // Base/Termination Condition

        if (left > right) {
            return -1;       // because if element is found, it would have caught below. Thus, no element found.
        }

        int mid = left + (right - left) / 2;

        if (target == inArray[mid]) return mid;

        if (target < inArray[mid]) {

            return recursiveBinarySearch(inArray, target, left, mid - 1);

        } else {
            return recursiveBinarySearch(inArray, target, mid + 1, right);
        }
    }
}
