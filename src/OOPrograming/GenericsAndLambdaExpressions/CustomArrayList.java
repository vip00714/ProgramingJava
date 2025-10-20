package OOPrograming.GenericsAndLambdaExpressions;

import java.util.Arrays;

public class CustomArrayList {

    private Integer[] list;
    private static final int DEFAULT_SIZE = 10;
    private Integer size = 0;    // It acts as an index of list.

    public CustomArrayList() {
        this.list = new Integer[DEFAULT_SIZE];

    }

    public void add (Integer number) {
        if (isFull()) {
            resize();
        }
        list[size++] = number;
    }

    public Integer remove() {              // decreases the sixe by one and returns the last removed value.

        Integer removed = list[--size];
        return removed;
    }

    @Override
    public String toString() {
        return "{CustomArrayList{ " + "list= " + Arrays.toString(list) + ", size is" + size + "}";
    }

    // Helper methods

    private boolean isFull() {
        return size == list.length;
    }

    private void resize () {
        Integer[] temp = new Integer[2* list.length];

        for(int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        list = temp;

    }

    public static void main(String[] args) {

        CustomArrayList lst = new CustomArrayList();

        for (int i = 1; i < 15; i++) {
            lst.add(i);
        }
        System.out.println(lst.toString());




    }
}
