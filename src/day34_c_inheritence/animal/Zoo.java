package day34_c_inheritence.animal;

// Runner class

public class Zoo {
    public static void main(String[] args) {


        Dog dog1= new Dog();
        dog1.type = "German Shepherd";
        dog1.numOfLegs = 4;
        dog1.bark();
        dog1.walk();
        dog1.setAge(30);
        System.out.println("dog is " +  dog1.getAge() + " old");
        //dog1.meow(); In dog class there is not meow method

        Cat cat1 = new Cat ();
        cat1.type = "Scotish";
        cat1.numOfLegs = 4;
        cat1.walk();
        cat1.meow();
        cat1.getAge();
        //cat1.bark();  // In cat class there is not bark method


       Animal animal1 = new Animal();
        animal1.type = "General Animal";
        animal1.numOfLegs = 4;
        animal1.walk();
        animal1.getAge();


    }
}
