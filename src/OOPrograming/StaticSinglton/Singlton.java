package OOPrograming.StaticSinglton;

public class Singlton {

    private static Singlton instance;

    /*
      1. Singleton class is a class for which we are allowed to create only one
      object. Thus logical thinking is that don't allow the constructor of that
      class to be
      called.
     */

    private Singlton() { // Now this constructor can be called in this file only,
                         // cannot be called from other class.

    }

    public static Singlton getInstance() {
        // check wether one instance is created or not
        if (instance == null) {

            instance = new Singlton();

        }
        return instance;

    }

    public static void main(String[] args) {

    }

}
