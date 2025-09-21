package OOPrograming.AccessControl;

public class SubClass1 extends A  {

    public SubClass1(int num, String name, int[] arr) {
        super.num = num;
        super.name = name;
        super.arr = arr;
    }
    public static void main(String[] args) {
        
        SubClass1 sca = new SubClass1(10, "Vipul", new int[]{1,2,3});
        System.out.println(sca.arr[0]);
    }


}
