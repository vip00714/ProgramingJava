package BinarySearch;

public class FindInInfiniteArray {

    public static void main(String[] args) {
        int[] inArray = { 2, 3, 5, 6, 7, 8, 10, 11, 15, 20, 23, 31, 33 };
        System.out.println(findInInfinite(inArray, 7));

    }

    static int findInInfinite(int[] inArray, int number) {

        int left = 0;
        int right = 1;

        while (inArray[right] < number) {

            int temp = right;
            right = right + 2 * (right - left + 1); // +1 because we r doing 2*(size of previous block)
            left = temp + 1;

        }
        return Algorithm.binarySearch(inArray, number, left, right);

    }

}
