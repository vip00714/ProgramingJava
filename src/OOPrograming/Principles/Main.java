package OOPrograming.Principles;

import OOPrograming.AccessControl.A;

public class Main {
    public static void main(String[] args) {

        BoxWeight boxWeight1 = new BoxWeight();
        System.out.println(boxWeight1.l + " " + boxWeight1.b + " " + boxWeight1.h + " " + boxWeight1.w);

        BoxWeight boxWeight2 = new BoxWeight(1, 2, 3, 4);
        System.out.println(boxWeight2);
        // To invoke this type of constructor, we have to initialise it in the class.

        Box box = new Box();
        System.out.println(box.l);

        /*
         * box.w (incorrect)
         * 1. (Imp) BoxWeight class can access all the properties of Box class (except
         * private ones)
         * but Box class cannot access the properties of BoxWeight class.
         * 2. Box box = new BoxWeight(1,2,3,4);
         * In this way also Box class cannot access the properties of BoxWeight class
         * because it is the type of reference variable which determines the access to
         * properties (except private).
         * 3. WeightBox boxweight = new Box(1,2,3);
         * This way we get error as child class reference variable and parent class
         * object is not allowed.
         * because we are calling the constructor of parent class which does not have
         * access to the properties
         * of child class.
         * 
         */

         A a = new A();
         // a.arr = new int[]{1,2,3,4,5};     not visible as arr is protected.


    }

}
