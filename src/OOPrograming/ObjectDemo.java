package OOPrograming;

class ObjectDemo {

    int v1;
    float v2;
    String v3;

    public ObjectDemo(int v1, float v2, String v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "This is Object Demo class";
    }

    @Override
    public boolean equals(Object obj) {
        return this.v1 == ((ObjectDemo) obj).v1 && this.v2 == ((ObjectDemo) obj).v2
                && this.v3.equals(((ObjectDemo) obj).v3);

    }

    @Override // hashcode internally gives some random value to the object,
              // but now here we are overriding it to give the value of v1.
    public int hashCode() {

        return v1;

    }

    public static void main(String[] args) {

        ObjectDemo objdm = new ObjectDemo(11, 0.5f, "Vipul");
        ObjectDemo objdm2 = new ObjectDemo(12, 0.55f, "Vip");

        if (objdm.hashCode() == objdm2.hashCode()) { // this only compares.
            System.out.println("Both objects have same hashcode");
        } else {
            System.out.println("Both objects have different hashcode");
        }

        if (objdm.equals(objdm2)) { // this is a method.
            System.out.println("Both objects are equal");
        } else {
            System.out.println("Both objects are not equal");
        }


        // what is the difference between = and == in java???

    }
}