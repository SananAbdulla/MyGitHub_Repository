package day38_a_abstraction_interface.methods;

public interface Mac {

    /*
          everything in interface is public
          all the variables are public static final
          all the method are without body -> public abstract
          possibly to have default and static method
          interface cannot have constructor
          cannot have any blocks - static blocks

     */

    // We can have total 4 things in interface

    //1. Static variables
    String NAME = "Apple";
    String OS = "Ios";


    // 2. public abstract method
    void turnOn();


    // 3. public static method
    static void company() {
        System.out.println("Company name : "+ NAME);
        System.out.println("Operating system : " + OS);
    }

    //4. default method | default is not the access modifier in interface
    default void faceTime() {
        System.out.println("Calling with Facetime");
    }
}

