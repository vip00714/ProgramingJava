package OOPrograming;

import java.util.Arrays;

/*
    1. All the things left of '=' happens at the compile time & right side of it happens at the run-time.
    2. 'new' keyword allocates memory at run time.
    3. It allocates memory (heap) dynamically and returns a reference to it, and this reference is stored in reference variable 'ob'.
    4. Variables inside the object is known as instance variables.
    5. In Java, default value of an object is null.
 */

public class Oop1 {

    static class Student { // This is an inner class, thus declared static.

        int id;
        String name;
        Float marks;

        public Student(int n, String s, Float f) {
            this.id = n;
            this.name = s;
            this.marks = f;

        }

    }

    public static void main(String[] args) {

        Oop1 s11 = new Oop1();
        /*
         Here s11 is the reference variable pointing to the object 'new Oop1()'.
         Thus in the scenario,
         Student1 st1 = new Student1();
         Student st2 = st1;
         Here st1 and st2 is pointing to same object, thus changing object will change
         value of both st1 and st2.
         */

        Student[] s1 = new Student[3];
        System.out.println(Arrays.toString(s1));

        Student ref1 = new Student(1, "vipul", 32.0f);
        // or
        Student ref2 = new Student(1, "vipul", 32.0f);

        // Oop1.Student st1 = s11.new Student(1, "vipul", 32.0f); // if inner class is not declared static.

        class Student1 {

            int rNo1;
            String name1;
            float marks = 50.0f;
        }

        Student1[] ob = new Student1[5];
        Student1 ob1 = new Student1();
        ob1.marks = 23.4f;

        System.out.println(ob1.marks);
        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(Arrays.toString(ob));

    }

}
