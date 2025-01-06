package my_utilities;

import day33_b_encapsulation.access_modifiers.AccessModifiers;

public class AccessOutsidePackage {
    public static void main(String[] args) {


        AccessModifiers obj = new AccessModifiers();
        //obj.a= 10; // i can reach because a has public modifier
        System.out.println(obj.a); // i can reach because a has public modifier
      //  System.out.println(obj.b) // cannot access
    }
}
