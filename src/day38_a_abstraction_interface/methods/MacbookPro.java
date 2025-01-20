package day38_a_abstraction_interface.methods;


import java.util.ArrayList;

// Concrete class
    public class MacbookPro implements Mac {
        @Override
        public void turnOn() {
            System.out.println("Macbook Pro is turned on.");
        }
    }


    class Runner {
        public static void main(String[] args) {

            // Reaching static members with Interface
            System.out.println(Mac.NAME);
            System.out.println(Mac.OS);

            System.out.println();
            // Reaching static members with Class
            System.out.println(MacbookPro.NAME);
            System.out.println(MacbookPro.OS);


            System.out.println();
            // Reaching abstract method with Interface name - NOT VALID
            // Mac.turnOn();
            // Reaching overridden method (instance method) with Class name - NOT VALID
            // MacbookPro.turnOn();
            MacbookPro mac = new MacbookPro();
            mac.turnOn();


            System.out.println();
            // Reaching static member with interface name - VALID
            Mac.company();
            // Reaching the static member with class name - NOT VALID
            // MacbookPro.company(); // ONLY can be called with its OWN intercase name
            // mac.company(); // ONLY can be called with its OWN intercase name


            System.out.println();
            // Reaching the default method with intercase name - NOT VALID
            // Mac.faceTime(); // non-static canNOT be called by Interface name
            // Reaching the default method with class name - NOT VALID
            // MacbookPro.faceTime(); // non-static canNOT be called by Class name
            mac.faceTime();

//            ArrayList<Integer> numbers = new ArrayList<>();
//            numbers.add(33);
//            numbers.add(45);
//            numbers.add(0, 30);
//            numbers.set(0, 20);
//
//
//            System.out.println(numbers);
//
//            String[] fruitsArray = {"Apple", "Banana", "Cherry", "Mango"};
//            ArrayList<String> fruitsList = new ArrayList<>();
//
//            for (String fruit : fruitsArray) {
//                fruitsList.add(fruit);
//
//            }
//
//            System.out.println(fruitsList);






        }
    }


