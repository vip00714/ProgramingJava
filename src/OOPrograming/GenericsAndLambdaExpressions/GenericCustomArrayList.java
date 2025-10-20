package OOPrograming.GenericsAndLambdaExpressions;

import java.util.Arrays;

public class GenericCustomArrayList<T> {

    private Object[] list;
    private static final int DEFAULT_SIZE = 10;
    private Integer size = 0;    // It acts as an index of list.

    public GenericCustomArrayList() {
        this.list = new Object[DEFAULT_SIZE];
        // T cannot be used directly as Type parameters (Generics) cannot be instantiate directly.
        // Thus Object is used as it is supertype of all classes.


    }

    public void add (T number) {
        if (isFull()) {
            resize();
        }
        list[size++] = number;
    }

    public Object remove() {              // decreases the sixe by one and returns the last removed value.

        Object removed = list[--size];
        return removed;
    }

    @Override
    public String toString() {
        return "{CustomArrayList{ " + "list= " + Arrays.toString(list) + ", size is " + size + "}";
    }

    // Helper methods

    private boolean isFull() {
        return size == list.length;
    }

    private void resize () {
        Object[] temp = new Object[2* list.length];

        for(int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        list = temp;

    }

    public static void main(String[] args) {

        GenericCustomArrayList<Character> lst = new GenericCustomArrayList();

        String city = "FaridabadAndAgra";

        for (int i = 0; i < city.length(); i++) {
            lst.add(city.charAt(i));
        }
        System.out.println(lst.toString());




    }
}
