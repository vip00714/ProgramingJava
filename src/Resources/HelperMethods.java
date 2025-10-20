package Resources;

public class HelperMethods {

    // Array elements swap

    public static void swap (int[] arr, int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Binary Search Algorithm.

    public static int binarySearch (int[] inArray, int target, int left, int right) {

        left = 0;
        right = inArray.length-1;
        boolean ascending = inArray[0] < inArray[inArray.length - 1];

        while (left <= right) {  // = ensures loop runs one more time when target is found

            int mid = left + (right - left)/2;

            if (target == inArray[mid]) {
                return mid;
            }

            if (ascending) {

                if (target < inArray[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target < inArray[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;      // element not found, thus,return negative index.z

    }
}
