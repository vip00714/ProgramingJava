package OOPrograming.StaticSinglton;

public class InnerClasses {

    // 1. Outside classes cannot be static. Only inner classes can be static.
    public static void main(String[] args) {
        // Inner1 in = new Inner1(); (incorrect if Inner1 is non-static;)
        Inner1 in = new Inner1("Vipul");
        Inner2 inn = new Inner2();
        System.out.println(in);
        System.out.println(inn);

    }

    static class Inner1 { // this is an inner class and we cannot use it directly in psvm of outer class
                          // as, it depends on the objects of outer class.

        String name = "Vipul";

        public Inner1(String name) {
            this.name = name;
        }

    }
}

class Inner2 { // this is an outside class thus we can use it directly in psvm of outer class
               // as, it does not depend on the objects of outer class i.e. InnerClasses.

    public String toString() {
        return "To String Object";
    }

}
