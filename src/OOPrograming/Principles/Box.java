package OOPrograming.Principles;

public class Box {

    double l;
    double b;
    double h;
    // int w;    for use of super keyword.

    public Box() {
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }
    // cube constructor

    public Box(double side) {
        this.l = side;
        this.b = side;
        this.h = side;
    }

    public Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    // object constructor

    public Box(Box box) {

        this.l = box.l;
        this.b = box.b;
        this.h = box.h;
    }

    public void info() {
        System.out.println("In the Box");
    }



}
