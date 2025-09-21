package OOPrograming.StaticSinglton;

public class StaticInitialisation {

    static int a = 4;
    static int b;

    static {
        System.out.println("Static Block");
        b = a * 5;
    }

    /*

     1. static block is initialised when class. is loaded in main methods even
        before the object is created. static BloCK is initialised only once when the class is loaded for the first time.
        
    */

    public static void main(String[] args) {

        System.out.println(a + " " + b);
        StaticInitialisation.a += 3;
        System.out.println(a + " " + b); // here b is not changed as static block is initialised once.

    }

}
