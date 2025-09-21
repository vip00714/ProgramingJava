package OOPrograming.StaticSinglton;

public class Static {

    // Packages: They are containers which stores classes.

    int age;
    String name;
    double weight;
    static long population;

    public Static(int a, String n, double w) {
        this.age = a;
        this.name = n;
        this.population += 1; // 'StaticSingleton.population'is the correct way to acces static variables.

    }

    /*  

    1. When a variable is declared static, it can be accessed before any of the
     object of that class is created and without referencing to that object or any object.

    2. static variables and methods belong to the class not its object.

    */

    void greet() {
        System.out.println("Hello");
        fun(); // we can call static methods inside non-static ones
    }

    static void fun() {
        
    /*

    greet(); Incorrect as it requires an instance

     5. We cannot call a non-static method inside a static method.
     6. We cannot access a non-static stuff without referencing their instances in
        a static context.

        Static ob = new Static(12, "Ann", 34.2);
        ob.greet();

     */

    }

    void fun2() {
        greet();
    }

    public static void main(String[] args) { // static because it is to run before any object of the class is created.

        Static obj = new Static(12, "Ann", 34.2);
        Static obj1 = new Static(22, "Mnn", 41.2);
        Static obj3 = new Static(26, "Snn", 42);
        System.out.println(Static.population);

        // greet(); // incorrect
        obj.greet(); // correct

        /* 

        3. we cannot access non-static methods/variables inside the static method.
        4. static variables/object belongs to the class and non-static
           variables/methods belongs to a object.

         fun2();

        8. cannot call a non-static method directly.
        9. we cannot use 'this' keyword in static context. Because this represents is to represent an object
        
        */
        Singlton ob = Singlton.getInstance();


    }

}
