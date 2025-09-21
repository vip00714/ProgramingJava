package BinarySearch;

public class MountainArray {

    public static void main(String[] args) {
        int[] inArray = {1,7,6,5,3};
        System.out.println(peakIndex(inArray));
        
    }

    static int peakIndex (int[] inArray) {

        int left = 0;
        int right = inArray.length - 1;

        while (left < right) {

            int mid = left + (right - left)/2;

            if (inArray[mid] < inArray[mid+1]) {
                left = mid +1;
            }
            if (inArray[mid] > inArray[mid+1]) {
                right = mid;
            }
        }

        return left;
    }
    
}
