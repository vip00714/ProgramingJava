package BinarySearch;

import java.util.Arrays;

public class FirstAndLastIndex {


    static int[] firstAndLastIndex(int[] inArray, int number) {

        int[] result = new int[2];

        result[0] = Algorithm.multipleIndexesBinarySearch(inArray, number, true);
        result[1] = Algorithm.multipleIndexesBinarySearch(inArray, number, false);


        return result;
    }
    public static void main(String[] args) {
        
        int inArray[] = {1, 3, 3, 3, 3, 7};
        int result[] = firstAndLastIndex(inArray, 3);
        System.out.println(Arrays.toString(result));
    }
    
}
