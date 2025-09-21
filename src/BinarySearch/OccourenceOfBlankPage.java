package BinarySearch;

public class OccourenceOfBlankPage {

    static int firstOccourenceOfBlankPage() {

        int left = 0;
        int right = 10;

        while (left < right) {                 // left <= right 

            int mid = left + (right - left) / 2;

            if (isBlankPage(mid)) {
                right = mid;                   // right = mid-1
            } else {
                left = mid + 1;
            }
        }

        return left;

    }

    static boolean isBlankPage(int number) {

        int filledUpto = 1;

        if (number <= filledUpto) {
            return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(firstOccourenceOfBlankPage());
    }

}
