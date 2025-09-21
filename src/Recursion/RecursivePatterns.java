package Recursion;

public class RecursivePatterns {
    public static void main(String[] args) {

        recursivePattern2(2, 0);
        
        System.out.println();

        recursivePattern(2, 0);


    }

    static void recursivePattern(int i, int j) {

        if (i == 0) {
            return;
        }
        if (j < i) {
            System.out.print("*");
            recursivePattern(i, j + 1);
        } else {
            System.out.println();
            recursivePattern(i - 1, 0);
        }

    }

    static void recursivePattern2(int i, int j) {

        if (i == 0) {
            return;
        }
        if (j < i) {
                        
            recursivePattern2(i, j + 1);
            System.out.print("*");

        } else {

            recursivePattern2(i - 1, 0);
            System.out.println();
        }

    }


}
