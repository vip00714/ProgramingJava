package OOPrograming.Principles;

import OOPrograming.AccessControl.A;

public class SubClass2 extends A {

    public SubClass2() {
        
    }

    public static void main(String[] args) {

        SubClass2 sca = new SubClass2(); 
        System.out.println(sca.arr[0]); 
        A objt = new A();
        System.out.println(objt.name);
        // int n = objt.num; 
        // not visible as num is protected and objt is not subclass of A.  

    }
}
