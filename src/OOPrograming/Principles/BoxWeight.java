package OOPrograming.Principles;

/*
 * 1. extends keyword means child class (StudentData) inherit all the properties of parent class (School).
 * 2. Although, class BoxWeight inherit all the properties from the parent class, but it does not have access 
 *    of the properties which are declared as private.
 */

public class BoxWeight extends Box {

    int w;

    // By default, all the properties of parent class are also inherited.

    public BoxWeight(double length, double breadth, double height, int weight) {

        super(length, breadth, height);   // superclass variables need to initialise first.
                                          // if not defined, then default one will be called.

        /* names of argument and constructors should be same.
         It is calling constructor from parent class, thus, over there, a constructor should be present. 
        */ 
        this.w = weight;

    }


    public BoxWeight() {

        this.w = -1;

    }

    
    



    public BoxWeight(BoxWeight other) {
        super(other);    // because other has access to all the properties of Box
        this.w = other.w;
    }

    /*
       1. 'super keyword:' this is used to represent the class just above the given class.
       eg. if class C extends class B extends class A, then 'super' keyword in class C
       is used when calling properties of class B in constructor & 'super' keyword in class B
       is used when calling properties of class A in constructor.

       2. When comes to class A, 'super' keyword refer to Object class.
          Object class is by default super class to all the java classes.

       3. 'this' keyword is different from 'super' keyword as it is useful when superclass 
          has property same as the child class.
     */

    public static void main(String[] args) {

        Box box = new Box();

        System.out.println(box);

        BoxWeight boxWeight = new BoxWeight();
        System.out.println(boxWeight.l);  // it has access to all the properties of superclass except private
    }

}
