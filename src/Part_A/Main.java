package Part_A;

import java.util.ArrayList;

/** test program to check how implementation
 * and extends are called in the inner-working*/
public class Main {

    /** Test program*/
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        Derived2 derived2 = new Derived2();
        Separate separate = new Separate();


        System.out.println("\nbase:");
        base.m1();
        base.m1();
        base.m2("hello");

        System.out.println("\nderived:");
        derived.m1();
        derived.m2("hello2");
        derived.m3();

        System.out.println("\nderived2:");
        derived2.m1();
        derived2.m2("hello3");
        derived2.m3();

        System.out.println("\nseparate:");
        separate.m1();
        separate.m2("hello");
        separate.m3();

        ArrayList<Base> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(new Base());
        }
        arrayList.add(new Derived());
        arrayList.add(new Derived2());

        System.out.println("\nm2 of arraylist:");
        for (Base obj : arrayList){
            obj.m2("hello");
        }
    }
}
